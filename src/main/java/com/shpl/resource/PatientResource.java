package com.shpl.resource;

import com.shpl.model.Patient;
import com.shpl.service.PatientService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static java.util.Optional.of;

@Path("/patient")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PatientResource {

    @Inject
    PatientService service;

    @POST
    public Patient create(final Patient model) {
        return this.service.create(model);
    }

    @GET
    @Path("/{id}")
    public Response get(@PathParam final String id) {
        return this.service.findById(id)
                .map(Response::ok)
                .orElse(Response.status(Response.Status.NOT_FOUND))
                .build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam final String id) {
        return of(this.service.delete(id))
                .filter(b -> b)
                .map(__ -> Response.noContent())
                .orElse(Response.status(Response.Status.NOT_FOUND))
                .build();
    }

}