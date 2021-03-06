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
 *   <li> ContainsBookmark </li>
 *   <li> ContainsBookmarkFolder </li>
 * </ul>
 *
 * class- This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> */
public class BookmarkFolder extends eu.dime.ps.semantic.model.nie.InformationElement {

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#BookmarkFolder */
    @SuppressWarnings("hiding")
	public static final URI RDFS_CLASS = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#BookmarkFolder", false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmark */
    @SuppressWarnings("hiding")
	public static final URI CONTAINSBOOKMARK = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmark",false);

    /** http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmarkFolder */
    @SuppressWarnings("hiding")
	public static final URI CONTAINSBOOKMARKFOLDER = new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmarkFolder",false);

    /** 
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available. 
     */
    @SuppressWarnings("hiding")
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmark",false),
      new URIImpl("http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#containsBookmarkFolder",false) 
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
	protected BookmarkFolder (Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public BookmarkFolder (Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
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
	public BookmarkFolder (Model model, String uriString, boolean write) throws ModelRuntimeException {
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
	public BookmarkFolder (Model model, BlankNode bnode, boolean write) {
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
	public BookmarkFolder (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of BookmarkFolder  or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0] 
	 */
	public static BookmarkFolder  getInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getInstance(model, instanceResource, BookmarkFolder.class);
	}

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.semanticdesktop.org/ontologies/2007/03/22/nfo#BookmarkFolder).
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
	public static ReactorResult<? extends BookmarkFolder> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, BookmarkFolder.class );
	}

    /**
	 * Remove rdf:type BookmarkFolder from this instance. Other triples are not affected.
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
	 * @return all A's as RDF resources, that have a relation 'ContainsBookmarkFolder' to this BookmarkFolder instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllContainsBookmarkFolder_Inverse(Model model, Object objectValue) {
		return Base.getAll_Inverse(model, eu.dime.ps.semantic.model.nfo.BookmarkFolder.CONTAINSBOOKMARKFOLDER, objectValue);
	}

	/**
	 * @return all A's as RDF resources, that have a relation 'ContainsBookmarkFolder' to this BookmarkFolder instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1dynamic] 
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllContainsBookmarkFolder_Inverse() {
		return Base.getAll_Inverse(this.model, eu.dime.ps.semantic.model.nfo.BookmarkFolder.CONTAINSBOOKMARKFOLDER, this.getResource() );
	}

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as a ReactorResult, that have a relation 'ContainsBookmarkFolder' to this BookmarkFolder instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse-as1static] 
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Resource> getAllContainsBookmarkFolder_Inverse_as(Model model, Object objectValue) {
		return Base.getAll_Inverse_as(model, eu.dime.ps.semantic.model.nfo.BookmarkFolder.CONTAINSBOOKMARKFOLDER, objectValue, org.ontoware.rdf2go.model.node.Resource.class);
	}



    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e8f9a4f has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, CONTAINSBOOKMARK);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e8f9a4f has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasContainsBookmark() {
		return Base.has(this.model, this.getResource(), CONTAINSBOOKMARK);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e8f9a4f has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, CONTAINSBOOKMARK);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@7e8f9a4f has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasContainsBookmark( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), CONTAINSBOOKMARK);
	}

     /**
     * Get all values of property ContainsBookmark as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmark_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, CONTAINSBOOKMARK);
	}
	
    /**
     * Get all values of property ContainsBookmark as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmark_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONTAINSBOOKMARK, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property ContainsBookmark as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmark_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), CONTAINSBOOKMARK);
	}

    /**
     * Get all values of property ContainsBookmark as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmark_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), CONTAINSBOOKMARK, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property ContainsBookmark     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nfo.Bookmark> getAllContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, CONTAINSBOOKMARK, eu.dime.ps.semantic.model.nfo.Bookmark.class);
	}
	
    /**
     * Get all values of property ContainsBookmark as a ReactorResult of Bookmark 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nfo.Bookmark> getAllContainsBookmark_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONTAINSBOOKMARK, eu.dime.ps.semantic.model.nfo.Bookmark.class);
	}

    /**
     * Get all values of property ContainsBookmark     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nfo.Bookmark> getAllContainsBookmark() {
		return Base.getAll(this.model, this.getResource(), CONTAINSBOOKMARK, eu.dime.ps.semantic.model.nfo.Bookmark.class);
	}

    /**
     * Get all values of property ContainsBookmark as a ReactorResult of Bookmark 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nfo.Bookmark> getAllContainsBookmark_as() {
		return Base.getAll_as(this.model, this.getResource(), CONTAINSBOOKMARK, eu.dime.ps.semantic.model.nfo.Bookmark.class);
	}
 
    /**
     * Adds a value to property ContainsBookmark as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Adds a value to property ContainsBookmark as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addContainsBookmark( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
    /**
     * Adds a value to property ContainsBookmark from an instance of Bookmark 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.add(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Adds a value to property ContainsBookmark from an instance of Bookmark 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addContainsBookmark(eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.add(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
  

    /**
     * Sets a value of property ContainsBookmark from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setContainsBookmark( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Sets a value of property ContainsBookmark from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setContainsBookmark( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
    /**
     * Sets a value of property ContainsBookmark from an instance of Bookmark 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.set(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Sets a value of property ContainsBookmark from an instance of Bookmark 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setContainsBookmark(eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.set(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
  


    /**
     * Removes a value of property ContainsBookmark as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeContainsBookmark( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Removes a value of property ContainsBookmark as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeContainsBookmark( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
    /**
     * Removes a value of property ContainsBookmark given as an instance of Bookmark 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeContainsBookmark(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.remove(model, instanceResource, CONTAINSBOOKMARK, value);
	}
	
    /**
     * Removes a value of property ContainsBookmark given as an instance of Bookmark 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeContainsBookmark(eu.dime.ps.semantic.model.nfo.Bookmark value) {
		Base.remove(this.model, this.getResource(), CONTAINSBOOKMARK, value);
	}
  
    /**
     * Removes all values of property ContainsBookmark     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllContainsBookmark( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, CONTAINSBOOKMARK);
	}
	
    /**
     * Removes all values of property ContainsBookmark	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllContainsBookmark() {
		Base.removeAll(this.model, this.getResource(), CONTAINSBOOKMARK);
	}
     /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@46a7ccc6 has at least one value set 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static] 
     */
	public static boolean hasContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.has(model, instanceResource, CONTAINSBOOKMARKFOLDER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@46a7ccc6 has at least one value set 
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic] 
     */
	public boolean hasContainsBookmarkFolder() {
		return Base.has(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@46a7ccc6 has the given value (maybe among other values).  
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static] 
     */
	public static boolean hasContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(model, instanceResource, CONTAINSBOOKMARKFOLDER);
	}

    /**
     * Check if org.ontoware.rdfreactor.generator.java.JProperty@46a7ccc6 has the given value (maybe among other values).  
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic] 
     */
	public boolean hasContainsBookmarkFolder( org.ontoware.rdf2go.model.node.Node value ) {
		return Base.hasValue(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER);
	}

     /**
     * Get all values of property ContainsBookmarkFolder as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmarkFolder_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, CONTAINSBOOKMARKFOLDER);
	}
	
    /**
     * Get all values of property ContainsBookmarkFolder as a ReactorResult of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result] 
     */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmarkFolder_asNode_(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONTAINSBOOKMARKFOLDER, org.ontoware.rdf2go.model.node.Node.class);
	}

