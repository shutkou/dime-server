/*
 * Copyright 2013 by the digital.me project (http://www.dime-project.eu).
 *
 * Licensed under the EUPL, Version 1.1 only (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */

package eu.dime.ps.communications.requestbroker.controllers.infosphere;

import ie.deri.smile.vocabulary.NIE;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.commons.lang.StringUtils;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import eu.dime.commons.dto.Data;
import eu.dime.commons.dto.Request;
import eu.dime.commons.dto.Response;
import eu.dime.commons.dto.SharedTo;
import eu.dime.commons.dto.TrustEntry;
import eu.dime.ps.controllers.exception.InfosphereException;
import eu.dime.ps.controllers.infosphere.manager.AccountManager;
import eu.dime.ps.controllers.infosphere.manager.DataboxManager;
import eu.dime.ps.controllers.infosphere.manager.PersonGroupManager;
import eu.dime.ps.controllers.infosphere.manager.PersonManager;
import eu.dime.ps.controllers.infosphere.manager.SharingManager;
import eu.dime.ps.dto.Databox;
import eu.dime.ps.dto.Include;
import eu.dime.ps.dto.Resource;
import eu.dime.ps.gateway.service.MediaType;
import eu.dime.ps.semantic.model.dao.Account;
import eu.dime.ps.semantic.model.nfo.DataContainer;
import eu.dime.ps.semantic.model.pimo.Agent;
import eu.dime.ps.semantic.model.pimo.Person;
import eu.dime.ps.semantic.model.ppo.PrivacyPreference;
import eu.dime.ps.semantic.privacy.PrivacyPreferenceType;

/**
 * Dime REST API Controller for a InfoSphere Methods to access on Databox
 * features
 * 
 * @author <a href="mailto:mplanaguma@bdigital.org"> Marc Planaguma
 *         (mplanaguma)</a>
 * 
 */
@Controller
@Path("/dime/rest/{said}/databox/")
public class PSDataboxController extends PSSharingControllerBase implements APIController {

	private static final Logger logger = LoggerFactory.getLogger(PSDataboxController.class);
	private static final Map<URI, String> RENAMING_RULES;
	static {
		RENAMING_RULES = new HashMap<URI, String>();
		RENAMING_RULES.put(NIE.hasPart, "items");
	}

	private DataboxManager databoxManager;
	private AccountManager accountManager;
	private PersonManager personManager;
	private PersonGroupManager personGroupManager;
	private SharingManager sharingManager;

	public void setDataboxManager(DataboxManager databoxManager) {
		this.databoxManager = databoxManager;
	}

	public void setAccountManager(AccountManager accountManager) {
		this.accountManager = accountManager;
	}

	public void setPersonManager(PersonManager personManager) {
		this.personManager = personManager;
	}

	public void setPersonGroupManager(PersonGroupManager personGroupManager) {
		this.personGroupManager = personGroupManager;
	}

	public void setSharingManager(SharingManager sharingManager) {
		this.sharingManager = sharingManager;
	}

	@Override
	public PersonManager getPersonManager() {
		return this.personManager;
	}

	@Override
	public AccountManager getAccountManager() {
		return this.accountManager;
	}

	@Override
	public PersonGroupManager getPersonGroupManager() {
		return this.personGroupManager;
	}

