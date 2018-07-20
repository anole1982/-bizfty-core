/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.product.svc.api.models;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 价格分类
 * 在行业里查找 用此条SQL:
 * <p>
 * SELECT bs.bcb_name AS name,bs.bcb_enum AS value FROM bsc_code_type bt LEFT
 * JOIN bsc_code_base bs ON bt.bct_id=bs.bct_id WHERE
 * bt.bct_ph_name='price_type'
 * </p>
 * 数据如下：
 * <dl><dt>一类烟</dt><dd>4801</dd></dl>
 * <dl><dt>二类烟</dt><dd>4802</dd></dl>
 * <dl><dt>三类烟</dt><dd>4803</dd></dl>
 * <dl><dt>四类烟</dt><dd>4804</dd></dl>
 * <dl><dt>五类烟</dt><dd>4805</dd></dl>
 *
 * @author 张森
 */
@Entity
@Table(name = "T_PRODUCT_PRICE_CATEGORY", schema = "COMMONS")
public class PriceCategory extends CodeTable {

}
