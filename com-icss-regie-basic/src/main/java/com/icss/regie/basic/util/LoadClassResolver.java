/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.basic.util;

import java.io.IOException;
import java.util.Set;

/**
 *
 * @author johnson
 */
public interface LoadClassResolver {

    /**
     * 将符合条件的Bean以Class集合的形式返回
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    Set<Class<?>> getClassSet() throws IOException, ClassNotFoundException;
    
}
