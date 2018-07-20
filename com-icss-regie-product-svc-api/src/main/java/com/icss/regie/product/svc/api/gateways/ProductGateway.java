/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.gateways;

import com.icss.regie.product.svc.api.beans.RtrvProductListRequest;
import com.icss.regie.product.svc.api.beans.RtrvProductListResponse;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * 产品信息
 * @author 张森
 */
@WebService(targetNamespace = "http://api.svc.product.regie.icss.com/gateways", name = "ProductGateway")
public interface ProductGateway {
    
    @RequestWrapper(localName = "rtrvProductListRequest",
            targetNamespace = "http://api.svc.product.regie.icss.com/beans",
            className = "com.icss.regie.product.svc.api.beans.RtrvProductListRequest")
    @ResponseWrapper(localName = "rtrvProductListResponse",
            targetNamespace = "http://api.svc.product.regie.icss.com/beans",
            className = "com.icss.regie.product.svc.api.beans.RtrvProductListResponse")
    @WebMethod(action = "rtrvProductList")
    RtrvProductListResponse rtrvProductList(RtrvProductListRequest request);
}
