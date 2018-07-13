package com.icss.regie.retailer.svc.api.services;

import com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns
 */

public interface RetailerService {
    /**
     * 获取零售户信息
     * @param request
     * @return 
     */
    RtrvRetailerResponse rtrvRetailer(RtrvRetailerRequest request);
    
    /**
     * 保存零售户信息
     * @param request
     * @return 
     */
    SaveRetailerResponse saveRetailer(SaveRetailerRequest request);
    
}
