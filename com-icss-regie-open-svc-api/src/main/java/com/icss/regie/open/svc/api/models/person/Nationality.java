/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.person;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.persistence.Table;
/**
 *
 * @author 民族信息
 */
@Entity
@Table(name="T_NATIONALITY")
public class Nationality extends CodeTable {

}
