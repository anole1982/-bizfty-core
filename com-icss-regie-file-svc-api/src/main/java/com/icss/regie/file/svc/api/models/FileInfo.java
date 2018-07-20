/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.models;

import com.icss.regie.api.models.BasicEntity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlRootElement;
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
     * Content-Disposition
     */
    @NotNull
    @Size(min = 1, max = 127)
    @Column(name="NAME",nullable=false,length=127)
    private String name;

    /**
     * 文件mineType 例如application-xml
     * Content-Type
     */
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name="MINE_TYPE",nullable=true,length=64)
    private String mimeType;
    /**
     * 文件长度字节数
     * Content-Length
     */
    @NotNull
    @DecimalMax("99999999999")
    @Digits(integer=32,fraction=0)
    @Column(name="SIZE",nullable=true,precision=32,scale=0)
    private long size;
    /**
     * 文件路径
     * 文件内容存在磁盘系统需要URI定位
     */
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name="FILE_PATH",nullable=true,length=255)
    private String path;
}
