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

package eu.dime.ps.gateway.service.external;

import java.net.MalformedURLException;
import java.net.URL;

import eu.dime.ps.gateway.exception.AttributeNotSupportedException;
import eu.dime.ps.gateway.exception.InvalidDataException;
import eu.dime.ps.gateway.exception.ServiceException;
import eu.dime.ps.gateway.exception.ServiceNotAvailableException;
import eu.dime.ps.gateway.proxy.HttpRestProxy;
import eu.dime.ps.gateway.service.AttributeMap;
import eu.dime.ps.gateway.service.ServiceAdapterBase;
import eu.dime.ps.gateway.service.ServiceResponse;

/**
 * A service to access any remote KML file with locations or places information.
 * 
 * @author Ismael Rivera
 */
public class KMLAdapter extends ServiceAdapterBase implements ExternalServiceAdapter {

	public final static String NAME = "KML";
	
	private final HttpRestProxy proxy;
	private String apiUrl;
	
	public KMLAdapter() throws ServiceNotAvailableException {
		try {
			// TODO [Isma] The KML adapter requires a URL as configuration; it should be asked in the UI, fixed to EKAW map for now
			this.apiUrl = "https://maps.google.com/maps";
			this.proxy = new HttpRestProxy(new URL(this.apiUrl));
		} catch (MalformedURLException e) {
			throw new ServiceNotAvailableException("URL "+this.apiUrl+" is malformed: " + e.getMessage(), e);
		}
	}

	@Override
	public String getAdapterName() {
		return KMLAdapter.NAME;
	}
	
	@Override
	public void _set(String attribute, Object value)
			throws AttributeNotSupportedException,
			ServiceNotAvailableException, InvalidDataException {
		throw new AttributeNotSupportedException(attribute, "the adapter doesn't support the 'set' operation.", this);
	}

	@Override
	public void _delete(String attribute)
			throws AttributeNotSupportedException, ServiceNotAvailableException {
		throw new AttributeNotSupportedException(attribute, "the adapter doesn't support the 'delete' operation.", this);
	}

	@Override
	public ServiceResponse[] getRaw(String attribute) throws AttributeNotSupportedException,
			ServiceNotAvailableException, ServiceException {
		AttributeMap attributeMap = new AttributeMap();
		String genericAttribute = attributeMap.getAttribute(attribute);
		
		if (genericAttribute.equals(AttributeMap.PLACE_ALL)) {
			String url = "/ms?authuser=0&vps=2&ie=UTF8&msa=0&output=kml&msid=212189876817982125806.0004b0307880046888817";
			ServiceResponse[] response = new ServiceResponse[1];
			response[0] = new ServiceResponse(ServiceResponse.XML, attribute, url, this.proxy.get(url));
			return response;
		} else {
			throw new AttributeNotSupportedException(attribute, this);
		}
	}

	@Override
	public Boolean isConnected() {
		return true; // it accesses a public URL, so always connected
	}

}
