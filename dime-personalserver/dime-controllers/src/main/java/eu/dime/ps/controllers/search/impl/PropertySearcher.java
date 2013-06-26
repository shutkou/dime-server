package eu.dime.ps.controllers.search.impl;

import java.util.Collection;

import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.vocabulary.RDF;

import eu.dime.ps.controllers.search.SearchResult;
import eu.dime.ps.semantic.rdf.ResourceStore;
import eu.dime.ps.semantic.search.Searcher;

public class PropertySearcher extends ResourceSearcher {

	public PropertySearcher(ResourceStore resourceStore) {
		super(resourceStore);
	}
	
	@Override
	public Collection<SearchResult> search(String searchExpr) {
 		return search(searchExpr, RDF.Property, null, Searcher.NONE, Searcher.NONE);
	}

	@Override
	public Collection<SearchResult> search(String searchExpr, long limit, long offset) {
		return search(searchExpr, RDF.Property, null, limit, offset);
	}

	@Override
	public Collection<SearchResult> search(String searchExpr, URI type) {
		return search(searchExpr, type, null, Searcher.NONE, Searcher.NONE);
	}

	@Override
	public Collection<SearchResult> search(String searchExpr, URI type, long limit, long offset) {
		return search(searchExpr, type, null, limit, offset);
	}

	@Override
	public Collection<SearchResult> search(String searchExpr, String order) {
		return search(searchExpr, RDF.Property, order, Searcher.NONE, Searcher.NONE);
	}

	@Override
	public Collection<SearchResult> search(String searchExpr, String order, long limit, long offset) {
		return search(searchExpr, RDF.Property, order, Searcher.NONE, Searcher.NONE);
	}

}