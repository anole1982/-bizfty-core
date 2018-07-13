/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.address;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author johns
 */
@Embeddable
@MappedSuperclass
public class Code implements Serializable {
    
    @Column(name="CODE")
    private String code;
    @Column(name="FULL_CODE")
    private String fullCode;
    @Column(name="SELF_CODE")
    private String selfCode;
}
