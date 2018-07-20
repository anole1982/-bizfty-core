/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author zhangsen
 * @param <E>
 */
@Embeddable
@MappedSuperclass
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicEntity",namespace="http://api.regie.icss.com/models", propOrder = {
    "recordCreateTime",
    "recordCreateUserId",
    "recordUpdateTime",
    "recordUpdateUserId",
    "recordStatus",
    "recordVersion"
})

public class BasicEntity<E> extends BasicModel<E> implements Serializable, Comparable {

    /**
     * 创建时间
     * <p>
     * 对象创建时间</p>
     * <p>
     * 默认为当前时间</p>
     * <p>
     * 精确到毫秒值</p>
     */
    @Column(name = "RECOND_CREATE_TIME", unique = false, updatable = false, nullable = false, length = 7)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date recordCreateTime = new Date();
    /**
     * 创建者
     * <p>
     * 对象创建者</p>
     * <p>
     * 不可为空</p>
     */
    @Column(name = "RECOND_CREATE_USER_ID", updatable = false)
    private String recordCreateUserId;
    /**
     * 修改时间
     * <p>
     * 对象修改时间</p>
     * <p>
     * 默认为当前时间</p>
     * <p>
     * 精确到毫秒值</p>
     */
    @Column(name = "RECOND_UPDATE_TIME", unique = false, nullable = false, length = 7)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date recordUpdateTime = new Date();
    /**
     * 更新者
     * <p>
     * 对象更新者</p>
     * <p>
     * 不可为空</p>
     */
    @Column(name = "RECOND_UPDATE_USER_ID", length = 32)
    private String recordUpdateUserId;
    /**
     * 记录存在状态
     */
    @Column(name = "RECODE_STATUS")
    private String recordStatus;
    /**
     * 数据版本
     * <p>
     * 用于数据加锁</p>
     */
    @Column(name = "RECODE_VERSION", precision = 19, scale = 0)
    private Long recordVersion = 1l;
// <editor-fold defaultstate="collapsed" desc=" Generated Code 属性 GET SET 方法">  

    /**
     * @return the createTime
     */
    public Date getRecordCreateTime() {
        return recordCreateTime;
    }

    /**
     * @param recordCreateTime the recordCreateTime to set
     * @return 
     */
    public E setRecordCreateTime(Date recordCreateTime) {
        this.recordCreateTime = recordCreateTime;
        return (E)this;
    }

    /**
     * @return the createUser
     */
    public String getRecordCreateUserId() {
        return recordCreateUserId;
    }

    /**
     * @param recordCreateUserId the recordCreateUserId to set
     * @return 
     */
    public E setRecordCreateUserId(String recordCreateUserId) {
        this.recordCreateUserId = recordCreateUserId;
        return (E)this;
    }

    /**
     * @return the recordUpdateTime
     */
    public Date getRecordUpdateTime() {
        return recordUpdateTime;
    }

    /**
     * @param recordUpdateTime the recordUpdateTime to set
     * @return 
     */
    public E setRecordUpdateTime(Date recordUpdateTime) {
        this.recordUpdateTime = recordUpdateTime;
        return (E)this;
    }

    /**
     * @return the updateUser
     */
    public String getRecordUpdateUserId() {
        return recordUpdateUserId;
    }

    /**
     * @param recordUpdateUserId the recordUpdateUserId to set
     * @return 
     */
    public E setRecordUpdateUserId(String recordUpdateUserId) {
        this.recordUpdateUserId = recordUpdateUserId;
        return (E)this;
    }

    /**
     * @return the status
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * @param recordStatus the recordStatus to set
     */
    public E setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
        return (E)this;
    }

    /**
     * @return the recordVersion
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * @param recordVersion the recordVersion to set
     */
    public E setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
        return (E)this;
    }
    // </editor-fold>    

}
