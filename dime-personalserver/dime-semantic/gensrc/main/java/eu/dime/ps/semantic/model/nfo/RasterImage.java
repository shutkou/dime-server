package eu.dime.ps.semantic.model.nfo;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;
import org.ontoware.rdfreactor.runtime.CardinalityException;


/**
 * This class manages access to these properties:
 * <ul>
 *   <li> ColorCount </li>
 *   <li> PaletteSize </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class RasterImage extends eu.dime.ps.semantic.model.nfo.Image {

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#RasterImage */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#RasterImage", false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#colorCount */
    @SuppressWarnings("hiding")
	public static final URI COLORCOUNT = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#colorCount",false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#paletteSize */
    @SuppressWarnings("hiding")
	public static final URI PALETTESIZE = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#paletteSize",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#colorCount",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#paletteSize",false) 
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
	protected RasterImage (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public RasterImage (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public RasterImage (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public RasterImage (Model model, BlankNode bnode, boolean write) {
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
	public RasterImage (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of RasterImage  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static RasterImage  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, RasterImage.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#RasterImage).
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
	public static ReactorResult<? extends RasterImage> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, RasterImage.class );
	}

    /**
	 * Remove rdf:type RasterImage from this instance. Other triples are not affected.
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
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0b52dd has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, COLORCOUNT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0b52dd has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasColorCount() {
		return Base.has(this.model, this.getResource(), COLORCOUNT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0b52dd has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, COLORCOUNT);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e0b52dd has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasColorCount( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), COLORCOUNT);
	}

    /**
     * Get single value of property ColorCount as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException at runtime, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get1static] 
     */
	public static org.ontoware.rdf2go.model.node.Node getColorCount_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.get_asNode(model, instanceResource, COLORCOUNT);
	}
	
    /**
     * Get single value of property ColorCount as an RDF2Go node 
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get2dynamic] 
     */
	public org.ontoware.rdf2go.model.node.Node getColorCount_asNode() {
		return Base.get_asNode(this.model, this.getResource(), COLORCOUNT);
	}
     /**
     * Get single value of property ColorCount     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get5static] 
     */
	public static java.lang.Integer getColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (java.lang.Integer) Base.get(model, instanceResource, COLORCOUNT, java.lang.Integer.class);
	}
	
    /**
     * Get single value of property ColorCount  .
     * This property has maxCardinality=1, that means the property takes only
     * a single value.
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get6dynamic] 
     */
	public java.lang.Integer getColorCount() {
		return (java.lang.Integer) Base.get(this.model, this.getResource(), COLORCOUNT, java.lang.Integer.class);
	}
  
    /**
     * Adds a value to property ColorCount as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add5static] 
     */
	public static void addColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(model, instanceResource, COLORCOUNT, value, 1);
	}
	
    /**
     * Adds a value to property ColorCount as an RDF2Go node 
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add6dynamic] 
     */
	public void addColorCount( org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), COLORCOUNT, value, 1);
	}
    /**
     * Adds a value to property ColorCount from an instance of java.lang.Integer 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add7static] 
     */
	public static void addColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value)
    throws CardinalityException {
		Base.add(model, instanceResource, COLORCOUNT, value, 1);
	}
	
    /**
     * Adds a value to property ColorCount from an instance of java.lang.Integer 
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add8dynamic] 
     */
	public void addColorCount(java.lang.Integer value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), COLORCOUNT, value, 1);
	}
 
 

    /**
     * Sets a value of property ColorCount from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setColorCount( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, COLORCOUNT, value);
	}
	
    /**
     * Sets a value of property ColorCount from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setColorCount( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), COLORCOUNT, value);
	}
    /**
     * Sets a value of property ColorCount from an instance of java.lang.Integer 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value) {
		Base.set(model, instanceResource, COLORCOUNT, value);
	}
	
    /**
     * Sets a value of property ColorCount from an instance of java.lang.Integer 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setColorCount(java.lang.Integer value) {
		Base.set(this.model, this.getResource(), COLORCOUNT, value);
	}
  


    /**
     * Removes a value of property ColorCount as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeColorCount( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, COLORCOUNT, value);
	}
	
    /**
     * Removes a value of property ColorCount as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeColorCount( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), COLORCOUNT, value);
	}
    /**
     * Removes a value of property ColorCount given as an instance of java.lang.Integer 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeColorCount(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value) {
		Base.remove(model, instanceResource, COLORCOUNT, value);
	}
	
    /**
     * Removes a value of property ColorCount given as an instance of java.lang.Integer 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeColorCount(java.lang.Integer value) {
		Base.remove(this.model, this.getResource(), COLORCOUNT, value);
	}
  
    /**
     * Removes all values of property ColorCount     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllColorCount( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, COLORCOUNT);
	}
	
    /**
     * Removes all values of property ColorCount	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllColorCount() {
		Base.removeAll(this.model, this.getResource(), COLORCOUNT);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@17922039 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, PALETTESIZE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@17922039 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasPaletteSize() {
		return Base.has(this.model, this.getResource(), PALETTESIZE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@17922039 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, PALETTESIZE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@17922039 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasPaletteSize( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), PALETTESIZE);
	}

    /**
     * Get single value of property PaletteSize as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException at runtime, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get1static] 
     */
	public static org.ontoware.rdf2go.model.node.Node getPaletteSize_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.get_asNode(model, instanceResource, PALETTESIZE);
	}
	
    /**
     * Get single value of property PaletteSize as an RDF2Go node 
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get2dynamic] 
     */
	public org.ontoware.rdf2go.model.node.Node getPaletteSize_asNode() {
		return Base.get_asNode(this.model, this.getResource(), PALETTESIZE);
	}
     /**
     * Get single value of property PaletteSize     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get5static] 
     */
	public static java.lang.Integer getPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (java.lang.Integer) Base.get(model, instanceResource, PALETTESIZE, java.lang.Integer.class);
	}
	
    /**
     * Get single value of property PaletteSize  .
     * This property has maxCardinality=1, that means the property takes only
     * a single value.
     * @return the single value or null if no value is found
     * @throws RDFDataException, if the property has multiple values
	 *
	 * [Generated from RDFReactor template rule #get6dynamic] 
     */
	public java.lang.Integer getPaletteSize() {
		return (java.lang.Integer) Base.get(this.model, this.getResource(), PALETTESIZE, java.lang.Integer.class);
	}
  
    /**
     * Adds a value to property PaletteSize as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add5static] 
     */
	public static void addPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(model, instanceResource, PALETTESIZE, value, 1);
	}
	
    /**
     * Adds a value to property PaletteSize as an RDF2Go node 
	 * @param value the value to be added
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add6dynamic] 
     */
	public void addPaletteSize( org.ontoware.rdf2go.model.node.Node value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), PALETTESIZE, value, 1);
	}
    /**
     * Adds a value to property PaletteSize from an instance of java.lang.Integer 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add7static] 
     */
	public static void addPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value)
    throws CardinalityException {
		Base.add(model, instanceResource, PALETTESIZE, value, 1);
	}
	
    /**
     * Adds a value to property PaletteSize from an instance of java.lang.Integer 
	 * @throws CardinalityException if adding a value would bring the number 
	 *            of property values above the cardinality constraint.
	 *
	 * [Generated from RDFReactor template rule #add8dynamic] 
     */
	public void addPaletteSize(java.lang.Integer value) 
    throws CardinalityException {
		Base.add(this.model, this.getResource(), PALETTESIZE, value, 1);
	}
 
 

    /**
     * Sets a value of property PaletteSize from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setPaletteSize( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, PALETTESIZE, value);
	}
	
    /**
     * Sets a value of property PaletteSize from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setPaletteSize( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), PALETTESIZE, value);
	}
    /**
     * Sets a value of property PaletteSize from an instance of java.lang.Integer 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setPaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value) {
		Base.set(model, instanceResource, PALETTESIZE, value);
	}
	
    /**
     * Sets a value of property PaletteSize from an instance of java.lang.Integer 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setPaletteSize(java.lang.Integer value) {
		Base.set(this.model, this.getResource(), PALETTESIZE, value);
	}
  


    /**
     * Removes a value of property PaletteSize as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removePaletteSize( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, PALETTESIZE, value);
	}
	
    /**
     * Removes a value of property PaletteSize as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removePaletteSize( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), PALETTESIZE, value);
	}
    /**
     * Removes a value of property PaletteSize given as an instance of java.lang.Integer 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removePaletteSize(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Integer value) {
		Base.remove(model, instanceResource, PALETTESIZE, value);
	}
	
    /**
     * Removes a value of property PaletteSize given as an instance of java.lang.Integer 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removePaletteSize(java.lang.Integer value) {
		Base.remove(this.model, this.getResource(), PALETTESIZE, value);
	}
  
    /**
     * Removes all values of property PaletteSize     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllPaletteSize( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, PALETTESIZE);
	}
	
    /**
     * Removes all values of property PaletteSize	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllPaletteSize() {
		Base.removeAll(this.model, this.getResource(), PALETTESIZE);
	}
 }