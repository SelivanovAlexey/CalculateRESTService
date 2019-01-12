package com.netcracker;

import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalculationRestService {

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String addGet(@PathParam("a") int a, @PathParam("b") int b) {
        return "<html><body>" + "<h1> a + b = " + (a + b) + "</h1>" + "</html></body>";
    }

    @POST
    @Path("/add/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public String addPost(@PathParam("a") int a, @PathParam("b") int b) {
        JSONObject obj = new JSONObject();
        obj.put("description", "This is an adding");
        obj.put("a", a);
        obj.put("b", b);
        obj.put("result", a + b);
        return obj.toString(4);
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String subGet(@PathParam("a") int a, @PathParam("b") int b) {
        return "<html><body>" + "<h1> a - b = " + (a - b) + "</h1>" + "</html></body>";
    }

    @POST
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public String subPost(@PathParam("a") int a, @PathParam("b") int b) {
        JSONObject obj = new JSONObject();
        obj.put("description", "This is subtraction");
        obj.put("a", a);
        obj.put("b", b);
        obj.put("result", a - b);
        return obj.toString(4);
    }

    @GET
    @Path("/mul/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String mulGet(@PathParam("a") int a, @PathParam("b") int b) {
        return "<html><body>" + "<h1> a * b = " + (a * b) + "</h1>" + "</html></body>";
    }

    @POST
    @Path("/mul/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public String mulPost(@PathParam("a") int a, @PathParam("b") int b) {
        JSONObject obj = new JSONObject();
        obj.put("description", "This is multiply");
        obj.put("a", a);
        obj.put("b", b);
        obj.put("result", a * b);
        return obj.toString(4);
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String divGet(@PathParam("a") int a, @PathParam("b") int b) {
        return "<html><body>" + "<h1> a / b = " + (a / b) + "</h1>" + "</html></body>";
    }

    @POST
    @Path("/div/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public String divPost(@PathParam("a") float a, @PathParam("b") float b) {
        JSONObject obj = new JSONObject();
        obj.put("description", "This is division");
        obj.put("a", a);
        obj.put("b", b);
        obj.put("result", a / b);
        return obj.toString(4);
    }


}
