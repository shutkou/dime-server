package eu.dime.ps.semantic.model.ncal;

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
 *   <li> Comment </li>
 *   <li> CommentAltRep </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo extends eu.dime.ps.semantic.model.ncal.UnionParentClass {

    /** http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo", false);

    /** http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#comment */
    @SuppressWarnings("hiding")
	public static final URI COMMENT = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#comment",false);

    /** http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#commentAltRep */
    @SuppressWarnings("hiding")
	public static final URI COMMENTALTREP = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#commentAltRep",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#comment",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#commentAltRep",false) 
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
	protected UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo (Model model, BlankNode bnode, boolean write) {
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
	public UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/04/02/ncal#UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo).
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
	public static ReactorResult<? extends UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo.class );
	}

    /**
	 * Remove rdf:type UnionOfTimezoneObservanceEventFreebusyJournalTimezoneTodo from this instance. Other triples are not affected.
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
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@2c0c7e73 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, COMMENT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@2c0c7e73 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasComment() {
		return Base.has(this.model, this.getResource(), COMMENT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@2c0c7e73 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, COMMENT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@2c0c7e73 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasComment( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), COMMENT);
	}

     /**
     * Get all values of property Comment as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllComment_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, COMMENT);
	}
	
    /**
     * Get all values of property Comment as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllComment_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, COMMENT, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Comment as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllComment_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), COMMENT);
	}

    /**
     * Get all values of property Comment as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllComment_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), COMMENT, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Comment     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<java.lang.String> getAllComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, COMMENT, java.lang.String.class);
	}
	
    /**
     * Get all values of property Comment as a ReactorResult of java.lang.String 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<java.lang.String> getAllComment_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, COMMENT, java.lang.String.class);
	}

    /**
     * Get all values of property Comment     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<java.lang.String> getAllComment() {
		return Base.getAll(this.model, this.getResource(), COMMENT, java.lang.String.class);
	}

    /**
     * Get all values of property Comment as a ReactorResult of java.lang.String 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<java.lang.String> getAllComment_as() {
		return Base.getAll_as(this.model, this.getResource(), COMMENT, java.lang.String.class);
	}
 
    /**
     * Adds a value to property Comment as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Adds a value to property Comment as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addComment( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), COMMENT, value);
	}
    /**
     * Adds a value to property Comment from an instance of java.lang.String 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.String value) {
		Base.add(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Adds a value to property Comment from an instance of java.lang.String 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addComment(java.lang.String value) {
		Base.add(this.model, this.getResource(), COMMENT, value);
	}
  

    /**
     * Sets a value of property Comment from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setComment( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Sets a value of property Comment from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setComment( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), COMMENT, value);
	}
    /**
     * Sets a value of property Comment from an instance of java.lang.String 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.String value) {
		Base.set(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Sets a value of property Comment from an instance of java.lang.String 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setComment(java.lang.String value) {
		Base.set(this.model, this.getResource(), COMMENT, value);
	}
  


    /**
     * Removes a value of property Comment as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeComment( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Removes a value of property Comment as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeComment( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), COMMENT, value);
	}
    /**
     * Removes a value of property Comment given as an instance of java.lang.String 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeComment(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.String value) {
		Base.remove(model, instanceResource, COMMENT, value);
	}
	
    /**
     * Removes a value of property Comment given as an instance of java.lang.String 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeComment(java.lang.String value) {
		Base.remove(this.model, this.getResource(), COMMENT, value);
	}
  
    /**
     * Removes all values of property Comment     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllComment( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, COMMENT);
	}
	
    /**
     * Removes all values of property Comment	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllComment() {
		Base.removeAll(this.model, this.getResource(), COMMENT);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@3f41888e has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, COMMENTALTREP);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@3f41888e has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasCommentAltRep() {
		return Base.has(this.model, this.getResource(), COMMENTALTREP);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@3f41888e has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, COMMENTALTREP);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@3f41888e has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasCommentAltRep( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), COMMENTALTREP);
	}

     /**
     * Get all values of property CommentAltRep as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllCommentAltRep_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, COMMENTALTREP);
	}
	
    /**
     * Get all values of property CommentAltRep as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllCommentAltRep_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, COMMENTALTREP, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property CommentAltRep as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllCommentAltRep_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), COMMENTALTREP);
	}

    /**
     * Get all values of property CommentAltRep as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllCommentAltRep_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), COMMENTALTREP, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property CommentAltRep     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, COMMENTALTREP, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}
	
    /**
     * Get all values of property CommentAltRep as a ReactorResult of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllCommentAltRep_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, COMMENTALTREP, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

    /**
     * Get all values of property CommentAltRep     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllCommentAltRep() {
		return Base.getAll(this.model, this.getResource(), COMMENTALTREP, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

    /**
     * Get all values of property CommentAltRep as a ReactorResult of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllCommentAltRep_as() {
		return Base.getAll_as(this.model, this.getResource(), COMMENTALTREP, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}
 
    /**
     * Adds a value to property CommentAltRep as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Adds a value to property CommentAltRep as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addCommentAltRep( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), COMMENTALTREP, value);
	}
    /**
     * Adds a value to property CommentAltRep from an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.add(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Adds a value to property CommentAltRep from an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addCommentAltRep(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.add(this.model, this.getResource(), COMMENTALTREP, value);
	}
  

    /**
     * Sets a value of property CommentAltRep from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setCommentAltRep( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Sets a value of property CommentAltRep from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setCommentAltRep( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), COMMENTALTREP, value);
	}
    /**
     * Sets a value of property CommentAltRep from an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.set(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Sets a value of property CommentAltRep from an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setCommentAltRep(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.set(this.model, this.getResource(), COMMENTALTREP, value);
	}
  


    /**
     * Removes a value of property CommentAltRep as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeCommentAltRep( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Removes a value of property CommentAltRep as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeCommentAltRep( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), COMMENTALTREP, value);
	}
    /**
     * Removes a value of property CommentAltRep given as an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeCommentAltRep(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.remove(model, instanceResource, COMMENTALTREP, value);
	}
	
    /**
     * Removes a value of property CommentAltRep given as an instance of org.ontoware.rdfreactor.schema.rdfs.Resource 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeCommentAltRep(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.remove(this.model, this.getResource(), COMMENTALTREP, value);
	}
  
    /**
     * Removes all values of property CommentAltRep     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllCommentAltRep( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, COMMENTALTREP);
	}
	
    /**
     * Removes all values of property CommentAltRep	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllCommentAltRep() {
		Base.removeAll(this.model, this.getResource(), COMMENTALTREP);
	}
 }