/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.person;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
/**
 *
 * @author johnson
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nationality",namespace="http://basic.regie.icss.com/model/person", propOrder = {
    "name"
})
@Embeddable
@MappedSuperclass
public class Nationality implements Serializable {
    /**
     * 民族代号
     */
    @Column(name="NATIONALITY_CODE")
    private String code;
    /**
     * 民族名称
     */
    @Column(name="NATIONALITY_NAME")
    private String name;

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
}
