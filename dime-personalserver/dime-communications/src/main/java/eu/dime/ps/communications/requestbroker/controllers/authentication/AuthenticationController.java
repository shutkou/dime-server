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

package eu.dime.ps.communications.requestbroker.controllers.authentication;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import eu.dime.commons.dto.AccountEntry;
import eu.dime.commons.dto.Data;
import eu.dime.commons.dto.Request;
import eu.dime.commons.dto.Response;
import eu.dime.commons.exception.DimeException;
import eu.dime.ps.communications.requestbroker.controllers.infosphere.RequestValidator;
import eu.dime.ps.controllers.UserManager;
import eu.dime.ps.controllers.accesscontrol.AccessControlManager;
import eu.dime.ps.controllers.exception.UserNotFoundException;
import eu.dime.ps.gateway.service.MediaType;
import eu.dime.ps.storage.entities.Role;
import eu.dime.ps.storage.entities.User;
import eu.dime.ps.storage.exception.ReadOnlyValueChangedOnUpdate;

/**
 * REST API for user management of account information. 
 * (e.g. change password etc)
 * The user should be authenticated as the owner of the accessed account or as ADMIN 
 * @author mheupel
 *
 */
@Controller()
@Path("/dime/rest/{said}/user/")
public class AuthenticationController {

    private Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    @Autowired
    private UserManager userManager;
    
