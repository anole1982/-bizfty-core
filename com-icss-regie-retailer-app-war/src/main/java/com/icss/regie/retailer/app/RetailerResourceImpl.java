package com.icss.regie.retailer.app;

import com.icss.regie.retailer.app.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.app.api.beans.RtrvRetailerResponse;
import com.icss.regie.retailer.app.api.resources.RetailerResource;
import com.icss.regie.retailer.svc.api.gateways.RetailerGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
 
@Component("retailerResource")
public class RetailerResourceImpl implements RetailerResource {
     
    Logger logger = LoggerFactory.getLogger(RetailerResourceImpl.class);
    
//    @Autowired
//    @Qualifier("retailerGateway")
    private RetailerGateway retailerGateway;

    @Override
    public RtrvRetailerResponse rtrvRetailer(RtrvRetailerRequest request) {
        logger.debug("rtrvRetailer start");
        com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest svcRequest = new com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest();
        com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse svcResponse = retailerGateway.rtrvRetailer(svcRequest);
        RtrvRetailerResponse response = new RtrvRetailerResponse();
        logger.debug("rtrvRetailer end");
        return response;
    }
}
