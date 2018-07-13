/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 零售店（户）
 * @author Administrator
 */
@Entity
@Table(name="T_RETAILER",schema="RETAILER")
@XmlRootElement
public class Retailer extends BasicEntity {
    /**
     * 零售户(企业名称)
     */
    @XmlElement
    @Column(name="NAME",length=255)
    @Size(max = 100)
    @NotNull
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
