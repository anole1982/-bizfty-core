package com.icss.regie.retailer.app;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/retailer")
public class RetailerResource {
	
	@Path("/{id}")
	@GET
	public String rtrvRetailer(String id) {
		return "Hello World";
	}
	
	@Path("/rtrvRetailer")
	@POST
	public String rtrvRetailer() {
		return "Hello World";
	}
}
