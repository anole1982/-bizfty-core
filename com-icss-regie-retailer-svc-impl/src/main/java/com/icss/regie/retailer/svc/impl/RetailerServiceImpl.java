/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.impl;

import com.icss.regie.retailer.svc.api.beans.RtrvRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.RtrvRetailerResponse;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerRequest;
import com.icss.regie.retailer.svc.api.beans.SaveRetailerResponse;
import com.icss.regie.retailer.svc.api.models.Retailer;
import com.icss.regie.retailer.svc.api.services.RetailerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author johns
 */
@Service("retailerService")
@Profile("hy")
public class RetailerServiceImpl implements RetailerService {

    @Autowired
    @Qualifier("retailerRepository")
    private RetailerRepository repository;

    @Override
    public RtrvRetailerResponse rtrvRetailer(RtrvRetailerRequest request) {
        List<Retailer> retailers = repository.list(Retailer.class, request.getPage());
        RtrvRetailerResponse response = new RtrvRetailerResponse();
        return response;
    }

    @Override
    public SaveRetailerResponse saveRetailer(SaveRetailerRequest request) {
        request.getRetailers().forEach((r) -> {
            repository.persist(r);
        });
        return new SaveRetailerResponse();
    }
}
