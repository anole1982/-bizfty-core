/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.supplier.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 供应商
 * @author 张森
 */
@Entity
@Table(name="T_SUPPLIER")
public class Supplier extends BasicEntity {
    /**
     * 供应商名称
     */
    @Column(name="NAME")
    private String name;
    /**
     * 供应商代码
     */
    @Column(name="CODE")
    private String code;
    
    /**
     * 供应商代码
     */
    @OneToMany(mappedBy="supplier")
    private Collection<Brand> brands;
}
