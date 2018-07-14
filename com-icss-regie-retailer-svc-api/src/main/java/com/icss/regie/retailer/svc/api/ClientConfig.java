/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author johns
 */
@Configuration
@ImportResource(locations={"classpath:config/consumers/hsf.xml","classpath:config/consumers/jax.xml"})
public class ClientConfig {
    
}
