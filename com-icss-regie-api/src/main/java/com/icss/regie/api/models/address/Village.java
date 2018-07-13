/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.address;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_VILLAGE")
public class Village extends BasicEntity {

    @Column(name="NAME")
    private String name;
    @Embedded
    private Code code;
    @ManyToOne
    @JoinColumn(name="TOWN_ID")
    private Town town;

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
     * @return the town
     */
    public Town getTown() {
        return town;
    }

    /**
     * @param town the town to set
     */
    public void setTown(Town town) {
        this.town = town;
    }
}
