/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.file.svc.api.beans;

import com.icss.regie.api.beans.BasicResponse;
import com.icss.regie.file.svc.api.models.FileInfo;

/**
 * 
 * @author 张森
 */
public class SaveFileResponse extends BasicResponse {
    /**
     * 文件基本信息
     */
    private FileInfo file;
}
