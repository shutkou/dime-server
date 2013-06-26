package eu.dime.ps.semantic.poc;

import ie.deri.smile.rdf.util.ModelUtils;
import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ontoware.rdf2go.RDF2Go;
import org.ontoware.rdf2go.model.ModelSet;
import org.ontoware.rdf2go.model.Syntax;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config/semantic-poc-tests-context.xml")
public class PocAnnaTest extends TestCase {

	@BeforeClass
	public static void setUpClass() throws Exception {
		// disabling org.openrdf.rdf2go.RepositoryModel warnings
		org.apache.log4j.Logger.getLogger("org.openrdf.rdf2go").setLevel(org.apache.log4j.Level.OFF);        
		java.util.logging.Logger.getLogger("org.openrdf.rdf2go").setLevel(java.util.logging.Level.OFF);
	}

	@Test
	public void testLoadAnna() throws Exception {
		ModelSet sinkModel = RDF2Go.getModelFactory().createModelSet();
		sinkModel.open();
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-pimo.trig"),
				Syntax.Trig, sinkModel);
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-profile.trig"),
				Syntax.Trig, sinkModel);
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-resources.ttl"),
				Syntax.Turtle, sinkModel);
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-databoxes.ttl"),
				Syntax.Turtle, sinkModel);
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-liveposts.ttl"),
				Syntax.Turtle, sinkModel);
		ModelUtils.loadFromInputStream(
				this.getClass().getClassLoader().getResourceAsStream("poc-data/anna/anna-situations.trig"),
				Syntax.Trig, sinkModel);
		sinkModel.close();
	}
	
}