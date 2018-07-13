/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.address;

import com.icss.regie.api.models.BasicEntity;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@Entity
@Table(name="T_TOWN")
public class Town extends BasicEntity {

    @Column(name="NAME")
    private String name;
    @Embedded
    private Code code;
    @ManyToOne
    @JoinColumn(name="COUNTY_ID")
    private County county;
    
    @OneToMany(mappedBy="town")
    private Collection<Village> villages;

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
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @return the county
     */
    public County getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(County county) {
        this.county = county;
    }

    /**
     * @return the villages
     */
    public Collection<Village> getVillages() {
        return villages;
    }

    /**
     * @param villages the villages to set
     */
    public void setVillages(Collection<Village> villages) {
        this.villages = villages;
    }

}
