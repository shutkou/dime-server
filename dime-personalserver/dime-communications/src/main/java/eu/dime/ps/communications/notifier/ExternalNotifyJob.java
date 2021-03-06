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

package eu.dime.ps.communications.notifier;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Deals notifications betwenn PS - PS
 * 
 * @author mplanaguma
 *
 */
public class ExternalNotifyJob extends QuartzJobBean {

    private ExternalNotifySchedule externalNotifySchedule;

    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
	// do the actual work
	externalNotifySchedule.dealNotifications();
    }

    public void setExternalNotifySchedule(ExternalNotifySchedule externalNotifySchedule) {
	this.externalNotifySchedule = externalNotifySchedule;
    }

}
