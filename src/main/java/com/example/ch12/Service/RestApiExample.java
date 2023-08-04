package com.example.ch12.Service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class RestApiExample {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
        return "HELLO API Service";
    }
    @POST
    public String sayHello(@QueryParam("msg") String msg){
        return msg+" API Service";
    }
}
