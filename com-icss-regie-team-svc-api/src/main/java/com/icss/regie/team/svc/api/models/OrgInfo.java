/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.team.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name="T_ORG_INFO",schema="TEAM")
@XmlRootElement
public class OrgInfo extends BasicEntity{
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="CODE")
    private String code;
}
