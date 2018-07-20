/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.address;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author johnson
 */

@Embeddable
@MappedSuperclass
public class Address implements Serializable {
    
    @ManyToOne
    @JoinColumn(name="PROVICE_ID")
    private Province province;
    
    @ManyToOne
    @JoinColumn(name="CITY_ID")
    private City city;
    
    @ManyToOne
    @JoinColumn(name="COUNTY_ID")
    private County county;
    
    @ManyToOne
    @JoinColumn(name="TOWN_ID")
    private Town town;
    
    @ManyToOne
    @JoinColumn(name="VILLAGE_ID")
    private Village village;
    
    @Column(name="ADDRESS")
    private String address;

}
