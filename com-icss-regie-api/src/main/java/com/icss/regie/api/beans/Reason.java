package com.icss.regie.api.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Reason implements Serializable {
    private String code;
    private String descript;
    private String traceCode;
    private List<Extension> extensions = new ArrayList<Extension>();

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the descript
     */
    public String getDescript() {
        return descript;
    }

    /**
     * @param descript the descript to set
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * @return the traceCode
     */
    public String getTraceCode() {
        return traceCode;
    }

    /**
     * @param traceCode the traceCode to set
     */
    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode;
    }

    /**
     * @return the extensions
     */
    public List<Extension> getExtensions() {
        return extensions;
    }
    
    public void addExtension(Extension extension) {
        this.extensions.add(extension);
    }
    
    public void addExtension(String key,String value) {
        this.extensions.add(new Extension(key,value));
    }
}
