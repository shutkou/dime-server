package eu.dime.ps.communications.notifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import eu.dime.commons.notifications.DimeExternalNotification;
import eu.dime.ps.controllers.notifier.NotifierManager;
import eu.dime.ps.gateway.ServiceGateway;
import eu.dime.ps.gateway.auth.CredentialStore;
import eu.dime.ps.gateway.exception.ServiceNotAvailableException;
import eu.dime.ps.gateway.service.internal.DimeServiceAdapter;

public class ExternalNotifySchedule {

    private NotifierManager notifierManager;
    private ServiceGateway serviceGateway;
    private CredentialStore credentialStore;
    
    public void setNotifierManager(NotifierManager notifierManager) {
	this.notifierManager = notifierManager;
    }

    @Autowired
    public void setServiceGateway(ServiceGateway serviceGateway) {
	this.serviceGateway = serviceGateway;
    }

    @Autowired
    public void setCredentialStore(CredentialStore credentialStore) {
        this.credentialStore = credentialStore;
    }

    private static final Logger logger = LoggerFactory.getLogger(ExternalNotifySchedule.class);

    public ExternalNotifySchedule() {
	super();
    }

    public void dealNotifications() {
	logger.debug("Job executed");

	// Notifications between PS - PS
	DimeExternalNotification externalNotififcation = notifierManager.popExternalNotification();
	logger.debug("Handle External Notifications - Notification: " + externalNotififcation);

	if (externalNotififcation != null) {
		
	    DimeServiceAdapter adapter = null;
	    DimeExternalNotification tmpNotification;
	    String senderURI = externalNotififcation.getSender();
	    String targetURI = externalNotififcation.getTarget();
	    
	    try {
					
			adapter = (DimeServiceAdapter) serviceGateway.getDimeServiceAdapter(senderURI);

	    } catch (ServiceNotAvailableException e) {
	    	logger.error("Notification Could not be sended for: " + e.getMessage());
	    } 
	    
	    logger.info("Notification dealed to DimeServiceAdapter ("
		    + externalNotififcation.toString() + ")");
	    
	    try {
			String senderName = credentialStore.getNameSaid(senderURI); 
			String targetName = credentialStore.getNameSaid(targetURI); 
			
			// Notification to be sended (without tenant)
			tmpNotification = new DimeExternalNotification(
					targetName, senderName, 
					externalNotififcation.getOperation(), 
					externalNotififcation.getItemID(), 
					externalNotififcation.getName(), 
					externalNotififcation.getItemType(), 
					null); //do not send local tenant id !!!

			adapter.set("/notification", tmpNotification);
		
	    } catch (Exception e) {
	    	logger.error("Notification Could not be sended for: " + e.getMessage());
	    }
	}

    }

}
