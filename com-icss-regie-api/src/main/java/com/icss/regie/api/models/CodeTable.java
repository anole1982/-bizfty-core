/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

/**
 * 码表
 * @author 张森
 */
@Embeddable
@MappedSuperclass
public class CodeTable extends BasicEntity {
    /**
     * 名称
     */
    @Column(name="NAME",length=255)
    private String name;
    /**
     * 代号
     */
    @Column(name="CODE")
    private Integer code;

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
    public Integer getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
}
