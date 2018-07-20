/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.beans;

import com.icss.regie.api.beans.BasicResponse;
import com.icss.regie.api.beans.Page;
import com.icss.regie.product.svc.api.models.Product;
import java.util.List;

/**
 *
 * @author johns
 */
public class RtrvProductListResponse extends BasicResponse {
    
    private List<Product> products;
    
    private Page page;

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return the page
     */
    public Page getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(Page page) {
        this.page = page;
    }
    
}
