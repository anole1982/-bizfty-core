/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.contact;

import com.icss.regie.api.models.BasicEntity;
import com.icss.regie.open.svc.api.models.person.Person;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author johnson
 */
@Embeddable
@MappedSuperclass
public class Contact extends BasicEntity{
    /**
     *  人员
     */
    private Person person;
    /**
     * 联系方式描述
     */
    private String descript;
}
