package ch.zli.notes_app.controllers;

import ch.zli.notes_app.services.ApplicationUserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ApplicationUserController {
    
    @Inject
    ApplicationUserService service;

    @GET
    
}
