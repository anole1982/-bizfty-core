/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.person;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
@Embeddable
@MappedSuperclass
public class IdentityType implements Serializable {

    /**
     * 证件类型代码
     */
    @Column(name = "IDENTITY_TYPE_CODE")
    private String code;
    /**
     * 证件类型名称
     */
    @Column(name = "IDENTITY_TYPE_DESCRIPT")
    private String descript;
}
