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

package eu.dime.ps.gateway.proxy;

import java.net.URL;

import eu.dime.ps.gateway.exception.ServiceNotAvailableException;
import eu.dime.ps.gateway.util.UsernameEncoder;

/**
 * Factory to create proxy objects.
 * 
 * @author Ismael Rivera
 */
public class ProxyFactory {

	public HttpRestProxy createProxy(URL url) throws ServiceNotAvailableException {
		return new HttpRestProxy(url);
	}

	public HttpRestProxy createProxy(URL url, String username, String password) throws ServiceNotAvailableException {
		return new HttpRestProxy(url, UsernameEncoder.encode(username), password);
	}

}
