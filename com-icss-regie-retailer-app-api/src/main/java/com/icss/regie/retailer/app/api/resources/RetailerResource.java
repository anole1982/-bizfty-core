/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.app.api.resources;

import com.icss.regie.retailer.app.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.app.api.beans.RtrvRetailerResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author 张森
 */
@Path("/")
public interface RetailerResource {

    @Path("/rtrvRetailer")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    RtrvRetailerResponse rtrvRetailer(@Valid  @NotNull RtrvRetailerRequest request);
}
