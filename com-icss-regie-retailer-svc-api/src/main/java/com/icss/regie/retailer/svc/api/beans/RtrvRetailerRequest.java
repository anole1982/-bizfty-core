/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.beans;

import com.icss.regie.api.beans.BasicRequest;
import com.icss.regie.api.beans.Page;
import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author johns
 */
//@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name ="rtrvRetailerRequest", propOrder = {"name"})
//@XmlRootElement(name="RtrvRetailerRequest")
public class RtrvRetailerRequest extends BasicRequest {
    
    /**
     * 零售户名称
     */
    private String name;
    
    /**
     *  分页信息
     */
    private Page page;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
