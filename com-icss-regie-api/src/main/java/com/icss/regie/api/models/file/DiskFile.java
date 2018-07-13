/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.file;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author zhangsen
 */
@Entity
@Table(name="T_DISK_FILE",schema="FILE")
@DiscriminatorValue("D")
public class DiskFile extends FileInfo {
    
    private String path;

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     * @return this;
     */
    @Override
    public DiskFile setPath(String path) {
        this.path = path;
        return this;
    }
}
