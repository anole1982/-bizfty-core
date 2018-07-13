/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.beans;

import com.icss.regie.api.beans.BasicResponse;
import com.icss.regie.api.beans.Page;
import com.icss.regie.retailer.svc.api.models.Retailer;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author johns
 */
//@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name ="rtrvRetailerResponse", propOrder = {"retailers","page"})
//@XmlRootElement(name="RtrvRetailerResponse")
public class RtrvRetailerResponse extends BasicResponse {
    
//    @XmlElement(name = "Retailer")
    private List<Retailer> retailers;
    
    private Page page;

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

    /**
     * @return the page
     */
    public Page getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(Page page) {
        this.page = page;
    }
    
}
