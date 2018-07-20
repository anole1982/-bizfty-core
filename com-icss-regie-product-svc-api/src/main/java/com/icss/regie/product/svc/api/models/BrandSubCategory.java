/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.models;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 品牌子分类 行业数据库查询SQL如下：
 * <p>
 * SELECT BT2.BCT_CODE AS FIRST,BS.BCB_NAME AS NAME,BS.BCB_ENUM AS VALUE FROM
 * BSC_CODE_TYPE AS BT LEFT JOIN BSC_CODE_BASE AS BS ON BT.BCT_ID=BS.BCT_ID LEFT
 * JOIN BSC_CODE_TYPE AS BT2 ON BT2.BCT_ID = BT.BCT_ID WHERE
 * BT.BCT_PH_NAME='brand_sub_type'AND BS.BCB_VALID = 1 ORDER BY BS.BCB_ENUM ASC
 * </p>
 * <dl><dt>9301</dt><dd>国产品牌目录::930101</dd></dl>
 * <dl><dt>9301</dt><dd>自创品牌目录::930102</dd></dl>
 * <dl><dt>9301</dt><dd>专供出口品牌目录::930103</dd></dl>
 * <dl><dt>9301</dt><dd>境外生产品牌目录::930104</dd></dl>
 * <dl><dt>9302</dt><dd>进口品牌目录::930201</dd></dl>
 * <dl><dt>9302</dt><dd>非进口品牌目录::930202</dd></dl>
 *
 * @author 张森
 */
@Entity
@Table(name = "T_BRAND_SUB_CATEGORY", schema = "COMMONS")
public class BrandSubCategory extends CodeTable {
    /**
     * 主分类
     */
    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private BrandCategory category;

    /**
     * @return the category
     */
    public BrandCategory getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(BrandCategory category) {
        this.category = category;
    }
}
