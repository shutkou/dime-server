package eu.dime.ps.semantic.model.nrl;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;


/**
 * This class manages access to these properties:
 * <ul>
 *   <li> Specification </li>
 *   <li> ViewOn </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class GraphView extends eu.dime.ps.semantic.model.nrl.Graph {

    /** http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#GraphView */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#GraphView", false);

    /** http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#hasSpecification */
    @SuppressWarnings("hiding")
	public static final URI SPECIFICATION = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#hasSpecification",false);

    /** http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#viewOn */
    @SuppressWarnings("hiding")
	public static final URI VIEWON = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#viewOn",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#hasSpecification",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#viewOn",false) 
    };


	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c1] 
	 */
	protected GraphView (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c2] 
	 */
	public GraphView (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}


	/**
	 * Returns a Java wrapper over an RDF object, identified by a URI, given as a String.
	 * Creating two wrappers for the same URI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString a URI given as a String
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 * @throws ModelRuntimeException if URI syntax is wrong
	 *
	 * [Generated from RDFReactor template rule #c7] 
	 */
	public GraphView (Model model, String uriString, boolean write) throws ModelRuntimeException {
		super(model, RDFS_CLASS, new URIImpl(uriString,false), write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c8] 
	 */
	public GraphView (Model model, BlankNode bnode, boolean write) {
		super(model, RDFS_CLASS, bnode, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c9] 
	 */
	public GraphView (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of GraphView  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static GraphView  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, GraphView.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/08/15/nrl#GraphView).
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class1] 
	 */
	public static void createInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.createInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return true if instanceResource is an instance of this class in the model
	 *
	 * [Generated from RDFReactor template rule #class2] 
	 */
	public static boolean hasInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.hasInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as RDF resources
	 *
	 * [Generated from RDFReactor template rule #class3] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllInstances(Model model) {
		return Base.getAllInstances(model, RDFS_CLASS, org.ontoware.rdf2go.model.node.Resource.class);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as a ReactorResult,
	 * which can conveniently be converted to iterator, list or array.
	 *
	 * [Generated from RDFReactor template rule #class3-as] 
	 */
	public static ReactorResult<? extends GraphView> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, GraphView.class );
	}

    /**
	 * Remove rdf:type GraphView from this instance. Other triples are not affected.
	 * To delete more, use deleteAllProperties
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class4] 
	 */
	public static void deleteInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * Delete all (this, *, *), i.e. including rdf:type
	 * @param model an RDF2Go model
	 * @param resource
	 */
	public static void deleteAllProperties(Model model,	org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteAllProperties(model, instanceResource);
	}

    ///////////////////////////////////////////////////////////////////
    // property access methods


    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0d1759 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, SPECIFICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0d1759 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasSpecification() {
		return Base.has(this.model, this.getResource(), SPECIFICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0d1759 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, SPECIFICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0d1759 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasSpecification( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), SPECIFICATION);
	}

     /**
     * Get all values of property Specification as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSpecification_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, SPECIFICATION);
	}
	
    /**
     * Get all values of property Specification as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllSpecification_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, SPECIFICATION, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Specification as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSpecification_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), SPECIFICATION);
	}

    /**
     * Get all values of property Specification as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllSpecification_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), SPECIFICATION, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Specification     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nrl.ViewSpecification> getAllSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, SPECIFICATION, eu.dime.ps.semantic.model.nrl.ViewSpecification.class);
	}
	
    /**
     * Get all values of property Specification as a ReactorResult of ViewSpecification 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nrl.ViewSpecification> getAllSpecification_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, SPECIFICATION, eu.dime.ps.semantic.model.nrl.ViewSpecification.class);
	}

    /**
     * Get all values of property Specification     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nrl.ViewSpecification> getAllSpecification() {
		return Base.getAll(this.model, this.getResource(), SPECIFICATION, eu.dime.ps.semantic.model.nrl.ViewSpecification.class);
	}

    /**
     * Get all values of property Specification as a ReactorResult of ViewSpecification 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nrl.ViewSpecification> getAllSpecification_as() {
		return Base.getAll_as(this.model, this.getResource(), SPECIFICATION, eu.dime.ps.semantic.model.nrl.ViewSpecification.class);
	}
 
    /**
     * Adds a value to property Specification as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Adds a value to property Specification as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addSpecification( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), SPECIFICATION, value);
	}
    /**
     * Adds a value to property Specification from an instance of ViewSpecification 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.add(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Adds a value to property Specification from an instance of ViewSpecification 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addSpecification(eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.add(this.model, this.getResource(), SPECIFICATION, value);
	}
  

    /**
     * Sets a value of property Specification from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setSpecification( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Sets a value of property Specification from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setSpecification( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), SPECIFICATION, value);
	}
    /**
     * Sets a value of property Specification from an instance of ViewSpecification 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.set(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Sets a value of property Specification from an instance of ViewSpecification 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setSpecification(eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.set(this.model, this.getResource(), SPECIFICATION, value);
	}
  


    /**
     * Removes a value of property Specification as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeSpecification( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Removes a value of property Specification as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeSpecification( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), SPECIFICATION, value);
	}
    /**
     * Removes a value of property Specification given as an instance of ViewSpecification 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeSpecification(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.remove(model, instanceResource, SPECIFICATION, value);
	}
	
    /**
     * Removes a value of property Specification given as an instance of ViewSpecification 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeSpecification(eu.dime.ps.semantic.model.nrl.ViewSpecification value) {
		Base.remove(this.model, this.getResource(), SPECIFICATION, value);
	}
  
    /**
     * Removes all values of property Specification     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllSpecification( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, SPECIFICATION);
	}
	
    /**
     * Removes all values of property Specification	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllSpecification() {
		Base.removeAll(this.model, this.getResource(), SPECIFICATION);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@6347e1e9 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, VIEWON);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@6347e1e9 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasViewOn() {
		return Base.has(this.model, this.getResource(), VIEWON);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@6347e1e9 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, VIEWON);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@6347e1e9 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasViewOn( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), VIEWON);
	}

     /**
     * Get all values of property ViewOn as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllViewOn_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, VIEWON);
	}
	
    /**
     * Get all values of property ViewOn as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllViewOn_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, VIEWON, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property ViewOn as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllViewOn_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), VIEWON);
	}

    /**
     * Get all values of property ViewOn as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllViewOn_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), VIEWON, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property ViewOn     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nrl.Graph> getAllViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, VIEWON, eu.dime.ps.semantic.model.nrl.Graph.class);
	}
	
    /**
     * Get all values of property ViewOn as a ReactorResult of Graph 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nrl.Graph> getAllViewOn_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, VIEWON, eu.dime.ps.semantic.model.nrl.Graph.class);
	}

    /**
     * Get all values of property ViewOn     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nrl.Graph> getAllViewOn() {
		return Base.getAll(this.model, this.getResource(), VIEWON, eu.dime.ps.semantic.model.nrl.Graph.class);
	}

    /**
     * Get all values of property ViewOn as a ReactorResult of Graph 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nrl.Graph> getAllViewOn_as() {
		return Base.getAll_as(this.model, this.getResource(), VIEWON, eu.dime.ps.semantic.model.nrl.Graph.class);
	}
 
    /**
     * Adds a value to property ViewOn as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Adds a value to property ViewOn as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addViewOn( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), VIEWON, value);
	}
    /**
     * Adds a value to property ViewOn from an instance of Graph 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.add(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Adds a value to property ViewOn from an instance of Graph 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addViewOn(eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.add(this.model, this.getResource(), VIEWON, value);
	}
  

    /**
     * Sets a value of property ViewOn from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setViewOn( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Sets a value of property ViewOn from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setViewOn( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), VIEWON, value);
	}
    /**
     * Sets a value of property ViewOn from an instance of Graph 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.set(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Sets a value of property ViewOn from an instance of Graph 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setViewOn(eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.set(this.model, this.getResource(), VIEWON, value);
	}
  


    /**
     * Removes a value of property ViewOn as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeViewOn( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Removes a value of property ViewOn as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeViewOn( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), VIEWON, value);
	}
    /**
     * Removes a value of property ViewOn given as an instance of Graph 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeViewOn(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.remove(model, instanceResource, VIEWON, value);
	}
	
    /**
     * Removes a value of property ViewOn given as an instance of Graph 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeViewOn(eu.dime.ps.semantic.model.nrl.Graph value) {
		Base.remove(this.model, this.getResource(), VIEWON, value);
	}
  
    /**
     * Removes all values of property ViewOn     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllViewOn( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, VIEWON);
	}
	
    /**
     * Removes all values of property ViewOn	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllViewOn() {
		Base.removeAll(this.model, this.getResource(), VIEWON);
	}
 }