    static final Lock lock = new ReentrantLock();

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }
    private AccessControlManager accessControlManager;

    public void setAccessControlManager(AccessControlManager accessControlManager) {
        this.accessControlManager = accessControlManager;
    }




     /**
     * Updates an account
     *
     * @param userName must be @me for user calls
     * @return
     */
    @GET
    @Path("{userName}") 
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response<AccountEntry> getUser(
               @PathParam("userName") String userName) {
        Data<AccountEntry>  returnData = new Data<AccountEntry>();

        try {
            userName = validateUsername(userName);

            AccountEntry result  = userManager.getUserAccount(userName);
            result.setPassword(""); //clear password
            returnData.addEntry(result);

        } catch (AccessDeniedException ex) {
            return Response.badRequest(ex.getMessage(), ex);
        } catch (IllegalArgumentException e) {
            return Response.badRequest(e.getMessage(), e);
        } catch (Exception e) {
            return Response.serverError(e.getMessage(), e);
        }
        return Response.ok(returnData);
    }

    /**
     * Updates an account
     *
     * @param userName
     * @param request
     * @return
     */
    @POST
    @Path("{userName}")// can be @me - then updating the current user
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response<AccountEntry> updateUser(
               @PathParam("said") String said,
               @PathParam("userName") String userName,
               Request<AccountEntry> request) {
        Data<AccountEntry> data, returnData;

        try {
            
            userName = validateUsername(userName);

            RequestValidator.validateRequest(request);

            data = request.getMessage().getData();
            Collection<AccountEntry> accounts = data.getEntries();


            if (accounts.size() != 1) {
                return Response.badRequest("Number of entries must be 1.");
            }
            
            AccountEntry accountEntry = accounts.iterator().next(); //take first entry only

            //check said
            if (!accountEntry.getSaid().equals(said)){
                return Response.badRequest("inconsistent payload said!=said:"
                        +accountEntry.getSaid()+", "+userName);
            }

            AccountEntry result = userManager.updateUserByAccount(accountEntry);
            result.setPassword(""); //clear password

            returnData = new Data<AccountEntry>();
            returnData.addEntry(result);


        } catch (AccessDeniedException ex) {
            return Response.badRequest(ex.getMessage(), ex);
        } catch (ReadOnlyValueChangedOnUpdate ex) {
            return Response.serverError(ex.getMessage(), ex);
        } catch (UserNotFoundException ex) {
            return Response.badRequest(ex.getMessage(), ex);
        } catch (IllegalArgumentException e) {
            return Response.badRequest(e.getMessage(), e);
        } catch (Exception e) {
            return Response.serverError(e.getMessage(), e);
        }
        return Response.ok(returnData);
    }



    /**
     * Delete an account
     *
     * @param request
     * @param username
     * @return
     */
    @DELETE
    @Path("{userName}")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Response<AccountEntry> deleteAccount(Request<AccountEntry> request,
            @PathParam("userName") String userName) {
        Data<AccountEntry> data, returnData;
        boolean deleted = false;
        try {

            userName = validateUsername(userName);

            RequestValidator.validateRequest(request);

            data = request.getMessage().getData();
            Collection<AccountEntry> accounts = data.getEntries();
            if (accounts.size() != 1) {
                return Response.badRequest("Number of entries must be 1.", null);
            }
            deleted = userManager.disable(userName);


        } catch (AccessDeniedException ex) {
            return Response.badRequest(ex.getMessage(), ex);
        } catch (IllegalArgumentException e) {
            return Response.badRequest(e.getMessage(), e);
        } catch (Exception e) {
            return Response.serverError(e.getMessage(), e);
        }
        if (deleted) {
            return Response.ok();
        } else {
            return Response.serverError("could not delete account.", null);
        }
    }

    @GET
    @Path("/username")
    public String getCurrentUserName() {
        return SecurityContextHolder.getContext().getAuthentication().getName().toString();
    }

    

    @GET
    @Path("/role")
    public String getCurrentRole() {
        User user = userManager.getCurrentUser();
        if (user==null){
            return "Server error - getCurrentUser==null";
        }
        return user.getRole().name();
    }



    ///////////////////////////////////////////////
    // CREDENTIALS
    ///////////////////////////////////////////////

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/credentials/{contact-said}")
    public Response<AccountEntry> getCredentials(
            @PathParam("said") String saidLocal,
            @PathParam("contact-said") String saidRequester) throws DimeException {

        Data<AccountEntry> data = new Data<AccountEntry>();
    	boolean unlocked;
    	try {
                unlocked = lock.tryLock(50L, TimeUnit.MILLISECONDS);// only one register at a time
        } catch (InterruptedException e) {
                throw new DimeException("Password retrieval failed", e);
        }
    	if (!unlocked) {
    		logger.error("Could not aquire lock within 5 seconds. Returning.");
    		throw new DimeException("Could not request credentials because the system is busy.");
    	}
        try {
			User user = userManager.getUserForAccountAndTenant(saidRequester, saidLocal);
			if (user == null) {
			    return Response.badRequest("Useraccount was null", null);
			}

			// check if user belongs to tenant
			//if (user.getTenant().getName().equals(saidLocal)) {
			if (user.getPassword() == null || user.getPassword().equals("")) {
			    user = userManager.generatePassword((user.getId()));
			}
//		if (!user.isEnabled()){
//			user = userManager.generatePassword((user.getId()));
//		}
			if (user != null) {
			    AccountEntry jsonEntry = new AccountEntry();
			    jsonEntry.setUsername(user.getUsername());
			    jsonEntry.setPassword(user.getPassword());
			    jsonEntry.setRole(user.getRole().ordinal());
			    jsonEntry.setEnabled(user.isEnabled());
			    jsonEntry.setType("auth");
			    data.addEntry(jsonEntry);
			} else {
			    return Response.badRequest("Useraccount was already activated!", null);
			    //	}
			}

			return Response.ok(data);
		} catch (Exception e) {
			return Response.serverError();
		} finally {
			lock.unlock();
		}
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/credentials/{contact-said}")
    public Response<?> confirmCredentials(
            @PathParam("said") String saidLocal,
            @PathParam("contact-said") String saidRequester) {

        User user = userManager.getUserForAccountAndTenant(saidRequester, saidLocal);
        if (user == null) {
            return Response.badRequest("Useraccount was null", null);
        }
        User enabledUser = userManager.enable((user.getId()));
        if (enabledUser != null) {
            return Response.ok();
        } else {
            return Response.badRequest("Useraccount was null", null);
        }
    }


    private String validateUsername(String userName) throws AccessDeniedException {
        String currentUserName = getCurrentUserName();
        if (userName.equals("@me")
             || (userName.equals(currentUserName))){
                return currentUserName;
        }//else
        //only for admins
        User user = userManager.getCurrentUser();
        if (!user.getRole().equals(Role.ADMIN)){
            throw new AccessDeniedException(userName);
        }
        return userName;

    }

    
}
