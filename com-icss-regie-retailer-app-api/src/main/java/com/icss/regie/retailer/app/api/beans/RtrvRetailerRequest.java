/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.app.api.beans;

import com.icss.regie.api.beans.BasicRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
/**
 *
 * @author johns
 */
public class RtrvRetailerRequest extends BasicRequest {
    
    private String name;
    @Future
    private Date startDate;
    @Past
    private Date endDate;
    
    @DecimalMax("999999")
    private BigDecimal price;
    
    @Size(min=2,max=5)
    private List<String> size;

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
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public List<String> getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(List<String> size) {
        this.size = size;
    }
    
}
