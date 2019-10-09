package de.dfki.cos.basys.platform.runtime.component.v2.registry;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.platform.model.runtime.component.ComponentCategory;

@Path("/registry")
public interface ComponentRegistry {

	ComponentRegistration createRegistration(Component instance) throws ComponentRegistrationException;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{componentCategory}")
	List<ComponentInfo> getComponents(@PathParam("componentCategory") ComponentCategory category);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{componentCategory}/{componentId}")
	ComponentInfo getComponentById(@PathParam("componentCategory") ComponentCategory category, @PathParam("componentId") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{componentCategory}/name/{componentName}")
	ComponentInfo getComponentByName(@PathParam("componentCategory") ComponentCategory category, @PathParam("componentName") String name);

}