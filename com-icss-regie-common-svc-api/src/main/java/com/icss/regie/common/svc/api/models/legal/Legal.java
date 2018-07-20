/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.common.svc.api.models.legal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 法律条文
 * @author 张森
 */
@Embeddable
public class Legal implements Serializable {
    /**
     * 法规条文
     */
    @Column(name="LEGAL_ITEM")
    private String item;
    /**
     * 处罚
     */
    @Column(name="PUNISH_ITEM")
    private String punish;
}
