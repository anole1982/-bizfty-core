/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.common.svc.api.models.nationality;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 民族信息
 * @author 张森
 */
@Entity
@Table(name = "T_PERSON_NATIONALITY")
public class Nationality extends CodeTable {
    /**
     * 民族类型（政策照顾 重点关注 ）
     */
    @ManyToOne
    @JoinColumn(name="BENIFIT_ID")
    private NationalityBenefit benefit;
}
