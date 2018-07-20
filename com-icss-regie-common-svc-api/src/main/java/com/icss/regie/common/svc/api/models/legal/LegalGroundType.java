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
import javax.persistence.Table;

/**
 * 案由
 * @author 张森
 */
@Entity
@Table(name="T_LEGAL_GROUND_TYPE",schema="COMMONS")
public class LegalGroundType extends BasicEntity {
    
    private String name;
}
