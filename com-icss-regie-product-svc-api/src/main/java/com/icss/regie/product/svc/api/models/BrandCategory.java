/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.models;

import com.icss.regie.api.models.CodeTable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 品牌分类 行业数据库SQL如下:
 * <p>
 * SELECT BS.BCT_NAME AS NAME,BS.BCT_CODE AS VALUE FROM BSC_CODE_TYPE AS BT LEFT
 * JOIN BSC_CODE_TYPE AS BS ON BT.BCT_ID=BS.BCT_SUPER_ID WHERE
 * BT.BCT_PH_NAME='brand_type'AND BS.BCT_VALID = 1
 * </p>
 * 数据如下：
 * <dl><dt>国产品牌</dt><dd>9301</dd></dl>
 * <dl><dt>外国品牌</dt><dd>9302</dd></dl>
 * 
 * @author 张森
 */
@Entity
@Table(name = "T_BRAND_CATEGORY", schema = "COMMONS")
public class BrandCategory extends CodeTable {
    /**
     * 子分类
     */
    @OneToMany(mappedBy="category")
    private Collection<BrandSubCategory> subCategorys;

    /**
     * @return the subCategorys
     */
    public Collection<BrandSubCategory> getSubCategorys() {
        return subCategorys;
    }

    /**
     * @param subCategorys the subCategorys to set
     */
    public void setSubCategorys(Collection<BrandSubCategory> subCategorys) {
        this.subCategorys = subCategorys;
    }
}
