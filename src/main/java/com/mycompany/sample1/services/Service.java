/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sample1.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dariaman.siagian
 */
@Path("service")
public class Service {
    
    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String test(){
        String test="dariaman";
        
        return test;
    }
}