    /**
     * Get all values of property ContainsBookmarkFolder as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmarkFolder_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER);
	}

    /**
     * Get all values of property ContainsBookmarkFolder as a ReactorResult of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result] 
     */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllContainsBookmarkFolder_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, org.ontoware.rdf2go.model.node.Node.class);
	}
     /**
     * Get all values of property ContainsBookmarkFolder     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<eu.dime.ps.semantic.model.nfo.BookmarkFolder> getAllContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, CONTAINSBOOKMARKFOLDER, eu.dime.ps.semantic.model.nfo.BookmarkFolder.class);
	}
	
    /**
     * Get all values of property ContainsBookmarkFolder as a ReactorResult of BookmarkFolder 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult] 
     */
	public static ReactorResult<eu.dime.ps.semantic.model.nfo.BookmarkFolder> getAllContainsBookmarkFolder_as(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, CONTAINSBOOKMARKFOLDER, eu.dime.ps.semantic.model.nfo.BookmarkFolder.class);
	}

    /**
     * Get all values of property ContainsBookmarkFolder     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<eu.dime.ps.semantic.model.nfo.BookmarkFolder> getAllContainsBookmarkFolder() {
		return Base.getAll(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, eu.dime.ps.semantic.model.nfo.BookmarkFolder.class);
	}

    /**
     * Get all values of property ContainsBookmarkFolder as a ReactorResult of BookmarkFolder 
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult] 
     */
	public ReactorResult<eu.dime.ps.semantic.model.nfo.BookmarkFolder> getAllContainsBookmarkFolder_as() {
		return Base.getAll_as(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, eu.dime.ps.semantic.model.nfo.BookmarkFolder.class);
	}
 
    /**
     * Adds a value to property ContainsBookmarkFolder as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Adds a value to property ContainsBookmarkFolder as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addContainsBookmarkFolder( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
    /**
     * Adds a value to property ContainsBookmarkFolder from an instance of BookmarkFolder 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.add(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Adds a value to property ContainsBookmarkFolder from an instance of BookmarkFolder 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addContainsBookmarkFolder(eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.add(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
  

    /**
     * Sets a value of property ContainsBookmarkFolder from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setContainsBookmarkFolder( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Sets a value of property ContainsBookmarkFolder from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setContainsBookmarkFolder( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
    /**
     * Sets a value of property ContainsBookmarkFolder from an instance of BookmarkFolder 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.set(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Sets a value of property ContainsBookmarkFolder from an instance of BookmarkFolder 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setContainsBookmarkFolder(eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.set(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
  


    /**
     * Removes a value of property ContainsBookmarkFolder as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeContainsBookmarkFolder( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Removes a value of property ContainsBookmarkFolder as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeContainsBookmarkFolder( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
    /**
     * Removes a value of property ContainsBookmarkFolder given as an instance of BookmarkFolder 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeContainsBookmarkFolder(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.remove(model, instanceResource, CONTAINSBOOKMARKFOLDER, value);
	}
	
    /**
     * Removes a value of property ContainsBookmarkFolder given as an instance of BookmarkFolder 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeContainsBookmarkFolder(eu.dime.ps.semantic.model.nfo.BookmarkFolder value) {
		Base.remove(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER, value);
	}
  
    /**
     * Removes all values of property ContainsBookmarkFolder     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllContainsBookmarkFolder( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, CONTAINSBOOKMARKFOLDER);
	}
	
    /**
     * Removes all values of property ContainsBookmarkFolder	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void removeAllContainsBookmarkFolder() {
		Base.removeAll(this.model, this.getResource(), CONTAINSBOOKMARKFOLDER);
	}
 }