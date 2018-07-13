/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.file;

import com.icss.regie.api.models.BasicEntity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author zhangsen
 */
@Entity(name="FileInfo")
@Table(name="T_FILE_INFO",schema="FILE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "REPO_TYPE",length = 2, discriminatorType = DiscriminatorType.STRING) 
@XmlRootElement
public class FileInfo extends BasicEntity<FileInfo>{
    /**
     * 文件名
     */
    @NotNull
    @Size(min = 1, max = 127)
    @Column(name="FILE_NAME",nullable=false,length=127)
    private String name;

    /**
     * 文件mineType 例如application-xml
     */
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name="FILE_MINE_TYPE",nullable=true,length=64)
    private String mimeType;
    /**
     * 文件长度字节数
     */
    @NotNull
    @DecimalMax("99999999999")
    @Digits(integer=32,fraction=0)
    @Column(name="FILE_SIZE",nullable=true,precision=32,scale=0)
    private long size;
    /**
     * 文件路径
     * 文件内容存在磁盘系统需要URI定位
     */
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name="FILE_PATH",nullable=true,length=255)
    private String path;
    /**
     *  文件与多个文件夹有关系
     */
    @OneToMany(mappedBy="file")
    private List<ContentFile> contentFiles;
    
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
    public FileInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @param mimeType the mimeType to set
     * @return this
     */
    public FileInfo setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size the size to set
     * @return this
     */
    public FileInfo setSize(long size) {
        this.size = size;
        return this;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     * @return this
     */
    public FileInfo setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * @return the contentFiles
     */
    @XmlTransient
    public List<ContentFile> getContentFiles() {
        return contentFiles;
    }

    /**
     * @param contentFiles the contentFiles to set
     * @return 
     */
    public FileInfo setContentFiles(List<ContentFile> contentFiles) {
        this.contentFiles = contentFiles;
        return this;
    }
}
