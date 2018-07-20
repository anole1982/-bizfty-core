/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.beans;

import com.icss.regie.api.models.BasicEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 创建文件夹
 * 对应到 fastdfs group
 * 对应到阿里 bucket
 * 对应到文件系统 为文件系统路径
 * @author 张森
 */
public class CreateFolderRequest extends BasicEntity {
    /**
     * 文件夹名称
     */
    @NotNull
    @Size(min=1,max=255)
    private String name;
}
