/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.common.svc.api.models.legal;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 案由
 *
 * @author 张森
 */
@Entity
@Table(name = "T_LEGAL_GROUND", schema = "COMMONS")
public class LegalGround extends BasicEntity {

    /**
     * 属性
     */
    @Column(name = "PROPERTY")
    private String property;
    
    /**
     * 法律条文
     */
    @Embedded
    private Legal legal;
    
    /**
     * 排序列
     */
    private int orderIndex;
    
    /**
     * 统计类型
     */
    @ManyToOne
    @JoinColumn(name = "STAT_TYPE")
    private LegalGroundType type;
    
}
