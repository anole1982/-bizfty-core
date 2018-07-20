/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 第三方服务存储
 * @author 张森
 */
@Entity
@Table(name="T_SERVICE_FILE",schema="FILE")
@DiscriminatorValue("S")
public class ServiceFile extends FileInfo {
    
}
