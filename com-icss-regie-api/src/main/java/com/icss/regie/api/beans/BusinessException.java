/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author johns
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessException", propOrder = {
    "responseCode",
    "reasons"
})

public class BusinessException extends RuntimeException implements Serializable {
    
    @XmlElement(name = "responseCode")
    private String responseCode ="008";
    @XmlElementWrapper(name = "reasons", nillable = true, required = false)
    @XmlElement(name = "reason")
    private List<Reason> reasons = new ArrayList<Reason>();

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    protected BusinessException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getResponseCode() {
        return responseCode;
    }
    
    public List<Reason> getReasons() {
        return reasons;
    }
    public void addReason(Reason reason){
        this.reasons.add(reason);
    }
}
