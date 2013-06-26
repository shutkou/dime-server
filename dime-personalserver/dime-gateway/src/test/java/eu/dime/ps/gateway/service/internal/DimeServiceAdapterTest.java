package eu.dime.ps.gateway.service.internal;

import ie.deri.smile.rdf.util.ModelUtils;
import ie.deri.smile.vocabulary.DLPO;
import ie.deri.smile.vocabulary.NAO;
import ie.deri.smile.vocabulary.NCO;
import ie.deri.smile.vocabulary.NFO;

import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;

import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.vocabulary.RDF;
import org.scribe.model.Token;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eu.dime.commons.dto.Data;
import eu.dime.commons.dto.Entry;
import eu.dime.commons.dto.Message;
import eu.dime.commons.dto.ExternalNotificationDTO;
import eu.dime.commons.dto.Request;
import eu.dime.commons.notifications.DimeExternalNotification;
import eu.dime.commons.util.JaxbJsonSerializer;
import eu.dime.ps.gateway.auth.CredentialStore;
import eu.dime.ps.gateway.proxy.HttpRestProxy;
import eu.dime.ps.gateway.proxy.ProxyFactory;
import eu.dime.ps.semantic.model.dlpo.LivePost;
import eu.dime.ps.semantic.model.nco.PersonContact;
import eu.dime.ps.semantic.model.nfo.FileDataObject;

