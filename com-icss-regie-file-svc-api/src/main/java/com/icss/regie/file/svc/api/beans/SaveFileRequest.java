/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.beans;

import com.icss.regie.api.beans.BasicRequest;
import com.icss.regie.file.svc.api.models.FileInfo;

/**
 * 对象存储 OSS	文件系统
 * Object	文件
 * Bucket	主目录 
 * Region	无
 * Endpoint	无
 * AccessKey	无
 * 无	多级目录
 * GetService	获取主目录列表
 * GetBucket	获取文件列表
 * PutObject	写文件
 * AppendObject	追加写文件
 * GetObject	读文件
 * DeleteObject	删除文件
 * 无	修改文件内容
 * CopyObject （目的和源相同）	修改文件属性
 * CopyObject	复制文件
 * 无	重命名文件
 * @author 张森
 */
public class SaveFileRequest extends BasicRequest {
    /**
     * 文件基本信息
     */
    private FileInfo file;
    /**
     * 文件内容
     */
    private byte[] content;
}