	/**
	 * Retrieves all DB
	 * 
	 * @return collection containing all live posts
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("@all")
	public Response<Resource> getAllDatabox(@PathParam("said") String said) {
		Data<Resource> data = null;	
		logger.info("called API method: GET /dime/rest/" + said + "/databox/@all");

		try {
			Collection<DataContainer> databoxs = databoxManager.getAll();
			data = new Data<Resource>(0, databoxs.size(), databoxs.size());
			for (DataContainer databox : databoxs) {				
				Resource resource =new Resource(databox,null,RENAMING_RULES,databoxManager.getMe().asURI());
				writeIncludes(resource,databox);
				setUserId(resource);
				data.getEntries().add(resource);
			}
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(data);
	}


	/**
	 * Return Collection of DB from one person
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("{personId}/@all")
	public Response<Resource> getAllDataboxesByPerson(@PathParam("said") String said,
			@PathParam("personId") String personId) {

		Data<Resource> data = null;
		logger.info("called API method: GET /dime/rest/" + said + "/databox/"+personId+"/@all");
		try {	

			Person person ="@me".equals(personId) ? databoxManager.getMe()
					: personManager.get(personId); 

			Collection<DataContainer> databoxes = databoxManager
					.getAllByPerson(person.asURI());

			data = new Data<Resource>(0, databoxes.size(), databoxes.size());
			for (DataContainer databox : databoxes) {
				Resource resource =new Resource(databox,null,RENAMING_RULES,databoxManager.getMe().asURI());
				writeIncludes(resource,databox);
				setUserId(resource);
				data.getEntries().add(resource);
			}
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(data);
	}



	/**
	 * Return DB
	 * 
	 * @param dbID
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("@me/{dbId}")
	public Response<Resource> getMyDatabox(@PathParam("said") String said,
			@PathParam("dbId") String dbId) {

		Data<Resource> data = null;
		logger.info("called API method: GET /dime/rest/" + said + "/databox/@me/"+dbId);

		try {
			DataContainer databox = databoxManager.get(dbId);

			data = new Data<Resource>(0, 1, 1);
			Resource resource =new Resource(databox,null,RENAMING_RULES,databoxManager.getMe().asURI());
			writeIncludes(resource,databox);
			setUserId(resource);
			data.getEntries().add(resource);
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(data);
	}	


	/**
	 * Return DB
	 * 
	 * @param dbID
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("{personId}/{dbId}")
	public Response<Resource> getMyDataboxById(@PathParam("said") String said,
			@PathParam("personId") String personId, @PathParam("dbId") String dbId) {

		Data<Resource> data = null;
		logger.info("called API method: GET /dime/rest/" + said + "/databox/"+personId+"/"+dbId);

		try {
			DataContainer databox = databoxManager.get(dbId);

			data = new Data<Resource>(0, 1, 1);
			Resource resource =new Resource(databox,null,RENAMING_RULES,databoxManager.getMe().asURI());
			writeIncludes(resource,databox);
			setUserId(resource);
			data.getEntries().add(resource);
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(data);
	}

	/**
	 * Create DB
	 * 
	 * @param json
	 * @param dbID
	 * @return
	 */
	@POST
	@Path("@me")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response<Databox> postCreateMyDatabox(
			@PathParam("said") String said, Request<Databox> request) {


		logger.info("called API method: post /dime/rest/" + said + "/databox/@me");

		Data<Databox> data, returnData;

		try {
			RequestValidator.validateRequest(request);

			data = request.getMessage().getData();

			Databox dto = data.getEntries().iterator().next();


			// Remove guid because is a new object
			dto.remove("guid");

			DataContainer databox = dto.asResource(DataContainer.class,databoxManager.getMe().asURI());
			if(!databox.hasPrivacyLevel())databox.setPrivacyLevel(0.9d);
			databoxManager.add(databox);
			readIncludes(dto,databox);
			DataContainer returnDatabox = databoxManager.get(databox.asURI()
					.toString());
			Databox resource = new Databox(returnDatabox,databoxManager.getMe().asURI());
			writeIncludes(resource,returnDatabox);
			setUserId(resource);
			returnData = new Data<Databox>(0, 1,resource);

		} catch (IllegalArgumentException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(returnData);
	}

	/**
	 * Update DB
	 * 
	 * @param json
	 * @param dbID
	 * @return
	 */
	@POST
	@Path("@me/{dbID}")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response<Resource> postUpdateMyDataboxById(
			@PathParam("said") String said, Request<Resource> request,
			@PathParam("dbID") String dbID) {

		logger.info("called API method: POST /dime/rest/" + said + "/databox/@me/"+dbID);

		Data<Resource> data, returnData;

		try {
			RequestValidator.validateRequest(request);

			data = request.getMessage().getData();		
			Resource resource = data.getEntries().iterator().next();			

			DataContainer databox = data.getEntries().iterator().next()
					.asResource(new URIImpl(dbID), DataContainer.class,databoxManager.getMe().asURI());


			databoxManager.update(databox);

			readIncludes(resource,databox);
			DataContainer returnDatabox = databoxManager.get(dbID);
			Databox returnResource = new Databox(returnDatabox,databoxManager.getMe().asURI());
			writeIncludes(returnResource,returnDatabox);
			setUserId(returnResource);
			returnData = new Data<Resource>(0, 1, returnResource);
			return Response.ok(returnData);
		} catch (IllegalArgumentException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}
	}



	/**
	 * Remove DB
	 * 
	 * @param dbID
	 * @return
	 */
	@DELETE
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("@me/{dbID}")
	public Response deleteMyDataboxById(@PathParam("said") String said,
			@PathParam("dbID") String dbID) {

		logger.info("called API method: DELETE /dime/rest/" + said + "/databox/@me/"+dbID);

		try {
			databoxManager.remove(dbID);

		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok();
	}



	////
	//Method for reading the privacyPreferences of a databox
	////
	@Override
	public List<Include> readIncludes(eu.dime.ps.dto.Resource resource,eu.dime.ps.semantic.model.RDFReactorThing datacontainer)
			throws InfosphereException {			

		List<Include> includes = buildIncludesFromMap(resource);
		if (!includes.isEmpty()){
			for(Include include: includes){
				ArrayList<String> toShare = new ArrayList<String>();

				for(String group : include.groups){	
					toShare.add(group);
				}
				for(String service: include.services){						
					toShare.add(service);
				}
				for (HashMap<String, String> person : include.persons){
					if(person.get("saidReceiver") == null){
						toShare.add(person.get("personId"));
					}
					else{					
						toShare.add(person.get("saidReceiver"));
					}					
				}
				sharingManager.shareDatabox(datacontainer.asURI().toString(), include.getSaidSender(), toShare.toArray(new String[toShare.size()]));
				//unshare		
				Collection<Agent> shared =	sharingManager.getAgentsWithAccessToAccessSpace( datacontainer.asURI().toString(),PrivacyPreferenceType.DATABOX,include.getSaidSender());
				for(Agent agent: shared)
					if(!toShare.contains(agent.asURI().toString())){
						sharingManager.unshareDatabox(datacontainer.asURI().toString(), new String[]{agent.asURI().toString()});
					}
			}
		}
		else{
			//includes is empty, then unshare everything	
			Collection<Agent> shared =	sharingManager.getAgentsWithAccessToResource(datacontainer);			
				sharingManager.unshareDatabox(datacontainer.asURI().toString(), shared.toArray(new String[shared.size()]));
		}
		return includes;
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path(value = "@me/@all/shared")
	public Response<Resource> getAllSharedDataboxWithAgent(
			@QueryParam("sharedWithAgent") String agentId,
			@QueryParam("sharedWithService") String serviceId) {

		Data<Resource> data = null;

		try {		
						
			Collection<DataContainer> databoxes = databoxManager.getAllByPerson(databoxManager.getMe().asURI());		
			
			data = new Data<Resource>(0, 0,0 );
			
			for (DataContainer databox : databoxes) {				
				String dbId = databox.asURI().toString();
				if(sharingManager.hasAccessToDatabox(dbId, serviceId==null? agentId: serviceId)){
					Resource resource =new Resource(databox,null,RENAMING_RULES,databoxManager.getMe().asURI());
					writeIncludes(resource,databox);
					data.addEntry(resource);	
				}
			}

		} catch (InfosphereException e) {
			return Response.badRequest(e.getMessage(), e);
		} catch (Exception e) {
			return Response.serverError(e.getMessage(), e);
		}

		return Response.ok(data);
	}	

}