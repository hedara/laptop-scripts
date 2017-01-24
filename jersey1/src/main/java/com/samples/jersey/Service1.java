package com.samples.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by edara on 11/27/16.
 */
@Path("/hello")
public class Service1 {
    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello "+name;
    }
}
