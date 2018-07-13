/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.person;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author johnson
 */
@Embeddable
@MappedSuperclass
public class MaritalType {

//    DIVORCED(1), MARRIED(2), NEVERMARRIED(3),
//    SEPARATED(4), SIGNIFICANTOTHER(5), WIDOWED(6),
//    UNKNOWN(7);

    /**
     * 证件类型代码
     */
    @Column(name = "MARITAL_TYPE_CODE")
    private String code;
    /**
     * 证件类型名称
     */
    @Column(name = "MARITAL_TYPE_DESCRIPT")
    private String descript;

}
