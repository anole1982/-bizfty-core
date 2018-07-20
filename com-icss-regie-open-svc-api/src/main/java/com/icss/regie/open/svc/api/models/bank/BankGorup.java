/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.bank;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author johns
 */
@Entity
@Table(name="T_BANK_GROUP")
public class BankGorup extends BasicEntity {

    /**
     * 银行机构代码 一、类别代码: 1位数字,0-9,标识银行类别。 0-中央银行;
     * 1-国有独资商业银行;2-政策性银行;3-其他商业银行;4-非银行金融机构;5、6、7-外资银行; 9-特许参与者;8-待分配。
     * 二、顺序编码:2位数字,01-99。 三、赋予以下银行的行别代码: 类别行名行别代码 0、中央银行 中国人民银行会计营业部门001
     * 中国人民银行国家金库011 1、国有独资商业银行 中国工商银行102 中国农业银行103
     */
    @Column(name = "CODE", length = 3)
    private String code;
    /**
     * 银行名称
     */
    @Column(name = "NAME", length = 255)
    private String name;

}
