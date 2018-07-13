/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.quantity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class Amt implements Serializable {
    /**
     * 金额数量
     */
    private BigDecimal amt;
    /**
     * 金额单位
     */
    private String unit;
}
