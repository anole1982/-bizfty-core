/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.beans;

import com.icss.regie.api.beans.BasicRequest;
import com.icss.regie.api.beans.Page;


/**
 * 获取零售户信息
 * 根据要求返回相关信息
 * 
 * 
 * 基本返回信息
 * 证照信息
 * <p>营业执照信息</p>
 * <p>法人信息</p>
 * <p>烟草专卖许可证信息</p>
 * 
 * @author johns
 */
//@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name ="rtrvRetailerRequest", propOrder = {"name"})
//@XmlRootElement(name="RtrvRetailerRequest")
public class RtrvRetailerRequest extends BasicRequest {
    /**
     * 实际经营人信息
     */
    private boolean realOperator;
    /**
     * 实际经营人信息
     */
    private boolean vehicles;
    /**
     * 仓库信息
     */
    private boolean storages;
    /**
     * 从业人员
     */
    private boolean employees;
    /**
     * 从业人员
     */
    private boolean labels;
    /**
     * 零售户名称
     */
    private String name;
    
    /**
     *  分页信息
     */
    private Page page;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
