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

package eu.dime.ps.controllers.automation;

import ie.deri.smile.rdf.TripleStore;
import ie.deri.smile.rdf.util.ModelUtils;
import ie.deri.smile.vocabulary.NAO;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ontoware.rdf2go.RDF2Go;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.Syntax;
import org.ontoware.rdf2go.model.node.Node;
import org.ontoware.rdf2go.model.node.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eu.dime.ps.semantic.BroadcastManager;
import eu.dime.ps.semantic.Event;
import eu.dime.ps.semantic.connection.ConnectionProvider;
import eu.dime.ps.semantic.exception.ResourceExistsException;
import eu.dime.ps.semantic.model.ModelFactory;
import eu.dime.ps.semantic.model.dao.Account;
import eu.dime.ps.semantic.model.dcon.Peers;
import eu.dime.ps.semantic.model.nfo.Document;
import eu.dime.ps.semantic.model.pimo.Person;
import eu.dime.ps.semantic.service.impl.PimoService;

@ContextConfiguration(locations = { "classpath*:**/applicationContext-infosphere-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class RuleExecutorTest extends TestCase {
	
	@Autowired
	protected ConnectionProvider connectionProvider;

	@Autowired
	protected TripleStore tripleStore;

	@Autowired
	protected PimoService pimoService;

	protected ModelFactory modelFactory = new ModelFactory();

	private double PETER_TRUST_LEVEL = 0.7;
	private Person peter = null;
	private Account peterAccount = null;
	
	@Before
	public void setUp() throws Exception {
		pimoService.clear();
		loadData();
	}

	protected void loadData() throws ResourceExistsException, ModelRuntimeException, IOException {
		pimoService.create(this.buildProfile("John Doe", 0.8));
		pimoService.create(this.buildProfile("Mary Doe", 0.3));
		pimoService.create(this.buildProfile("Anna Doe", 0.9));
		pimoService.create(this.buildProfile("Paul Doe", 0.45));
		
		peter = this.buildProfile("Peter Doe", PETER_TRUST_LEVEL);
		peterAccount = this.buildAccount("Peter@di.me", peter.asURI());
		pimoService.create(peter);
		pimoService.create(peterAccount);
	}
	
	@Test
	public void testCreatePerson() throws Exception {
		RuleExecutor executor = new RuleExecutor();
		executor.setConnectionProvider(connectionProvider);
		executor.setNotifierManager(null);

		BroadcastManager bm = BroadcastManager.getInstance();
		bm.sendBroadcastSync(new Event(pimoService.getName(), Event.ACTION_RESOURCE_ADD, peter));
		
	}
	
	@Test
	public void testDocumentSharedWith() throws Exception {
		// load rule definition
		Model sinkModel = RDF2Go.getModelFactory().createModel().open();
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("rules/sharedWith.ttl"),
				Syntax.Turtle, sinkModel);
		pimoService.getTripleStore().addAll(pimoService.getPimoUri(), sinkModel.iterator());
		sinkModel.close();
		
		// construct RuleExecutor
		final RuleExecutor executor = new RuleExecutor();
		executor.setConnectionProvider(connectionProvider);
		executor.setNotifierManager(null);
		
		final BroadcastManager bm = BroadcastManager.getInstance();
		final Document doc = modelFactory.getNFOFactory().createDocument();
		doc.addSharedWith(peterAccount);
		doc.setIsDefinedBy(pimoService.getPimoUri());
		tripleStore.addAll(pimoService.getPimoUri(), doc.getModel().iterator());
		
		// should increase trust level value
		bm.sendBroadcastSync(new Event(pimoService.getName(), Event.ACTION_RESOURCE_MODIFY, doc));
		Node trustLevel = ModelUtils.findObject(tripleStore, peter, NAO.trustLevel);
		double value = Double.parseDouble(trustLevel.asDatatypeLiteral().getValue());
		assertEquals(0.73, value);
	}
	
	@Ignore
	@Test
	public void nearbyPersonTest() throws Exception {
		Model sinkModel = RDF2Go.getModelFactory().createModel().open();
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("rules/nearbyPerson.ttl"),
				Syntax.Turtle, sinkModel);
		pimoService.getTripleStore().addAll(pimoService.getPimoUri(), sinkModel.iterator());
		sinkModel.close();
		
//		this.addPeers(this.personUri.get("Paul Doe"));
	}
	
	protected Person buildProfile(String name, double trustValue) {
		Person person = modelFactory.getPIMOFactory().createPerson();
		person.setPrefLabel(name);
		person.setTrustLevel(trustValue);
		return person;
	}

	protected Account buildAccount(String name, URI creator) {
		Account account = modelFactory.getDAOFactory().createAccount();
		account.setPrefLabel(name);
		account.setAccountType("di.me");
		account.setCreator(creator);
		return account;
	}

	protected Peers addPeers(URI personURI){
		Peers peer = modelFactory.getDCONFactory().createPeers();
		peer.addNearbyPerson(personURI);
		return peer;
	}
}
