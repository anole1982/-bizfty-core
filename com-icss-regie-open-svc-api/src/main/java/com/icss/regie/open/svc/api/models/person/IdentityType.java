/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.person;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 证件类型
 * @author Administrator
 */
//@Embeddable
//@MappedSuperclass
@Entity
@Table(name = "T_IDENTIFY_TYPE")
public class IdentityType extends BasicEntity {

}
