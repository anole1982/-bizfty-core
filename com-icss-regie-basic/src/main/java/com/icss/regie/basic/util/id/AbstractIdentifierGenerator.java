/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.basic.util.id;

import com.icss.regie.basic.util.IdentifierGenerator;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author zhangsen
 */
public abstract class AbstractIdentifierGenerator implements IdentifierGenerator {
    private int deviceId = 0;
    private int current = 0 ;
    private int max ;
    
    
    
    public synchronized BigDecimal sequence(){
        String c = String.valueOf(current);
        String t = String.valueOf((new Date()).getTime());
        String d = String.valueOf(deviceId);
        current++;
        if(current == max){
            current = 0;
        }
        BigDecimal seq = new BigDecimal(d+t+c);
        return seq;
    }

    /**
     * @return the curr
     */
    public int getCurrent() {
        return current;
    }
    
    /**
     * @param deviceId the deviceId to set
     */
    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

}
