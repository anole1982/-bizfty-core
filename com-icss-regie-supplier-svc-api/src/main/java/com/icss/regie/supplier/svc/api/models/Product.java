/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.supplier.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author 张森
 */
@Entity
@Table(name = "T_PRODUCT")
public class Product extends BasicEntity {

    /**
     * 卷烟名称 PRODUCT_NAME
     */
    @Column(name = "NAME")
    @NotNull
    @Basic(optional = false)
    private String name;
    /**
     * 卷烟代码 PRODUCT_CODE
     *
     */
    @Column(name = "CODE")
    private String code;
    /**
     * 卷烟类别
     *
     * @Column(name = "PRODUCT_TYPE")
     */
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private ProductCategory category;

    /**
     * 卷烟规格
     *
     * @Column(name = "spec")
     */
    @Column(name = "SPEC", length = 20)
    private String spec;
    /**
     * 品牌 BRAND_UUID
     */
    @ManyToOne
    @JoinColumn(name = "BRAND_UUID")
    private Brand brand;

    /**
     * 供应商
     */
    @ManyToOne
    @JoinColumn(name = "SUPPLY_UUID")
    private Supplier supplier;
    /**
     * 缺省计价单位
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEFAULT_UNIT", nullable = false, length = 20)
    private String defaultUnit;
    /**
     * 缺省单位支数量
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "BRANCH_QTY", nullable = false)
    private int branchQty;
    /**
     * 国标码
     */
    @Column(length = 20)
    private String gb;
    /**
     * 条条形码
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "STRIP_CODE", nullable = false, length = 20)
    /**
     * 包条形码
     */
    private String stripCode;
    @Column(name = "PACK_CODE", length = 20)
    /**
     * 件条形码
     */
    private String packCode;
    @Column(name = "PART_CODE", length = 20)
    private String partCode;
    /**
     * 批发指导价
     */
    @Max(value = (long) 9999999999.99)
    @Min(value = 0)
    @Column(name = "TRADE_PR", precision = 12, scale = 2)
    private BigDecimal tradePr;
    /**
     * 零售指导价
     */
    @Max(value = (long) 9999999999.99)
    @Min(value = 0)
    @Column(name = "RTL_PR", precision = 12, scale = 2)
    private BigDecimal rtlPr;
    /**
     * 包装类型
     */
    @ManyToOne
    @JoinColumn(name = "PACK_TYPE")
    private PackageType packType;
    /**
     * 制作类型
     */
    @ManyToOne
    @JoinColumn(name = "MAKE_TYPE")
    private TechnologyCategory technology;
    /**
     * 价格分类
     */
    @ManyToOne
    @JoinColumn(name = "PRICE_TYPE")
    private PriceCategory priceType;
    /**
     * 是否可用
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_ACTIVE", nullable = false)
    private boolean isActive = true;
    /**
     * 所属目录
     * 目前行业数据为null
     */
    @Column(name = "CATELOG")
    private Integer catalog;
    /**
     * 进出口标识
     */
    @Column(name = "IMPORT_FLAG")
    private Integer mxFlag;
    /**
     * 是否已下发
     * 目前行业数据为null
     */
    @Column(name = "IS_ISSUED")
    private Boolean isIssued;
    /**
     * 下发时间
     * 目前行业数据为null
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISSUE_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueTime;
    /**
     * 接收时间
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "RECIEVE_TIIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recieveTiime;
    /**
     * 助记码
     */
    @Column(name = "ASS_CODE", length = 20)
    private String assCode;
    /**
     * 是否本省在销
     */
    @Column(name = "IS_LOC_SALE")
    private boolean locSale;
    /**
     * 是否本省重点品牌
     */
    @Column(name = "IS_LOC_MAIN")
    private Integer locMain;
    /**
     * 最近价格维护时间
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "LST_MODI_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstModiTime;
    /**
     * 最近维护人
     */
    @Column(name = "LST_MODI_PSNID", length = 64)
    private String lstModiPsnid;
    /**
     * 特点描述
     */
    @Column(length = 400)
    private String feature;
    /**
     * 备注
     */
    @Column(length = 400)
    private String memo;
    
}
