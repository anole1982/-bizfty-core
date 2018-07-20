/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 销售户
 * @author 张森
 */
@Entity
@Table(name="T_STORE")
public class Store extends BasicEntity {
    private String name;
}
