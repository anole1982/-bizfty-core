/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 文件夹下的文件或者子文件夹与文件夹关系 owner 文件夹拥有此文件夹或者文件,可以删除修改等操作 linked
 * 文件夹可以查看此文件或者文件夹，单不能修改删除
 *
 * @author johnson
 */
@Entity(name="ContentType")
@Table(name="T_CONTENT_TYPE",schema="FILE")
public class ContentType extends BasicEntity {

    /**
     * 类型名
     */
    @NotNull
    @Size(min = 1, max = 127)
    @Column(name="CONTENT_TYPE_NAME",nullable=false,length=127)
    private String name;
    /**
     * 类型描述
     */
    @Size(min = 1, max = 255)
    @Column(name="CONTENT_TYPE_DESCRIPT",nullable=true,length=255)
    private String descript;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return this
     */
    public ContentType setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the descript
     */
    public String getDescript() {
        return descript;
    }

    /**
     * @param descript the descript to set
     * @return this
     */
    public ContentType setDescript(String descript) {
        this.descript = descript;
        return this;
    }
}
