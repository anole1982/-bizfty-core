/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.api.models;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 零售户
 * @author 张森
 */
@Entity
@Table(name="T_RETAILER")
public class Retailer extends Store {

    @Basic(optional = false)
    @Column(name = "LICENSE_NUM", nullable = false, length = 64)
    private String licenseNum;
    @Basic(optional = false)
    @Column(name = "OLD_LICENSE_NUM", nullable = false, length = 64)
    private String oldLicenseNum;
    @Column(name = "ENTERPRISE_NAME", length = 256)
    private String enterpriseName;
    @Column(name = "REPRESENTATIVE_NAME", length = 256)
    private String representativeName;
    @Column(name = "BUSINESS_ADDR", length = 512)
    private String businessAddr;
    @Column(name = "ECONOMIC_TYPE", length = 8)
    private String economicType;
    @Column(name = "SCOPE_BUSINESS", length = 8)
    private String scopeBusiness;
    @Column(name = "CREDIT_CODE", length = 64)
    private String creditCode;
    @Column(name = "BUSINESS_LICE_STATUS", length = 8)
    private String businessLiceStatus;
    @Column(length = 32)
    private String organization;
    @Column(name = "REGIONS_ADMIN", length = 32)
    private String regionsAdmin;
    @Column(name = "FORMAT_RETAIL", length = 8)
    private String formatRetail;
    @Column(name = "LICENSE_STATUS", length = 8)
    private String licenseStatus;
    @Column(name = "LICENSE_FAILURE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date licenseFailureTime;
    @Column(name = "SUPPLY_STATUS", length = 8)
    private String supplyStatus;
    @Column(name = "VALIDITY_PERIOD_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validityPeriodStart;
    @Column(name = "VALIDITY_PERIOD_END")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validityPeriodEnd;
    @Column(name = "ISSUING_AUTHORITY", length = 32)
    private String issuingAuthority;
    @Column(name = "FIRST_ISSUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstIssueDate;
    @Column(name = "LAST_MAKE_CERT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastMakeCertDate;
    @Column(name = "LAST_CLOSED_DATE_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastClosedDateStart;
    @Column(name = "LAST_CLOSED_DATE_END")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastClosedDateEnd;
    @Column(name = "BUSI_LICE_VALIDITY_TYPE", length = 8)
    private String busiLiceValidityType;
    @Column(name = "BUSI_LICE_PERIOD_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date busiLicePeriodStart;
    @Column(name = "BUSI_LICE_PERIOD_END")
    @Temporal(TemporalType.TIMESTAMP)
    private Date busiLicePeriodEnd;
    @Column(name = "CROWD_TYPE", length = 8)
    private String crowdType;
    @Column(name = "LAYOUT_REASONABLE_POLICY", length = 8)
    private String layoutReasonablePolicy;
    @Column(name = "CONTACT_NUMBER", length = 256)
    private String contactNumber;
}
