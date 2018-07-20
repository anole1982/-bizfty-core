/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.beans;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicRequest", propOrder = {
    "extensions"
})
public class BasicRequest implements Serializable {
    
    @XmlElementWrapper(name = "extensions")
    @XmlElement(name = "extension")
    private List<Extension> extensions;

    /**
     * @return the extensions
     */
    public List<Extension> getExtensions() {
        return extensions;
    }

    /**
     * @param extensions the extensions to set
     */
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

}
