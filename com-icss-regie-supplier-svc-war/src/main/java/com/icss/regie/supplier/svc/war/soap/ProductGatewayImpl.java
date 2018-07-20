/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.supplier.svc.war.soap;

import com.icss.regie.supplier.svc.api.beans.RtrvProductListRequest;
import com.icss.regie.supplier.svc.api.beans.RtrvProductListResponse;
import com.icss.regie.supplier.svc.api.gateways.ProductGateway;
import com.icss.regie.supplier.svc.api.services.ProductService;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author johns
 */

@WebService(serviceName = "ProductGateway", portName = "ProductGatewayPort",
                    targetNamespace = "http://api.svc.supplier.regie.icss.com/gateways",
                    endpointInterface = "com.icss.regie.supplier.svc.api.gateways.ProductGateway")
@Component("productGateway")
public class ProductGatewayImpl implements ProductGateway {
    
    @Autowired
    @Qualifier("productService")
    private ProductService service;
    
    @Override
    public RtrvProductListResponse rtrvProductList(RtrvProductListRequest request) {
        RtrvProductListResponse response = service.rtrvProductList(request);
        return response;
    }

}
