/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class Page {

    /**
     * <p>默认页面行数</p>
     */
    private static Integer DEFAULT_PAGE_SIZE = 20;
    /**
     * <p>起始数据行号</p>
     */
    private int start = 0;
    /**
     * <p>结束数据行号</p>
     */
    private int end = 1;
    /**
     * <p>查询记录总数</p>
     */
    private int recordCount = 1;
    /**
     * <p>当前页号</p>
     */
    private int currentPage = 1;
    /**
     * <p>分页总数</p>
     */
    private int pageCount = 1;
    /**
     * <p>页面行数</p>
     */
    private int pageSize = DEFAULT_PAGE_SIZE;
    
    /**
     * 
     * @param currentPage 当前页号 默认为 第1页
     * @param recordCount 查询记录总数 
     * @param pageSize 页面行数  默认为 30条数据
     */
    public Page(int currentPage, int recordCount, int pageSize) {
        if (currentPage < 1) {
            currentPage = 1;
        }
        this.currentPage = currentPage;
        if (pageSize < 1) {
            pageSize = 1;
        }
        this.pageSize = pageSize;
        this.recordCount=recordCount;
        this.start += (currentPage - 1) * pageSize;
        this.end = start + pageSize;
    }
    /**
     * 
     * @param currentPage 当前页号 默认为 第1页
     * @param recordCount 查询记录总数 
     */
    public Page(int currentPage, int recordCount) {
        this(currentPage, recordCount, DEFAULT_PAGE_SIZE);
    }

    public Page() {
    	this(1, 1, DEFAULT_PAGE_SIZE);
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount() {
        pageCount = recordCount / pageSize
                + (recordCount % pageSize == 0 ? 0 : 1);
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
        setPageCount();
        this.start = (currentPage-1)*pageSize;
        end = this.start+pageSize;
        end = (end <= recordCount ? end : recordCount);
        currentPage = (currentPage <= pageCount ? currentPage : pageCount);
    }

    public boolean getHasPrevious() {
        return currentPage > 1;
    }

    public boolean getHasNext() {
        return currentPage < pageCount;
    }
}
