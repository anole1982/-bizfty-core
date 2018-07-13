package com.icss.regie.retailer.app.api.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "RETAILER")
public class Retailer implements Serializable {

    /**
     * 零售户标识
     */

    @Id
    @Column(name = "ID")
    private String id;
    /**
     * 零售户名称
     */
    @Column(name = "NAME")
    private String name;

}
