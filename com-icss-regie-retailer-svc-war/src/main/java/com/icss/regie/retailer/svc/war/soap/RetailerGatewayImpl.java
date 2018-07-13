/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.war.soap;

import com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerResponse;
import com.icss.regie.retailer.svc.api.gateways.RetailerGateway;
import javax.jws.WebService;

/**
 *
 * @author johns
 */

@WebService(serviceName = "RetailerGateway", portName = "RetailerGatewayPort",
                    targetNamespace = "http://api.svc.retailer.regie.icss.com/gateways",
                    endpointInterface = "com.icss.regie.retailer.svc.api.gateways.RetailerGateway")
public class RetailerGatewayImpl implements RetailerGateway {

    public RtrvRetailerResponse rtrvRetailer(RtrvRetailerRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public SaveRetailerResponse saveRetailer(SaveRetailerRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
