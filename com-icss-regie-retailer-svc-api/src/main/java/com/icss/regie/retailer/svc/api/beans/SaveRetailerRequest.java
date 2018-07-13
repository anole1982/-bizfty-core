/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.beans;

import com.icss.regie.api.beans.BasicRequest;
import com.icss.regie.retailer.svc.api.models.Retailer;
import java.util.List;

/**
 *
 * @author johns
 */
public class SaveRetailerRequest extends BasicRequest {
    /**
     *  零售户
     */
    private List<Retailer> retailers;

    /**
     * @return the retailers
     */
    public List<Retailer> getRetailers() {
        return retailers;
    }

    /**
     * @param retailers the retailers to set
     */
    public void setRetailers(List<Retailer> retailers) {
        this.retailers = retailers;
    }
    
}
