package com.icss.regie.retailer.svc.api.gateways;

import com.icss.regie.api.beans.BusinessException;
import com.icss.regie.api.beans.TechnicalException;
import com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerResponse;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://api.svc.retailer.regie.icss.com/gateways", name = "RetailerGateway")
public interface RetailerGateway {

    /**
     * 获取零售户信息
     *
     * @param request
     * @return
     */
    @RequestWrapper(localName = "rtrvRetailerRequest",
            targetNamespace = "http://api.svc.retailer.regie.icss.com/beans",
            className = "com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest")
    @ResponseWrapper(localName = "rtrvRetailerResponse",
            targetNamespace = "http://api.svc.retailer.regie.icss.com/beans",
            className = "com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse")
    @WebMethod(action = "rtrvRetailer")
    RtrvRetailerResponse rtrvRetailer(RtrvRetailerRequest request) throws BusinessException,TechnicalException;

    /**
     * 保存零售户信息
     *
     * @param request
     * @return
     */
    @RequestWrapper(localName = "saveRetailerRequest",
            targetNamespace = "http://api.svc.retailer.regie.icss.com/beans",
            className = "com.icss.regie.retailer.svc.api.beans.SaveRetailerRequest")
    @ResponseWrapper(localName = "saveRetailerResponse",
            targetNamespace = "http://api.svc.retailer.regie.icss.com/beans",
            className = "com.icss.regie.retailer.svc.api.beans.SaveRetailerResponse")
    @WebMethod(action = "saveRetailer")
    SaveRetailerResponse saveRetailer(SaveRetailerRequest request) throws BusinessException,TechnicalException;
}
