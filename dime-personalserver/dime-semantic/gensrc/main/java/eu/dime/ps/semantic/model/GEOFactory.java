package eu.dime.ps.semantic.model;

import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;

import eu.dime.ps.semantic.model.geo.*;

/**
 * A factory for the Java classes generated automatically for the GEO vocabulary.
 * 
 * @author Ismael Rivera
 * 
 */

public class GEOFactory extends ResourceFactory {

	public Point createPoint() {
		return new Point(createModel(), generateUniqueURI(), true);
	}

	public Point createPoint(URI resourceUri) {
		return new Point(createModel(), resourceUri, true);
	}

	public Point createPoint(String resourceUriString) {
		return new Point(createModel(), new URIImpl(resourceUriString), true);
	}

	public SpatialThing createSpatialThing() {
		return new SpatialThing(createModel(), generateUniqueURI(), true);
	}

	public SpatialThing createSpatialThing(URI resourceUri) {
		return new SpatialThing(createModel(), resourceUri, true);
	}

	public SpatialThing createSpatialThing(String resourceUriString) {
		return new SpatialThing(createModel(), new URIImpl(resourceUriString), true);
	}

}