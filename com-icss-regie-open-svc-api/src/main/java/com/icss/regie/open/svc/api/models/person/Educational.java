/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.person;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 文化程度
 * @author 张森
 */
@Entity
@Table(name = "T_EDUCATIONAL", schema = "COMMONS")
public class Educational extends CodeTable {
    
}
