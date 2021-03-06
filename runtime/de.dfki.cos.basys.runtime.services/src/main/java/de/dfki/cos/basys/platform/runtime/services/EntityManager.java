package de.dfki.cos.basys.platform.runtime.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.platform.model.base.Entity;

@Path("/entity")
public interface EntityManager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{entityId}")
	Entity getEntity(@PathParam("entityId") String id);

}
