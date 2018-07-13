/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.file;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 文件夹与文件的关系 一个文件可以属于多个文件夹
 *
 * @author johnson
 */
@Entity(name="ContentFolder")
@Table(name="T_CONTENT_FOLDER",schema="FILE")
public class ContentFolder extends BasicEntity {

    /**
     * 文件夹 主控方
     */
    @NotNull
    @Valid
    @JoinColumn(name="PARENT_FOLDER_ID")
    @ManyToOne
    private Folder parent;
    /**
     * 子文件夹
     */
    @NotNull
    @Valid
    @JoinColumn(name="CHILD_FOLDER_ID")
    @ManyToOne
    private Folder child;
    /**
     * 件夹下的文件或者子文件夹与文件夹关系类型 owner 文件夹拥有此文件夹或者文件,可以删除修改等操作 linked
     * 文件夹可以查看此文件或者文件夹，单不能修改删除
     */
    @NotNull
    @Valid
    @JoinColumn(name="CONTENT_TYPE_ID")
    @ManyToOne
    private ContentType type;

    /**
     * @return the parent
     */
    public Folder getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     * @return this
     */
    public ContentFolder setParent(Folder parent) {
        this.parent = parent;
        return this;
    }

    /**
     * @return the child
     */
    public Folder getChild() {
        return child;
    }

    /**
     * @param child the child to set
     * @return this
     */
    public ContentFolder setChild(Folder child) {
        this.child = child;
        return this;
    }

    /**
     * @return the type
     */
    public ContentType getType() {
        return type;
    }

    /**
     * @param type the type to set
     * @return this
     */
    public ContentFolder setType(ContentType type) {
        this.type = type;
        return this;
    }
}
