/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.person;

import com.icss.regie.api.models.BasicEntity;
import com.icss.regie.api.models.address.Address;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Embedded;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author johnson
 */

@Embeddable
@MappedSuperclass
public class Person implements Serializable {
    
    /**
     * 姓名
     */
    @Column(name = "NAME",length=36)
    private String name;
    /**
     * 性别
     */
    @Column(name = "SEX",length=2)
    private Sex sex;
    /**
     * 生日
     */
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date brithday;
    /**
     * 证件
     */
    @Embedded
    private Identity indentity;
    
    /**
     * 民族
     */
//    @JoinColumn(name = "NATIONALITY")
//    @ManyToOne
    @Embedded
    private Nationality nationality;
    /**
     * 籍贯（出生地）
     */
    @Embedded
    private Address nativePlace;
    
}
