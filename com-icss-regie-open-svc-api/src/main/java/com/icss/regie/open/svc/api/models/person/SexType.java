/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.open.svc.api.models.person;

import com.icss.regie.api.models.BasicEntity;

/**
 *
 * @author johnson
 */
public enum SexType {

    MALE(0), FEMALE(1), UNKNOWN(2);

    private int index;

    SexType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}
