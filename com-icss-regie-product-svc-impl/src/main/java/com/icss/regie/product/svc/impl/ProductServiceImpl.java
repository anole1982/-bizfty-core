/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.impl;

import com.icss.regie.product.svc.api.beans.RtrvProductListRequest;
import com.icss.regie.product.svc.api.beans.RtrvProductListResponse;
import com.icss.regie.product.svc.api.models.Product;
import com.icss.regie.product.svc.api.services.ProductService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 产品服务
 *
 * @author 张森
 */
@Service("productService")
@Profile("hy")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    @Qualifier("productRepository")
    private ProductRepository repository;
    
    @Override
    public RtrvProductListResponse rtrvProductList(RtrvProductListRequest request) {
        RtrvProductListResponse response = new RtrvProductListResponse();
        List<Product> products = this.repository.list(Product.class, new HashMap());
        response.setProducts(products);
        return response;
    }
    
}
