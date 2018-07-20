/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.impl.repo;

import com.icss.regie.basic.BasicRepositoryImpl;
import com.icss.regie.product.svc.impl.ProductRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 *
 * @author johns
 */
@Repository("productRepository")
@Profile("hy")
public class ProductRepositoryImpl extends BasicRepositoryImpl implements ProductRepository {
    
    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
