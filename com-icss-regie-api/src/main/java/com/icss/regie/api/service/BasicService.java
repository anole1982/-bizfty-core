/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.service;

import com.icss.regie.api.beans.Page;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author johns
 */
public interface BasicService {

    /**
     * 对象删除
     *
     * @param t 需要删除的对象
     */
    void delete(Object t);

    /**
     * 对象删除（不带版本控制）
     *
     * @param clazz 实体类
     * @return 成功删除了多少条记录
     */
    int delete(Class clazz);

    /**
     * 对象删除（不带版本控制） pkName为"ID"的情况下
     *
     * @param clazz 实体类
     * @param id 主键ID
     * @return 0 表示数据已经不存在此记录， 1 表示数据删除成功
     */
    int deleteById(Class clazz, Serializable id);

    /**
     * 对象删除（不带版本控制） pkName为"ID"的情况下
     *
     * @param T
     * @param clazz 实体类
     * @param ids 主键ID 数组
     * @return 0 表示数据已经不存在此记录， 大于0 表示数据删除成功记录数
     */
    <T extends Object> int deleteByIds(Class clazz, List<T> ids);

    /**
     * 根据对象ID查找对象
     *
     * @param <T>
     * @param clazz 要找的类
     * @param id 对象ID
     * @return
     */
    <T extends Object> T findById(Class<T> clazz, Serializable id);

    /**
     * 根据查询条件查找对象列表
     *
     * @param clazzName 查询类
     * @param params 查询条件
     * @return
     */
    <T extends Object> T find(Class<T> clazz, Map<String, Object> params);

    /**
     * 根据查询条件查找对象列表
     *
     * @param <T>
     * @param clazz 查询类
     * @param params 查询条件
     * @return
     */
    <T extends Object> List<T> list(Class<T> clazz, Map<String, Object> params);

    /**
     * 根据查询条件查找对象列表
     *
     * @param <T>
     * @param clazz 查询类
     * @param page 分页
     * @return
     */
    <T extends Object> List<T> list(Class<T> clazz, Page page);

    /**
     * 根据查询条件查找对象列表
     *
     * @param <T>
     * @param clazz 查询类
     * @param params 查询条件
     * @param page 分页
     * @return
     */
    <T extends Object> List<T> list(Class<T> clazz, Map<String, Object> params, Page page);

    /**
     * 根据实体查找对象列表
     *
     * @param <T>
     * @param entity 查询实体
     * @return
     */
    <T extends Object> List<T> list(T entity);

    /**
     * 根据实体查找对象列表
     *
     * @param <T>
     * @param entity 查询实体
     * @param page 分页
     * @return
     */
    <T extends Object> List<T> list(T entity, Page page);

    /**
     * 对象更新 saveOrUpdate
     *
     * @param <T>
     * @param t 需要更新的对象
     * @return
     */
    <T extends Object> T merge(T t);

    /**
     * 对象保存 save
     *
     * @param t 需要保存的对象
     */
    void save(Object t);
}
