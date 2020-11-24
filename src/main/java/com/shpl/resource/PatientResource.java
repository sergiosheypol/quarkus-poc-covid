package com.shpl.resource;

import com.shpl.model.Patient;
import com.shpl.service.PatientService;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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
    public Patient get(@PathParam final Integer id) {
        return this.service.get(id);
    }
}