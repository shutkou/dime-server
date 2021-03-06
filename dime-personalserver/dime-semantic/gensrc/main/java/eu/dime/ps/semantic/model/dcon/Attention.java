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

package eu.dime.ps.semantic.model.dcon;

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
 *   <li> ActiveApplication </li>
 *   <li> ActiveFile </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class Attention extends eu.dime.ps.semantic.model.dcon.Aspect {

    /** http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#Attention */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#Attention", false);

    /** http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeApplication */
    @SuppressWarnings("hiding")
	public static final URI ACTIVEAPPLICATION = new URIImpl("http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeApplication",false);

    /** http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeFile */
    @SuppressWarnings("hiding")
	public static final URI ACTIVEFILE = new URIImpl("http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeFile",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeApplication",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#activeFile",false) 
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
	protected Attention (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public Attention (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public Attention (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public Attention (Model model, BlankNode bnode, boolean write) {
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
	public Attention (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of Attention  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static Attention  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, Attention.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2011/10/05/dcon#Attention).
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
	public static ReactorResult<? extends Attention> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, Attention.class );
	}

    /**
	 * Remove rdf:type Attention from this instance. Other triples are not affected.
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
	 * @return all A's as RDF resources, that have a relation 'Attention' to this Attention instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllAttention_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.RDFReactorThing.ATTENTION, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'Attention' to this Attention instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllAttention_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.RDFReactorThing.ATTENTION, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'Attention' to this Attention instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllAttention_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.RDFReactorThing.ATTENTION, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}



    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5661aa2f has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, ACTIVEAPPLICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5661aa2f has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasActiveApplication() {
		return Base.has(this.model, this.getResource(), ACTIVEAPPLICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5661aa2f has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, ACTIVEAPPLICATION);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@5661aa2f has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasActiveApplication( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), ACTIVEAPPLICATION);
	}

     /**
     * Get all values of property ActiveApplication as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllActiveApplication_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, ACTIVEAPPLICATION);
	}
	
    /**
     * Get all values of property ActiveApplication as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllActiveApplication_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, ACTIVEAPPLICATION, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property ActiveApplication as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllActiveApplication_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), ACTIVEAPPLICATION);
	}

    /**
     * Get all values of property ActiveApplication as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllActiveApplication_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), ACTIVEAPPLICATION, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property ActiveApplication     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nfo.Application> getAllActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, ACTIVEAPPLICATION, eu.dime.ps.semantic.model.nfo.Application.class);
	}
	
    /**
     * Get all values of property ActiveApplication as a ReactorResult of Application 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nfo.Application> getAllActiveApplication_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, ACTIVEAPPLICATION, eu.dime.ps.semantic.model.nfo.Application.class);
	}

    /**
     * Get all values of property ActiveApplication     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nfo.Application> getAllActiveApplication() {
		return Base.getAll(this.model, this.getResource(), ACTIVEAPPLICATION, eu.dime.ps.semantic.model.nfo.Application.class);
	}

    /**
     * Get all values of property ActiveApplication as a ReactorResult of Application 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nfo.Application> getAllActiveApplication_as() {
		return Base.getAll_as(this.model, this.getResource(), ACTIVEAPPLICATION, eu.dime.ps.semantic.model.nfo.Application.class);
	}
 
    /**
     * Adds a value to property ActiveApplication as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Adds a value to property ActiveApplication as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addActiveApplication( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
    /**
     * Adds a value to property ActiveApplication from an instance of Application 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Application value) {
		Base.add(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Adds a value to property ActiveApplication from an instance of Application 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addActiveApplication(eu.dime.ps.semantic.model.nfo.Application value) {
		Base.add(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
  

    /**
     * Sets a value of property ActiveApplication from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setActiveApplication( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Sets a value of property ActiveApplication from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setActiveApplication( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
    /**
     * Sets a value of property ActiveApplication from an instance of Application 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Application value) {
		Base.set(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Sets a value of property ActiveApplication from an instance of Application 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setActiveApplication(eu.dime.ps.semantic.model.nfo.Application value) {
		Base.set(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
  


    /**
     * Removes a value of property ActiveApplication as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeActiveApplication( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Removes a value of property ActiveApplication as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeActiveApplication( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
    /**
     * Removes a value of property ActiveApplication given as an instance of Application 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeActiveApplication(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Application value) {
		Base.remove(model, instanceResource, ACTIVEAPPLICATION, value);
	}
	
    /**
     * Removes a value of property ActiveApplication given as an instance of Application 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeActiveApplication(eu.dime.ps.semantic.model.nfo.Application value) {
		Base.remove(this.model, this.getResource(), ACTIVEAPPLICATION, value);
	}
  
    /**
     * Removes all values of property ActiveApplication     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllActiveApplication( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, ACTIVEAPPLICATION);
	}
	
    /**
     * Removes all values of property ActiveApplication	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllActiveApplication() {
		Base.removeAll(this.model, this.getResource(), ACTIVEAPPLICATION);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@87409cf has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, ACTIVEFILE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@87409cf has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasActiveFile() {
		return Base.has(this.model, this.getResource(), ACTIVEFILE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@87409cf has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, ACTIVEFILE);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@87409cf has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasActiveFile( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), ACTIVEFILE);
	}

     /**
     * Get all values of property ActiveFile as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllActiveFile_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, ACTIVEFILE);
	}
	
    /**
     * Get all values of property ActiveFile as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllActiveFile_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, ACTIVEFILE, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property ActiveFile as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllActiveFile_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), ACTIVEFILE);
	}

    /**
     * Get all values of property ActiveFile as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllActiveFile_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), ACTIVEFILE, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property ActiveFile     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nie.InformationElement> getAllActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, ACTIVEFILE, eu.dime.ps.semantic.model.nie.InformationElement.class);
	}
	
    /**
     * Get all values of property ActiveFile as a ReactorResult of InformationElement 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nie.InformationElement> getAllActiveFile_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, ACTIVEFILE, eu.dime.ps.semantic.model.nie.InformationElement.class);
	}

    /**
     * Get all values of property ActiveFile     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nie.InformationElement> getAllActiveFile() {
		return Base.getAll(this.model, this.getResource(), ACTIVEFILE, eu.dime.ps.semantic.model.nie.InformationElement.class);
	}

    /**
     * Get all values of property ActiveFile as a ReactorResult of InformationElement 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nie.InformationElement> getAllActiveFile_as() {
		return Base.getAll_as(this.model, this.getResource(), ACTIVEFILE, eu.dime.ps.semantic.model.nie.InformationElement.class);
	}
 
    /**
     * Adds a value to property ActiveFile as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Adds a value to property ActiveFile as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addActiveFile( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), ACTIVEFILE, value);
	}
    /**
     * Adds a value to property ActiveFile from an instance of InformationElement 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.add(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Adds a value to property ActiveFile from an instance of InformationElement 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addActiveFile(eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.add(this.model, this.getResource(), ACTIVEFILE, value);
	}
  

    /**
     * Sets a value of property ActiveFile from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setActiveFile( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Sets a value of property ActiveFile from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setActiveFile( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), ACTIVEFILE, value);
	}
    /**
     * Sets a value of property ActiveFile from an instance of InformationElement 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.set(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Sets a value of property ActiveFile from an instance of InformationElement 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setActiveFile(eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.set(this.model, this.getResource(), ACTIVEFILE, value);
	}
  


    /**
     * Removes a value of property ActiveFile as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeActiveFile( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Removes a value of property ActiveFile as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeActiveFile( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), ACTIVEFILE, value);
	}
    /**
     * Removes a value of property ActiveFile given as an instance of InformationElement 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeActiveFile(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.remove(model, instanceResource, ACTIVEFILE, value);
	}
	
    /**
     * Removes a value of property ActiveFile given as an instance of InformationElement 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeActiveFile(eu.dime.ps.semantic.model.nie.InformationElement value) {
		Base.remove(this.model, this.getResource(), ACTIVEFILE, value);
	}
  
    /**
     * Removes all values of property ActiveFile     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllActiveFile( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, ACTIVEFILE);
	}
	
    /**
     * Removes all values of property ActiveFile	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllActiveFile() {
		Base.removeAll(this.model, this.getResource(), ACTIVEFILE);
	}
 }