package eu.dime.ps.controllers.automation;

import ie.deri.smile.rdf.util.ModelUtils;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ontoware.rdf2go.RDF2Go;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.Syntax;
import org.ontoware.rdf2go.model.node.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eu.dime.ps.semantic.exception.ResourceExistsException;
import eu.dime.ps.semantic.model.ModelFactory;
import eu.dime.ps.semantic.model.pimo.Person;
import eu.dime.ps.semantic.service.impl.PimoService;
import eu.dime.ps.semantic.model.dcon.Peers;

@ContextConfiguration(locations = { "classpath*:**/applicationContext-infosphere-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EventProcessorTreeTest extends TestCase {
	
	@Autowired
	protected PimoService pimoService;
	
	protected ModelFactory modelFactory = new ModelFactory();

	private HashMap<String, URI> personUri = new HashMap<String, URI>();
	
	private EventProcessorTree ept = new EventProcessorTree();
	
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
		pimoService.create(this.buildProfile("Peter Doe", 0.7));
		
		//load rules in PIMO
		Model sinkModel = RDF2Go.getModelFactory().createModel().open();
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("nearbyPerson.trig"),
				Syntax.Ntriples, sinkModel);
		pimoService.getTripleStore().addAll(sinkModel.iterator());
		sinkModel.close();
	}
	
	@Ignore
	@Test
	public void nearbyPersonTest(){
		this.addPeers(this.personUri.get("Paul Doe"));
	}
	
	protected Person buildProfile(String name, double trustValue) {
		Person person = modelFactory.getPIMOFactory().createPerson();
		person.setPrefLabel(name);
		person.setTrustLevel(trustValue);
		
		this.personUri.put(name, person.asURI());
		
		return person;
	}
	
	protected Peers addPeers(URI personURI){
		Peers peer = modelFactory.getDCONFactory().createPeers();
		peer.addNearbyPerson(personURI);
		return peer;
	}
}