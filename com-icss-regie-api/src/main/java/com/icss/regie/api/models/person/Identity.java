/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.person;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
/**
 *
 * @author Administrator
 */
@Embeddable
@MappedSuperclass
public class Identity implements Serializable {
    /**
     * 证件代码
     */
    @Column(name="IDENTITY_CODE")
    private String code;
    /**
     * 证件类型
     */
//    @ManyToOne
//    @JoinColumn(name="IDENTITY_TYPE_ID")
    @Embedded
    private IdentityType type;
    /**
     * 身份证地址
     */
    @Column(name="IDENTITY_ADDRESS")
    private String address;
    /**
     * 发证机关
     */
    @Column(name="IDENTITY_OFFICE_NAME")
    private String officeName;
    /**
     * 生效日期
     */
    @Column(name="IDENTITY_EFFECT_DATE")
    private Date effectDate;
    /**
     * 过期日期
     */
    @Column(name="IDENTITY_EXPIRE_DATE")
    private Date expireDate;

}
