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

package eu.dime.ps.communications.requestbroker.controllers.context;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.dime.commons.dto.Data;
import eu.dime.commons.dto.Entry;
import eu.dime.commons.dto.Place;
import eu.dime.commons.dto.Request;
import eu.dime.commons.dto.Response;
import eu.dime.commons.exception.DimeException;
import eu.dime.ps.communications.requestbroker.controllers.infosphere.RequestValidator;
import eu.dime.ps.controllers.TenantManager;
import eu.dime.ps.controllers.placeprocessor.PlaceProcessor;
import eu.dime.ps.gateway.exception.ServiceNotAvailableException;
import eu.dime.ps.storage.entities.Tenant;

/**
 * Dime REST API Controller for a context features
 * 
 * @author mplanaguma (BDCT)
 * 
 */
@Controller
@Path("/dime/rest/{said}/place")
public class PSPlaceController {

	private static final Logger logger = LoggerFactory
			.getLogger(PSSituationController.class);


	private PlaceProcessor placeProcessor;


	public void setPlaceProcessor(PlaceProcessor placeProcessor) {
		this.placeProcessor = placeProcessor;
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("/@me/@all")
	public Response<Place> getAllPlacesAround(@PathParam("said") String said, 
			@QueryParam("lat") double latitude,
			@QueryParam("lon") double longitude,
			@QueryParam("rad") double radius,
			@QueryParam("cat") List<String> categories){

		logger.info("called API method: GET /dime/rest/" + said + "/place/@me/@all");

		Data<Place> returnData = new Data<Place>();

		try{
			List<Place> places = this.placeProcessor.getPlaces(said, latitude, longitude, radius, categories);
			Iterator<Place> it = places.iterator();
			while (it.hasNext()) {
				Place place = it.next();
				place.setUserId("@me");
				returnData.addEntry(place);
			}
		} catch (eu.dime.ps.gateway.exception.ServiceNotAvailableException ex){
			logger.error("Service Not Available:" + ex.getMessage());
		}
		return Response.ok(returnData);
	}



	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("/@me/{placeId}")
	public Response<Entry> getPlace(@PathParam("said") String said, @PathParam("placeId") String placeId) throws DimeException {

		logger.info("called API method: GET /dime/rest/" + said + "/place/@me/"+placeId);

		Data<Entry> data = new Data<Entry>(0, 1, 1);	

		Place place = placeProcessor.getPlace(said, placeId);
		place.setUserId("@me");
		data.addEntry(place);

		return Response.ok(data);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Path("@me/{placeId}")
	public Response deletePlaceById(@PathParam("said") String said, @PathParam("placeId") String placeId){

		// TODO contextManager.removePlace(placeId);
		// TODO delete place (currently not needed)
		return Response.ok();
	}

	@POST
	@Path("/@me")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response<Place> createPlace(@PathParam("said") String said, Request<Place> request){

		Data<Place> data, returnData;

		RequestValidator.validateRequest(request);

		data = request.getMessage().getData();

		Place place = (Place) data.getEntries().iterator().next();

		// TODO Convert DTO into Domain Object
		// TODO contextManager.addPlace(place);

		returnData = new Data<Place>(0, 1, place);

		return Response.ok(returnData);
	}    


	@POST
	@Path("/@me/{placeId}")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response<Place> updatePlace(@PathParam("said") String said, @PathParam("placeId") String placeId, Request<Place> request) throws ServiceNotAvailableException{

		Data<Place> data, returnData;

		RequestValidator.validateRequest(request);

		data = request.getMessage().getData();
		Place place = (Place) data.getEntries().iterator().next();

		Place updatedPlace = this.placeProcessor.updatePlace(said, placeId, place);
		updatedPlace.setUserId("@me");
		returnData = new Data<Place>(0, 1, updatedPlace);

		return Response.ok(returnData);
	}

}
