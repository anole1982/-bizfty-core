/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.models;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author zhangsen
 */
@Entity
@Table(name="T_DISK_FILE",schema="FILE")
@DiscriminatorValue("D")
public class DiskFile extends FileInfo {
    /**
     *  文件与多个文件夹有关系
     */
    @OneToMany(mappedBy="file")
    private List<ContentFile> contentFiles;
}
