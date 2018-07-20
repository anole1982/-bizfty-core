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
 * 包装类型
 *
 * 在行业里查找 用此条SQL:
 * <p>
 * SELECT bs.bcb_name AS name,bs.bcb_enum AS value FROM bsc_code_type bt LEFT
 * JOIN bsc_code_base bs ON bt.bct_id=bs.bct_id WHERE bt.bct_ph_name='pack_type'
 * </p>
 * 数据如下：
 * <dl><dt>条盒硬盒</dt><dd>4601</dd></dl>
 * <dl><dt>条盒软盒</dt><dd>4602</dd></dl>
 * <dl><dt>条包硬盒</dt><dd>4603</dd></dl>
 * <dl><dt>条包软盒</dt><dd>4604</dd></dl>
 * <dl><dt>铁筒</dt><dd>4605</dd></dl>
 * <dl><dt>铁盒</dt><dd>4606</dd></dl>
 * <dl><dt>塑盒</dt><dd>4607</dd></dl>
 * <dl><dt>其他</dt><dd>4608</dd></dl>
 *
 * @author 张森
 */
@Entity
@Table(name = "T_PRODUCT_PACKAGE")
public class PackageType extends CodeTable {

}
