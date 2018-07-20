/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.services;

import com.icss.regie.product.svc.api.beans.RtrvProductListRequest;
import com.icss.regie.product.svc.api.beans.RtrvProductListResponse;

/**
 *
 * @author johns
 */
public interface ProductService {
    RtrvProductListResponse rtrvProductList(RtrvProductListRequest request);
}
