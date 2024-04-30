package org.autentia.lab;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/element")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ElementResource {

	
	@Inject
	ElementService service;
	
    @GET
    @Path("/{symbol}")
    @RunOnVirtualThread
    public Response get(@PathParam("symbol") String symbol) {
        return service.get(symbol);
    }
    	
    @POST
    @RunOnVirtualThread
    public Response create(@Valid ElementDto dto) {
    	return service.create(dto);
    }
    
    @PUT
    @RunOnVirtualThread
    public Response update(@Valid ElementDto dto) {
    	return service.update(dto);
    }
    
    @DELETE
    @RunOnVirtualThread
    public Response delete(@Valid ElementDto dto) {
    	return service.delete(dto);
    }
    
    
}



















