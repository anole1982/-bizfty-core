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
    "createTime",
    "createUserId",
    "updateTime",
    "updateUserId",
    "status",
    "version"
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
    private Date createTime = new Date();
    /**
     * 创建者
     * <p>
     * 对象创建者</p>
     * <p>
     * 不可为空</p>
     */
    @Column(name = "RECOND_CREATE_USER_ID", updatable = false)
    private String createUserId;
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
    private Date updateTime = new Date();
    /**
     * 更新者
     * <p>
     * 对象更新者</p>
     * <p>
     * 不可为空</p>
     */
    @Column(name = "RECOND_UPDATE_USER_ID", length = 32)
    private String updateUserId;
    /**
     * 记录存在状态
     */
    @Column(name = "RECODE_STATUS")
    private String status;
    /**
     * 数据版本
     * <p>
     * 用于数据加锁</p>
     */
    @Column(name = "RECODE_VERSION", precision = 19, scale = 0)
    private Long version = 1l;
// <editor-fold defaultstate="collapsed" desc=" Generated Code 属性 GET SET 方法">  

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     * @return 
     */
    public E setCreateTime(Date createTime) {
        this.createTime = createTime;
        return (E)this;
    }

    /**
     * @return the createUser
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId the createUserId to set
     * @return 
     */
    public E setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return (E)this;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     * @return 
     */
    public E setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return (E)this;
    }

    /**
     * @return the updateUser
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * @param updateUserId the updateUserId to set
     * @return 
     */
    public E setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return (E)this;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public E setStatus(String status) {
        this.status = status;
        return (E)this;
    }

    /**
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public E setVersion(Long version) {
        this.version = version;
        return (E)this;
    }
    // </editor-fold>    

}
