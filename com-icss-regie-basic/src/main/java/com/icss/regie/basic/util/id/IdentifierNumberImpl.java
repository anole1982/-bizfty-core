/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.basic.util.id;

import java.io.Serializable;

/**
 *
 * @author zhangsen
 */
public class IdentifierNumberImpl extends AbstractIdentifierGenerator {
    private int length =13;
    
    @Override
    public Serializable next() {
       String s = this.sequence().toString();
       StringBuilder sb  = new StringBuilder(s);
       sb = sb.reverse();
       s = sb.toString().substring(0,length);
       sb  = new StringBuilder(s);
       sb = sb.reverse();
       return Integer.valueOf(sb.toString());
    }

    public void setLength(int length) {
        this.length = length;
    }

}
