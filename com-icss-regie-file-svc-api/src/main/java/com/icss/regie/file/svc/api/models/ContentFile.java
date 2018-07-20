/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.models;


import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
/**
 *  文件夹与文件的关系
 *  一个文件可以属于多个文件夹
 * @author johnson
 */
@Entity(name="ContentFile")
@Table(name="T_CONTENT_FILE",schema="FILE")
public class ContentFile extends BasicEntity {
    
    /**
     *  文件夹  主控方
     */
    @NotNull
    @Valid
    @JoinColumn(name="FOLDER_ID")
    @ManyToOne
    private Folder folder;
    /**
     *  文件夹下的文件
     */
    @NotNull
    @Valid
    @JoinColumn(name="FILE_ID")
    @ManyToOne
    private FileInfo file;
    /**
     * 件夹下的文件或者子文件夹与文件夹关系类型
     *  owner 文件夹拥有此文件夹或者文件,可以删除修改等操作
     *  linked  文件夹可以查看此文件或者文件夹，单不能修改删除
     */
    @NotNull
    @Valid
    @JoinColumn(name="CONTENT_TYPE_ID")
    @ManyToOne
    private ContentType type;

    /**
     * @return the folder
     */
    public Folder getFolder() {
        return folder;
    }

    /**
     * @param folder the folder to set
     * @return this
     */
    public ContentFile setFolder(Folder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * @return the file
     */
    public FileInfo getFile() {
        return file;
    }

    /**
     * @param file the file to set
     * @return this
     */
    public ContentFile setFile(FileInfo file) {
        this.file = file;
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
    public ContentFile setType(ContentType type) {
        this.type = type;
        return this;
    }
}
