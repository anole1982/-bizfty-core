/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.address;

import com.icss.regie.api.models.BasicEntity;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 行政区划
 * @author 张森
 */
public class Region extends BasicEntity {
    /**
     * 上级行政区划
     */
    @ManyToOne
    @JoinColumn(name="PARENT_ID")
    private Region parent;
    /**
     * 子行政区划
     */
    @OneToMany(mappedBy = "parent")
    private Collection<Region> children;
    /**
     * 行政区划名称
     */
    @Column(name="NAME")
    private String name;
    /**
     * 行政区划名称
     */
    @Column(name="CODE")
    private String code;
    /**
     * 行政区划类型
     */
    @Column(name="TYPE")
    private String type;
}
