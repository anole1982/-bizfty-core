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
 * 卷烟类别
 *
 * 在行业里查找 用此条SQL:
 * <p>
 * SELECT bs.bcb_name AS name,bs.bcb_enum AS value FROM bsc_code_type bt LEFT
 * JOIN bsc_code_base bs ON bt.bct_id=bs.bct_id WHERE bt.bct_ph_name='ciga'
 * </p>
 * 数据如下：
 * <dl><dt>卷烟</dt><dd>440101</dd></dl>
 * <dl><dt>雪茄烟</dt><dd>440102</dd></dl>
 * <dl><dt>新型卷烟</dt><dd>440103</dd></dl>
 *
 * @author 张森
 */
@Entity
@Table(name = "T_PRODUCT_CATEGORY", schema = "COMMONS")
public class ProductCategory extends CodeTable {
}
