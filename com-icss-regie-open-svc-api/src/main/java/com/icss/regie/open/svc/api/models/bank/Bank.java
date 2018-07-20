/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.bank;

import com.icss.regie.api.models.BasicEntity;
import com.icss.regie.open.svc.api.models.address.Address;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 银行信息
 * @author 张森
 */
@Entity
@Table(name="T_BANK",schema="COMMONS")
public class Bank extends BasicEntity {
    /**
     * 银行
     */
    @ManyToOne
    @JoinColumn(name="GROUP_ID")
    private BankGorup group;
    /**
     * 银行国际代码 十一位数字或字母的BIC可以拆分为银行代码、国家代码、地区代码和分行代码四部分。 以中国银行北京分行为例，
     * 其银行识别代码为BKCHCNBJ300。 其含义为：BKCH（银行代码）、CN（国家代码）、BJ（地区代码）、300（分行代码）。
     */
    @Column(name = "SWIFT_CODE", length = 11)
    private String swiftCode;
    /**
     * 支付系统银行行号为12位定长数字， 由 3位银行行别代码、 4位地区代码、 4位分支机构序号和 1位校验码 组成。
     */
    @Column(name = "SN", length = 12)
    private String sn;
    /**
     * 银行名称
     */
    @Column(name = "NAME", length = 255)
    private String name;
    /**
     * 银行地址
     */
    @Embedded
    private Address address;
}
