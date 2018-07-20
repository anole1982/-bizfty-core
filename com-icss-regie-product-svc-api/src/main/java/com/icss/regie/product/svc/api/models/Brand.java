/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 卷烟品牌
 * @author 张森
 */
@Entity
@Table(name="T_BRAND",schema="COMMONS")
public class Brand extends BasicEntity {
    /**
     * 品牌名称
     */
    @Column(name="NAME",length=100)
    private String name;
    /**
     * 品牌代号
     */
    @Column(name="CODE")
    private String code;
    /**
     * 产品
     */
    @OneToMany(mappedBy="brand")
    private Collection<Product> products;
    /**
     * 
     */
    private BrandCategory category;
    private BrandSubCategory subCategory;
    /**
     * 供应商
     */
    @ManyToOne
    @JoinColumn(name="SUPPLIER_ID")
    private Supplier supplier;
}
