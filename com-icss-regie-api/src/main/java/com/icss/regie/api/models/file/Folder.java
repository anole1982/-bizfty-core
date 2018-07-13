/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.file;

import com.icss.regie.api.models.BasicEntity;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author johnson
 */
@Entity(name="Folder")
@Table(name="T_FOLDER",schema="FILE")
public class Folder extends BasicEntity {

    /**
     * 文件夹名字 Linux文件名限制为：单一文件或目录的最大容许文件名为255个字符， 包括完整路径名称及目录（/）的完整文件名为4096个字符。
     * Windows下：文件名的长度不能超过255个字符
     */
    @NotNull
    @Size(min = 1, max = 127)
    @Column(name="FOLDER_NAME",nullable=false,length=127)
    private String name;
    /**
     * 文件夹描述
     */
    @Column(name="FOLDER_DESCRIPT",nullable=false,length=127)
    @Size(min = 1, max = 255)
    private String descript;
    /**
     * 文件夹所包含的文件
     */
    @Valid
    @OneToMany(mappedBy="folder")
    private Collection<ContentFile> contentFiles;
    /**
     * 文件夹所包含的子文件夹
     */
    @Valid
    @OneToMany(mappedBy="parent")
    private Collection<ContentFolder> contentFolders;
    /**
     * 文件夹图标
     */
    @Valid
    @ManyToOne
    @JoinColumn(name="ICON_FILE_ID")
    private FileInfo icon;

}
