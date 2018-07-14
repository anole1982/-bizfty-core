package com.icss.regie.retailer.app;

import com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.svc.api.gateways.RetailerGateway;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Path("/retailer")
public class RetailerResource {
    
    Logger logger = LoggerFactory.getLogger(RetailerResource.class);
    
    @Autowired
    @Qualifier("retailerGateway")
    private RetailerGateway retailerGateway;

    @Path("/{id}")
    @GET
    public String rtrvRetailer(String id) {
        logger.debug("rtrvRetailer start");
        RtrvRetailerRequest request = new RtrvRetailerRequest();
        retailerGateway.rtrvRetailer(request);
        logger.debug("rtrvRetailer end");
        return "Hello World";
    }

    @Path("/rtrvRetailer")
    @POST
    public String rtrvRetailer() {
        return "Hello World";
    }
}