/**
 * Tests for {@link DimeServiceAdapter}.
 *  
 * @author Ismael Rivera
 * @author Marc Planagumà 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config/storage-loading-tests-context.xml")
//@RunWith(PowerMockRunner.class)
//@PrepareForTest({DimeServiceAdapter.class, DimeIPResolver.class})
public class DimeServiceAdapterTest extends Assert {

	@Test
	public void testGetAdapterName() throws Exception {
		DimeServiceAdapter adapter = new DimeServiceAdapter("test");
		assertEquals("di.me", adapter.getAdapterName());
	}

	@Test
	public void testDimeServiceAdapterString() throws Exception {
		DimeServiceAdapter adapter = new DimeServiceAdapter("test");
		assertEquals("test", adapter.getIdentifier());
	}

	@Test
	public void testGetDatabox() throws Exception {
		URI databoxUri = new URIImpl("urn:uuid:3dcb73e4-399f-41af-b4f2-a8bb48c315a1");
		String said = "12345";
		String baseUrl = "http://di.me";
		String path = "/api/dime/rest/:target/shared/databox/:id".replace(":target", said).replace(":id", databoxUri.toString());
		String json = "".replace('`', '"');
		// TODO complete
	}
	
	@Test
	public void testGetLivepost() throws Exception {
		URI livepostUri = new URIImpl("urn:uuid:bd397c8a-ea12-4d52-a788-69ba5deb8dd5");
		String encodedUri = Base64.encodeBase64URLSafeString(livepostUri.toString().getBytes("UTF-8"));
		URI creatorUri = new URIImpl("urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f");
		String sender = "urn:uuid:3dcb73e4-399f-41af-b4f2-a8bb48c315a1";
		String receiver = "urn:uuid:e9e07fd8-f53f-453b-b2dc-307e04c4fb61";
		String senderSAID = "12345";
		URL baseUrl = new URL("http://di.me");
		String path = "/api/dime/rest/:target/shared/livepost/:id".replace(":target", senderSAID).replace(":id", encodedUri);
		String json = "{`dlpo:textualContent`:`Hello world!`,`@context`:{`nao`:`http://www.semanticdesktop.org/ontologies/2007/08/15/nao#`,`nfo`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#`,`ncal`:`http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#`,`nie`:`http://www.semanticdesktop.org/ontologies/2007/01/19/nie#`,`nco`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nco#`,`dlpo`:`http://www.semanticdesktop.org/ontologies/2011/10/05/dlpo#`,`rdfs`:`http://www.w3.org/2000/01/rdf-schema#`,`pimo`:`http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#`,`ppo`:`http://vocab.deri.ie/ppo#`,`xsd`:`http://www.w3.org/2001/XMLSchema#`,`rdf`:`http://www.w3.org/1999/02/22-rdf-syntax-ns#`,`nexif`:`http://www.semanticdesktop.org/ontologies/2007/05/10/nexif#`,`nid3`:`http://www.semanticdesktop.org/ontologies/2007/05/10/nid3#`},`dlpo:timestamp`:{`@type`:`http://www.w3.org/2001/XMLSchema#dateTime`,`@value`:`2013-04-25T19:36:25.823Z`},`@type`:`dlpo:LivePost`,`nao:creator`:{`@id`:`urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f`},`@id`:`urn:uuid:bd397c8a-ea12-4d52-a788-69ba5deb8dd5`}".replace('`', '"');
		
		// setting up components and mocks
		DimeIPResolver mockResolver = Mockito.mock(DimeIPResolver.class);
		Mockito.when(mockResolver.resolve(senderSAID)).thenReturn(baseUrl.toString());
		
		HttpRestProxy mockProxy = Mockito.mock(HttpRestProxy.class);
		Mockito.when(mockProxy.get(Mockito.eq(path), Mockito.anyMap())).thenReturn(json);
		
		ProxyFactory mockFactory = Mockito.mock(ProxyFactory.class);
		Mockito.when(mockFactory.createProxy(Mockito.eq(baseUrl), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(mockProxy);

		CredentialStore mockStore = Mockito.mock(CredentialStore.class);
		Mockito.when(mockStore.getNameSaid(receiver)).thenReturn(senderSAID);

		DimeServiceAdapter adapter = new DimeServiceAdapter("1");
		adapter.setProxyFactory(mockFactory);
		adapter.setTargetResolver(mockResolver);
		adapter.setCredentialStore(mockStore);
	
		// calling the method to test
		String attribute = "/livepost/" + encodedUri;
		Collection<LivePost> liveposts = adapter.get(receiver, sender, attribute, LivePost.class);
		
		// verifying metadata for response
		assertEquals(1, liveposts.size());
		
		LivePost livepost = liveposts.iterator().next();
		assertEquals(livepostUri, livepost.asURI());
		
		Model metadata = livepost.getModel();
		assertEquals("Hello world!", ModelUtils.findObject(metadata, livepostUri, DLPO.textualContent).asLiteral().getValue());
		assertEquals(creatorUri, ModelUtils.findObject(metadata, livepostUri, NAO.creator).asURI());
		assertEquals("2013-04-25T19:36:25.823Z", ModelUtils.findObject(metadata, livepostUri, DLPO.timestamp).asLiteral().getValue());
	}
	
	@Test
	public void testGetResource() throws Exception {
		URI fileUri = new URIImpl("urn:uuid:a1734636-114c-4e4a-a777-7ed487a4cc0a");
		String encodedUri = Base64.encodeBase64URLSafeString(fileUri.toString().getBytes("UTF-8"));
		URI creatorUri = new URIImpl("urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f");
		String sender = "urn:uuid:3dcb73e4-399f-41af-b4f2-a8bb48c315a1";
		String receiver = "urn:uuid:e9e07fd8-f53f-453b-b2dc-307e04c4fb61";
		String senderSAID = "12345";
		URL baseUrl = new URL("http://di.me");
		String path = "/api/dime/rest/:target/shared/resource/:id".replace(":target", senderSAID).replace(":id", encodedUri);
		String json = "{`@context`:{`nao`:`http://www.semanticdesktop.org/ontologies/2007/08/15/nao#`,`nfo`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#`,`ncal`:`http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#`,`nie`:`http://www.semanticdesktop.org/ontologies/2007/01/19/nie#`,`nco`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nco#`,`dlpo`:`http://www.semanticdesktop.org/ontologies/2011/10/05/dlpo#`,`rdfs`:`http://www.w3.org/2000/01/rdf-schema#`,`pimo`:`http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#`,`ppo`:`http://vocab.deri.ie/ppo#`,`xsd`:`http://www.w3.org/2001/XMLSchema#`,`rdf`:`http://www.w3.org/1999/02/22-rdf-syntax-ns#`,`nexif`:`http://www.semanticdesktop.org/ontologies/2007/05/10/nexif#`,`nid3`:`http://www.semanticdesktop.org/ontologies/2007/05/10/nid3#`},`nfo:fileName`:`Test.doc`,`nfo:fileSize`:{`@type`:`http://www.w3.org/2001/XMLSchema#int`,`@value`:`15464634`},`@type`:`nfo:FileDataObject`,`nao:creator`:{`@id`:`urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f`},`nfo:fileLastModified`:{`@type`:`http://www.w3.org/2001/XMLSchema#dateTime`,`@value`:`2013-04-25T18:40:04.676Z`},`@id`:`urn:uuid:a1734636-114c-4e4a-a777-7ed487a4cc0a`}".replace('`', '"');

		// setting up components and mocks
		DimeIPResolver mockResolver = Mockito.mock(DimeIPResolver.class);
		Mockito.when(mockResolver.resolve(senderSAID)).thenReturn(baseUrl.toString());
		
		HttpRestProxy mockProxy = Mockito.mock(HttpRestProxy.class);
		Mockito.when(mockProxy.get(Mockito.eq(path), Mockito.anyMap())).thenReturn(json);
		
		ProxyFactory mockFactory = Mockito.mock(ProxyFactory.class);
		Mockito.when(mockFactory.createProxy(Mockito.eq(baseUrl), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(mockProxy);

		CredentialStore mockStore = Mockito.mock(CredentialStore.class);
		Mockito.when(mockStore.getNameSaid(receiver)).thenReturn(senderSAID);

		DimeServiceAdapter adapter = new DimeServiceAdapter("1");
		adapter.setProxyFactory(mockFactory);
		adapter.setTargetResolver(mockResolver);
		adapter.setCredentialStore(mockStore);
	
		// calling the method to test
		String attribute = "/resource/" + encodedUri;
		Collection<FileDataObject> files = adapter.get(receiver, sender, attribute, FileDataObject.class);
		
		// verifying metadata for response
		assertEquals(1, files.size());
		
		FileDataObject file = files.iterator().next();
		assertEquals(fileUri, file.asURI());
		
		Model metadata = file.getModel();
		assertEquals("Test.doc", ModelUtils.findObject(metadata, fileUri, NFO.fileName).asLiteral().getValue());
		assertEquals(creatorUri, ModelUtils.findObject(metadata, fileUri, NAO.creator).asURI());
		assertEquals("2013-04-25T18:40:04.676Z", ModelUtils.findObject(metadata, fileUri, NFO.fileLastModified).asDatatypeLiteral().getValue());
		assertEquals("15464634", ModelUtils.findObject(metadata, fileUri, NFO.fileSize).asDatatypeLiteral().getValue());
	}
	
	@Test
	public void testGetProfile() throws Exception {
		String said = "12345";
		URL baseUrl = new URL("http://di.me");
		String path = "/api/dime/rest/:target/shared/profile".replace(":target", said);
		String json = "[{`@context`:{`nco`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nco#`},`@type`:`nco:PhoneNumber`,`nco:phoneNumber`:`555-55-55`,`@id`:`urn:uuid:e9e07fd8-f53f-453b-b2dc-307e04c4fb61`},{`@context`:{`nco`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nco#`},`nco:fullname`:`Ismael Rivera`,`@type`:`nco:PersonName`,`nco:nameGiven`:`Ismael`,`nco:nameFamily`:`Rivera`,`@id`:`urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f`},{`@context`:{`nao`:`http://www.semanticdesktop.org/ontologies/2007/08/15/nao#`,`nco`:`http://www.semanticdesktop.org/ontologies/2007/03/22/nco#`},`nco:hasPersonName`:{`@id`:`urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f`},`nco:hasPhoneNumber`:{`@id`:`urn:uuid:e9e07fd8-f53f-453b-b2dc-307e04c4fb61`},`@type`:`nco:PersonContact`,`@id`:`urn:uuid:3dcb73e4-399f-41af-b4f2-a8bb48c315a1`,`nao:prefLabel`:`ismriv@di.me`}]".replace('`', '"');
		URI profileUri = new URIImpl("urn:uuid:3dcb73e4-399f-41af-b4f2-a8bb48c315a1");
		URI phoneUri = new URIImpl("urn:uuid:e9e07fd8-f53f-453b-b2dc-307e04c4fb61");
		URI nameUri = new URIImpl("urn:uuid:18e938b1-935d-4cb4-b763-3ca1d654305f");
		
		// setting up components and mocks
		DimeIPResolver mockResolver = Mockito.mock(DimeIPResolver.class);
		Mockito.when(mockResolver.resolve(said)).thenReturn(baseUrl.toString());
		
		HttpRestProxy mockProxy = Mockito.mock(HttpRestProxy.class);
		Mockito.when(mockProxy.get(Mockito.eq(path), Mockito.anyMap())).thenReturn(json);
		
		ProxyFactory mockFactory = Mockito.mock(ProxyFactory.class);
		Mockito.when(mockFactory.createProxy(Mockito.eq(baseUrl), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(mockProxy);

		DimeServiceAdapter adapter = new DimeServiceAdapter("1");
		adapter.setProxyFactory(mockFactory);
		adapter.setTargetResolver(mockResolver);
		
		// calling the method to test
		PersonContact profile = adapter.getProfile(said, new Token("token", "secret"));
		
		// verifying metadata for PersonContact
		Model metadata = profile.getModel();
		assertEquals(profileUri, profile.asURI());
		assertTrue(metadata.contains(profileUri, NCO.hasPersonName, nameUri));
		assertTrue(metadata.contains(profileUri, NCO.hasPhoneNumber, phoneUri));
		
		// verifying metadata for PersonName
		assertTrue(metadata.contains(nameUri, RDF.type, NCO.PersonName));
		assertEquals("Ismael Rivera", ModelUtils.findObject(metadata, nameUri, NCO.fullname).asLiteral().getValue());
		assertEquals("Ismael", ModelUtils.findObject(metadata, nameUri, NCO.nameGiven).asLiteral().getValue());
		assertEquals("Rivera", ModelUtils.findObject(metadata, nameUri, NCO.nameFamily).asLiteral().getValue());
		
		// verifying metadata for PhoneNumber
		assertTrue(metadata.contains(phoneUri, RDF.type, NCO.PhoneNumber));
		assertEquals("555-55-55", ModelUtils.findObject(metadata, phoneUri, NCO.phoneNumber).asLiteral().getValue());
	}

	@Test
	public void testSet() throws Exception {
		String said = "juan";
		String baseUrl = "http://di.me";
		String path = "/api/services/:target/set/notification".replace(":target", said);
		
		DimeServiceAdapter adapter = new DimeServiceAdapter("juan");
		
		// Data input
		DimeExternalNotification notification = new DimeExternalNotification(said, "sender", "operation", "itemID", "name", "itemTyp", 1l);
		
		// Prepare data output expected
		Data<ExternalNotificationDTO> data = new Data<ExternalNotificationDTO>();
		Request<ExternalNotificationDTO> request = new Request<ExternalNotificationDTO>();
		
		Entry element = new Entry();
		element.setGuid(notification.getItemID());
		element.setType(notification.getItemType());
		element.setName(notification.getName());

		ExternalNotificationDTO payload = new ExternalNotificationDTO();
		payload.setElement(element);
		payload.setGuid(notification.getItemID());
		payload.setOperation(notification.getOperation());
		payload.setSender(notification.getSender());
		payload.setSaidReciever(notification.getTarget());
		payload.setSaidSender(notification.getSender());
		
		LinkedList<ExternalNotificationDTO> collection = new LinkedList<ExternalNotificationDTO>();
		collection.add(payload);
		data.setEntry(collection);
		
		Message<ExternalNotificationDTO> message = new Message<ExternalNotificationDTO>();
		message.setData(data);
		request.setMessage(message);
		
		// expected output
		String json = JaxbJsonSerializer.jsonValue(request);
		
		// set up mocks
		DimeIPResolver mockResolver = Mockito.mock(DimeIPResolver.class);
		Mockito.when(mockResolver.resolve(Mockito.anyString())).thenReturn(baseUrl);
		adapter.setTargetResolver(mockResolver);
		
		//PowerMockito.whenNew(DimeIPResolver.class).withAnyArguments().thenReturn(mockResolver);
		
		HttpRestProxy mockProxy = Mockito.mock(HttpRestProxy.class);
		// response when error
		Mockito.when(mockProxy.post(Mockito.anyString(), Mockito.anyString())).thenReturn(300);
		// response OK
		Mockito.when(mockProxy.post(path, json)).thenReturn(200);
		
		ProxyFactory mockFactory = Mockito.mock(ProxyFactory.class);
		Mockito.when(mockFactory.createProxy(Mockito.eq(new URL(baseUrl)), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(mockProxy);
		adapter.setProxyFactory(mockFactory);

		// call
		adapter._set("/notification", notification);
	}
	

	
	// *******************
	// TODO Old tests to check
	//*********************
	
//	@Test
//	public void testSearch() {
//		try {
//			// Test user to register
//			NCOFactory ncofactory = new NCOFactory();
//			PersonContact newContact = ncofactory.createPersonContact("uri:serviceAccountID");
//			Name name = ncofactory.createName();
//			name.setNickname("Robbie");
//			name.setFullname("Robert Glaser");
//			newContact.setName(name);
//			
//			// Register test user
//			DimeServiceAdapter adapter = new DimeServiceAdapter("test");
//			adapter.openServiceConnection("https://localhost:8443/"); // placeholder, URL not used
//			adapter.register("user-registry", newContact);
//			adapter.search(newContact, PersonContact.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
//	}
//	@Ignore
//	@Test
//	public void testGet() {
//		DimeServiceAdapter adapter;
//		try {
//			adapter = new DimeServiceAdapter("test");
//			adapter.openServiceConnection("https://141.99.96.110:8080/user-resolver");
//
//			// Test retrieving resource
//			Collection<Resource> r_results = adapter.get("test", "/resource/@me/@all", Resource.class);
//			assertTrue(r_results.size() > 0);
//
//			// TODO: Test Databox
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail (e.getMessage());
//		}
//	
//	}
//
//	@Ignore
//	@Test
//	public void testSearchStringResourceClassOfT() {
//		// Test user to register
//		NCOFactory ncofactory = new NCOFactory();
//		PersonContact newContact = ncofactory.createPersonContact("uri:search");
//		Name name = ncofactory.createName();
//		name.setNickname("Robbie");
//		newContact.setName(name);
//		
//		// Register test user
//		DimeServiceAdapter adapter;
//		try {
//			adapter = new DimeServiceAdapter("test");
//			adapter.openServiceConnection("https://141.99.96.110:8080/user-resolver");
//			adapter.register("user-registry", newContact);
//			Collection<PersonContact> results = adapter.search(newContact, PersonContact.class);
//			assertTrue(results.contains(newContact));
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail (e.getMessage());
//		}
//	
//	}


}