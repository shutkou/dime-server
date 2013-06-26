package eu.dime.ps.semantic.model.nfo;

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
 *   <li> Conflicts </li>
 *   <li> Supercedes </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class Software extends eu.dime.ps.semantic.model.nie.InformationElement {

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#Software */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#Software", false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#conflicts */
    @SuppressWarnings("hiding")
	public static final URI CONFLICTS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#conflicts",false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#supercedes */
    @SuppressWarnings("hiding")
	public static final URI SUPERCEDES = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#supercedes",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#conflicts",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#supercedes",false) 
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
	protected Software (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public Software (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public Software (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public Software (Model model, BlankNode bnode, boolean write) {
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
	public Software (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of Software  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static Software  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, Software.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#Software).
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
	public static ReactorResult<? extends Software> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, Software.class );
	}

    /**
	 * Remove rdf:type Software from this instance. Other triples are not affected.
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
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'Conflicts' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllConflicts_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.nfo.Software.CONFLICTS, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'Conflicts' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllConflicts_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.nfo.Software.CONFLICTS, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'Conflicts' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllConflicts_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.nfo.Software.CONFLICTS, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}


	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'Supercedes' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllSupercedes_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.nfo.Software.SUPERCEDES, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'Supercedes' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllSupercedes_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.nfo.Software.SUPERCEDES, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'Supercedes' to this Software instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllSupercedes_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.nfo.Software.SUPERCEDES, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}



    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@72edc05b has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, CONFLICTS);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@72edc05b has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasConflicts() {
		return Base.has(this.model, this.getResource(), CONFLICTS);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@72edc05b has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, CONFLICTS);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@72edc05b has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasConflicts( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), CONFLICTS);
	}

     /**
     * Get all values of property Conflicts as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllConflicts_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, CONFLICTS);
	}
	
    /**
     * Get all values of property Conflicts as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllConflicts_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONFLICTS, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Conflicts as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllConflicts_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), CONFLICTS);
	}

    /**
     * Get all values of property Conflicts as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllConflicts_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), CONFLICTS, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Conflicts     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nfo.Software> getAllConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, CONFLICTS, eu.dime.ps.semantic.model.nfo.Software.class);
	}
	
    /**
     * Get all values of property Conflicts as a ReactorResult of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nfo.Software> getAllConflicts_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONFLICTS, eu.dime.ps.semantic.model.nfo.Software.class);
	}

    /**
     * Get all values of property Conflicts     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nfo.Software> getAllConflicts() {
		return Base.getAll(this.model, this.getResource(), CONFLICTS, eu.dime.ps.semantic.model.nfo.Software.class);
	}

    /**
     * Get all values of property Conflicts as a ReactorResult of Software 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nfo.Software> getAllConflicts_as() {
		return Base.getAll_as(this.model, this.getResource(), CONFLICTS, eu.dime.ps.semantic.model.nfo.Software.class);
	}
 
    /**
     * Adds a value to property Conflicts as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Adds a value to property Conflicts as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addConflicts( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), CONFLICTS, value);
	}
    /**
     * Adds a value to property Conflicts from an instance of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.add(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Adds a value to property Conflicts from an instance of Software 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addConflicts(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.add(this.model, this.getResource(), CONFLICTS, value);
	}
  

    /**
     * Sets a value of property Conflicts from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setConflicts( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Sets a value of property Conflicts from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setConflicts( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), CONFLICTS, value);
	}
    /**
     * Sets a value of property Conflicts from an instance of Software 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.set(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Sets a value of property Conflicts from an instance of Software 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setConflicts(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.set(this.model, this.getResource(), CONFLICTS, value);
	}
  


    /**
     * Removes a value of property Conflicts as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeConflicts( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Removes a value of property Conflicts as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeConflicts( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), CONFLICTS, value);
	}
    /**
     * Removes a value of property Conflicts given as an instance of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeConflicts(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.remove(model, instanceResource, CONFLICTS, value);
	}
	
    /**
     * Removes a value of property Conflicts given as an instance of Software 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeConflicts(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.remove(this.model, this.getResource(), CONFLICTS, value);
	}
  
    /**
     * Removes all values of property Conflicts     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllConflicts( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, CONFLICTS);
	}
	
    /**
     * Removes all values of property Conflicts	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllConflicts() {
		Base.removeAll(this.model, this.getResource(), CONFLICTS);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7230adcb has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, SUPERCEDES);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7230adcb has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasSupercedes() {
		return Base.has(this.model, this.getResource(), SUPERCEDES);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7230adcb has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, SUPERCEDES);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7230adcb has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasSupercedes( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), SUPERCEDES);
	}

     /**
     * Get all values of property Supercedes as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSupercedes_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, SUPERCEDES);
	}
	
    /**
     * Get all values of property Supercedes as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllSupercedes_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, SUPERCEDES, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Supercedes as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSupercedes_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), SUPERCEDES);
	}

    /**
     * Get all values of property Supercedes as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllSupercedes_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), SUPERCEDES, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Supercedes     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nfo.Software> getAllSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, SUPERCEDES, eu.dime.ps.semantic.model.nfo.Software.class);
	}
	
    /**
     * Get all values of property Supercedes as a ReactorResult of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nfo.Software> getAllSupercedes_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, SUPERCEDES, eu.dime.ps.semantic.model.nfo.Software.class);
	}

    /**
     * Get all values of property Supercedes     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nfo.Software> getAllSupercedes() {
		return Base.getAll(this.model, this.getResource(), SUPERCEDES, eu.dime.ps.semantic.model.nfo.Software.class);
	}

    /**
     * Get all values of property Supercedes as a ReactorResult of Software 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nfo.Software> getAllSupercedes_as() {
		return Base.getAll_as(this.model, this.getResource(), SUPERCEDES, eu.dime.ps.semantic.model.nfo.Software.class);
	}
 
    /**
     * Adds a value to property Supercedes as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Adds a value to property Supercedes as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addSupercedes( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), SUPERCEDES, value);
	}
    /**
     * Adds a value to property Supercedes from an instance of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.add(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Adds a value to property Supercedes from an instance of Software 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addSupercedes(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.add(this.model, this.getResource(), SUPERCEDES, value);
	}
  

    /**
     * Sets a value of property Supercedes from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setSupercedes( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Sets a value of property Supercedes from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setSupercedes( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), SUPERCEDES, value);
	}
    /**
     * Sets a value of property Supercedes from an instance of Software 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.set(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Sets a value of property Supercedes from an instance of Software 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setSupercedes(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.set(this.model, this.getResource(), SUPERCEDES, value);
	}
  


    /**
     * Removes a value of property Supercedes as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeSupercedes( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Removes a value of property Supercedes as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeSupercedes( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), SUPERCEDES, value);
	}
    /**
     * Removes a value of property Supercedes given as an instance of Software 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeSupercedes(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Software value) {
		Base.remove(model, instanceResource, SUPERCEDES, value);
	}
	
    /**
     * Removes a value of property Supercedes given as an instance of Software 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeSupercedes(eu.dime.ps.semantic.model.nfo.Software value) {
		Base.remove(this.model, this.getResource(), SUPERCEDES, value);
	}
  
    /**
     * Removes all values of property Supercedes     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllSupercedes( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, SUPERCEDES);
	}
	
    /**
     * Removes all values of property Supercedes	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllSupercedes() {
		Base.removeAll(this.model, this.getResource(), SUPERCEDES);
	}
 }