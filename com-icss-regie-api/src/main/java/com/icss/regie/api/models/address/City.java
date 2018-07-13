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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "City", namespace = "http://basic.regie.icss.com/model/address")
@Entity
@Table(name="T_CITY")

public class City extends BasicEntity {

    @Column(name="NAME")
    private String name;
    @Embedded
    private Code code;
    @ManyToOne
    @JoinColumn(name="PROVINCE_ID")
    private Province province;
    @OneToMany(mappedBy="city")
    private Collection<County> counties;

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
     * @return the province
     */
    public Province getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(Province province) {
        this.province = province;
    }

    /**
     * @return the counties
     */
    public Collection<County> getCounties() {
        return counties;
    }

    /**
     * @param counties the counties to set
     */
    public void setCounties(Collection<County> counties) {
        this.counties = counties;
    }

}
