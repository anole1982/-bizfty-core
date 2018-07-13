/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.address;

import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Position implements Serializable {
    /**
     * 纬度
     */
    @Column(name="LATITUDE")
    private BigDecimal latitude;
    /**
     * 经度
     */
    @Column(name="LONGITUDE")
    private BigDecimal longitude;

}
