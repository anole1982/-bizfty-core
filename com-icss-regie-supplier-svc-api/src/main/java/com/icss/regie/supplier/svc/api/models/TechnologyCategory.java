/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.supplier.svc.api.models;

import com.icss.regie.api.models.CodeTable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 生产类型工艺类型 在行业里查找 用此条SQL:
 * <p>
 * SELECT bs.bcb_name AS name,bs.bcb_enum AS value FROM bsc_code_type bt LEFT
 * JOIN bsc_code_base bs ON bt.bct_id=bs.bct_id WHERE bt.bct_ph_name='make_type'
 * </p>
 * <dl><dt>混合型</dt><dd>4701</dd></dl>
 * <dl><dt>烤烟型</dt><dd>4702</dd></dl>
 * <dl><dt>外香型</dt><dd>4703</dd></dl>
 * <dl><dt>雪茄型</dt><dd>4704</dd></dl>
 * <dl><dt>雪茄烟</dt><dd>4705</dd></dl>
 * <dl><dt>手卷型雪茄烟</dt><dd>4706</dd></dl>
 * <dl><dt>药用型</dt><dd>4707</dd></dl>
 * <dl><dt>其它</dt><dd>4708</dd></dl>
 *
 * @author 张森
 */
@Entity
@Table(name = "T_PRODUCT_TECHNOLOGY_CATEGORY")
public class TechnologyCategory extends CodeTable {

}
