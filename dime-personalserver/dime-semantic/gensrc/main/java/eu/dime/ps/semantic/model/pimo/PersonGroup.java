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

package eu.dime.ps.semantic.model.pimo;

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
 *   <li> Member </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class PersonGroup extends eu.dime.ps.semantic.model.pimo.Collection {

    /** http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#PersonGroup */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#PersonGroup", false);

    /** http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#hasMember */
    @SuppressWarnings("hiding")
	public static final URI MEMBER = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#hasMember",false);

    /** http://www.semanticdesktop.org/ontologies/2007/08/15/nao#trustLevel */
    @SuppressWarnings("hiding")
	public static final URI TRUSTLEVEL = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nao#trustLevel",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#hasMember",false), 
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/08/15/nao#trustLevel",false) 
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
	protected PersonGroup (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public PersonGroup (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public PersonGroup (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public PersonGroup (Model model, BlankNode bnode, boolean write) {
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
	public PersonGroup (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of PersonGroup  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static PersonGroup  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, PersonGroup.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/11/01/pimo#PersonGroup).
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
	public static ReactorResult<? extends PersonGroup> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, PersonGroup.class );
	}

    /**
	 * Remove rdf:type PersonGroup from this instance. Other triples are not affected.
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
	 * @return all A's as RDF resources, that have a relation 'AdHocGroup' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllAdHocGroup_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.dcon.Peers.ADHOCGROUP, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'AdHocGroup' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllAdHocGroup_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.dcon.Peers.ADHOCGROUP, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'AdHocGroup' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllAdHocGroup_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.dcon.Peers.ADHOCGROUP, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}


	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'MemberOf' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllMemberOf_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.pimo.Agent.MEMBEROF, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'MemberOf' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllMemberOf_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.pimo.Agent.MEMBEROF, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'MemberOf' to this PersonGroup instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllMemberOf_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.pimo.Agent.MEMBEROF, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}



    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@256ed330 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, MEMBER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@256ed330 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasMember() {
		return Base.has(this.model, this.getResource(), MEMBER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@256ed330 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, MEMBER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@256ed330 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasMember( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), MEMBER);
	}

     /**
     * Get all values of property Member as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllMember_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, MEMBER);
	}
	
    /**
     * Get all values of property Member as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllMember_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, MEMBER, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property Member as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllMember_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), MEMBER);
	}

    /**
     * Get all values of property Member as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllMember_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), MEMBER, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property Member     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.pimo.Agent> getAllMembers(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, MEMBER, eu.dime.ps.semantic.model.pimo.Agent.class);
	}
	
    /**
     * Get all values of property Member as a ReactorResult of Agent 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.pimo.Agent> getAllMembers_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, MEMBER, eu.dime.ps.semantic.model.pimo.Agent.class);
	}

    /**
     * Get all values of property Member     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.pimo.Agent> getAllMembers() {
		return Base.getAll(this.model, this.getResource(), MEMBER, eu.dime.ps.semantic.model.pimo.Agent.class);
	}

    /**
     * Get all values of property Member as a ReactorResult of Agent 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.pimo.Agent> getAllMembers_as() {
		return Base.getAll_as(this.model, this.getResource(), MEMBER, eu.dime.ps.semantic.model.pimo.Agent.class);
	}
 
    /**
     * Adds a value to property Member as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Adds a value to property Member as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addMember( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), MEMBER, value);
	}
    /**
     * Adds a value to property Member from an instance of Agent 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.add(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Adds a value to property Member from an instance of Agent 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addMember(eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.add(this.model, this.getResource(), MEMBER, value);
	}
  

    /**
     * Sets a value of property Member from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setMember( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Sets a value of property Member from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setMember( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), MEMBER, value);
	}
    /**
     * Sets a value of property Member from an instance of Agent 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.set(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Sets a value of property Member from an instance of Agent 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setMember(eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.set(this.model, this.getResource(), MEMBER, value);
	}
  


    /**
     * Removes a value of property Member as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeMember( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Removes a value of property Member as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeMember( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), MEMBER, value);
	}
    /**
     * Removes a value of property Member given as an instance of Agent 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeMember(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.remove(model, instanceResource, MEMBER, value);
	}
	
    /**
     * Removes a value of property Member given as an instance of Agent 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeMember(eu.dime.ps.semantic.model.pimo.Agent value) {
		Base.remove(this.model, this.getResource(), MEMBER, value);
	}
  
    /**
     * Removes all values of property Member     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllMember( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, MEMBER);
	}
	
    /**
     * Removes all values of property Member	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllMember() {
		Base.removeAll(this.model, this.getResource(), MEMBER);
	}
 
    /**
    * Check if org.ontoware.rdfreactor.generator.java.JProperty@1c8963f4 has at least one value set 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
    * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
    */
	public static boolean hasTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, TRUSTLEVEL);
	}

   /**
    * Check if org.ontoware.rdfreactor.generator.java.JProperty@1c8963f4 has at least one value set 
    * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
    */
	public boolean hasTrustLevel() {
		return Base.has(this.model, this.getResource(), TRUSTLEVEL);
	}

   /**
    * Check if org.ontoware.rdfreactor.generator.java.JProperty@1c8963f4 has the given value (maybe among other values).  
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be checked
    * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
    */
	public static boolean hasTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, TRUSTLEVEL);
	}

   /**
    * Check if org.ontoware.rdfreactor.generator.java.JProperty@1c8963f4 has the given value (maybe among other values).  
	 * @param value the value to be checked
    * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
    */
	public boolean hasTrustLevel( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), TRUSTLEVEL);
	}

    /**
    * Get all values of property TrustLevel as an Iterator over RDF2Go nodes 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
    * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
    */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllTrustLevel_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, TRUSTLEVEL);
	}
	
   /**
    * Get all values of property TrustLevel as a ReactorResult of RDF2Go nodes 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
    * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
    */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllTrustLevel_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, TRUSTLEVEL, org.ontoware.rdf2go.model.node.Node.class);
	}

   /**
    * Get all values of property TrustLevel as an Iterator over RDF2Go nodes 
    * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
    */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllTrustLevel_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), TRUSTLEVEL);
	}

   /**
    * Get all values of property TrustLevel as a ReactorResult of RDF2Go nodes 
    * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
    */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllTrustLevel_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), TRUSTLEVEL, org.ontoware.rdf2go.model.node.Node.class);
	}
    /**
    * Get all values of property TrustLevel     * @param model an RDF2Go model
    * @param resource an RDF2Go resource
    * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
    */
	public static ClosableIterator<java.lang.Double> getAllTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, TRUSTLEVEL, java.lang.Double.class);
	}
	
   /**
    * Get all values of property TrustLevel as a ReactorResult of java.lang.Double 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
    * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
    */
	public static ReactorResult<java.lang.Double> getAllTrustLevel_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, TRUSTLEVEL, java.lang.Double.class);
	}

   /**
    * Get all values of property TrustLevel     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
    */
	public ClosableIterator<java.lang.Double> getAllTrustLevel() {
		return Base.getAll(this.model, this.getResource(), TRUSTLEVEL, java.lang.Double.class);
	}

   /**
    * Get all values of property TrustLevel as a ReactorResult of java.lang.Double 
    * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
    */
	public ReactorResult<java.lang.Double> getAllTrustLevel_as() {
		return Base.getAll_as(this.model, this.getResource(), TRUSTLEVEL, java.lang.Double.class);
	}

   /**
    * Adds a value to property TrustLevel as an RDF2Go node 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
    */
	public static void addTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Adds a value to property TrustLevel as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
    */
	public void addTrustLevel( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), TRUSTLEVEL, value);
	}
   /**
    * Adds a value to property TrustLevel from an instance of java.lang.Double 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
    */
	public static void addTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Double value) {
		Base.add(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Adds a value to property TrustLevel from an instance of java.lang.Double 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
    */
	public void addTrustLevel(java.lang.Double value) {
		Base.add(this.model, this.getResource(), TRUSTLEVEL, value);
	}
 

   /**
    * Sets a value of property TrustLevel from an RDF2Go node.
    * First, all existing values are removed, then this value is added.
    * Cardinality constraints are not checked, but this method exists only for properties with
    * no minCardinality or minCardinality == 1.
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
    */
	public static void setTrustLevel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Sets a value of property TrustLevel from an RDF2Go node.
    * First, all existing values are removed, then this value is added.
    * Cardinality constraints are not checked, but this method exists only for properties with
    * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
    */
	public void setTrustLevel( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), TRUSTLEVEL, value);
	}
   /**
    * Sets a value of property TrustLevel from an instance of java.lang.Double 
    * First, all existing values are removed, then this value is added.
    * Cardinality constraints are not checked, but this method exists only for properties with
    * no minCardinality or minCardinality == 1.
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
    */
	public static void setTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Double value) {
		Base.set(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Sets a value of property TrustLevel from an instance of java.lang.Double 
    * First, all existing values are removed, then this value is added.
    * Cardinality constraints are not checked, but this method exists only for properties with
    * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
    */
	public void setTrustLevel(java.lang.Double value) {
		Base.set(this.model, this.getResource(), TRUSTLEVEL, value);
	}
 


   /**
    * Removes a value of property TrustLevel as an RDF2Go node 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
    */
	public static void removeTrustLevel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Removes a value of property TrustLevel as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
    */
	public void removeTrustLevel( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), TRUSTLEVEL, value);
	}
   /**
    * Removes a value of property TrustLevel given as an instance of java.lang.Double 
    * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
    */
	public static void removeTrustLevel(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, java.lang.Double value) {
		Base.remove(model, instanceResource, TRUSTLEVEL, value);
	}
	
   /**
    * Removes a value of property TrustLevel given as an instance of java.lang.Double 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
    */
	public void removeTrustLevel(java.lang.Double value) {
		Base.remove(this.model, this.getResource(), TRUSTLEVEL, value);
	}
 
   /**
    * Removes all values of property TrustLevel     * @param model an RDF2Go model
    * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
    */
	public static void removeAllTrustLevel( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, TRUSTLEVEL);
	}
	
   /**
    * Removes all values of property TrustLevel	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
    */
	public void removeAllTrustLevel() {
		Base.removeAll(this.model, this.getResource(), TRUSTLEVEL);
	}
}