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
@Table(name="T_VILLAGE")
public class County extends BasicEntity{
    @Column(name="NAME")
    private String name;
    @Embedded
    private Code code;
    @ManyToOne
    @JoinColumn(name="CITY_ID")
    private City city;
    @OneToMany(mappedBy="county")
    @XmlElement(name="town",nillable = true)
    @XmlElementWrapper(name="towns")
    private Collection<Town> towns;

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
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the towns
     */
    public Collection<Town> getTowns() {
        return towns;
    }

    /**
     * @param towns the towns to set
     */
    public void setTowns(Collection<Town> towns) {
        this.towns = towns;
    }

}
