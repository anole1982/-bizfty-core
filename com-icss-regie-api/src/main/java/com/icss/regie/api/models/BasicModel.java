/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author johnson
 * @param <E>
 */
@Embeddable
@MappedSuperclass
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicModel",namespace="http://api.regie.icss.com/models", propOrder = {
    "id"
})

public class BasicModel<E> implements Serializable, Comparable {

    /**
     * 对象ID
     * <p>
     * 对象ID全局唯一</p>
     * <p>
     * ID 算法</p>
     * <p>
     * 08位程序部署序号</p>
     * <p>
     * 13位时间毫秒值</p>
     * <p>
     * 10为顺序数字组成</p>
     */
    @Id
    @Column(name = "RECOND_ID", unique = true, nullable = false, length = 32)
    private String id;

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BasicModel)) {
            return false;
        }
        BasicModel other = (BasicModel) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     * @return this
     */
    public E setId(String id) {
        this.id = id;
        return (E)this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ENTITY[ id=" + getId() + " ]";
    }

    @Override
    public int compareTo(Object o) {
        BasicModel b = (BasicModel) o;
        return this.getId().compareTo(b.getId());
    }
}
