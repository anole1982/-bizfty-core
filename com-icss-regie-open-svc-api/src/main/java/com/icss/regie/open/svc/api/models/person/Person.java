/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.person;

import com.icss.regie.open.svc.api.models.address.Address;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Embedded;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
     * 当前住址
     */
    @Column(name = "CURR_ADDRESS")
    private String creeAddress;
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
    @AttributeOverrides({
            @AttributeOverride(name="code", column=@Column(name = "IDENTITY_NO")),
            @AttributeOverride(name="type", column = @Column(name = "IDENTITY_TYPE"))
    })
    private Identity indentity;
    /**
     * 籍贯（出生地）
     */
    @Embedded
    private Address nativePlace;
    /**
     * 民族
     */
    @JoinColumn(name = "NATIONALITY_ID")
    @ManyToOne
    private Nationality nationality;
    /**
     * 文化程度
     */
    @ManyToOne
    @JoinColumn(name="EDUCATIONAL_ID")
    private Educational educational;
}
