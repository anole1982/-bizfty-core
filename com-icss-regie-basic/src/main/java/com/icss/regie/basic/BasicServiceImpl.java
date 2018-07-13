package com.icss.regie.basic;

import com.icss.regie.api.beans.Page;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


public abstract class BasicServiceImpl implements BasicService {

    public abstract <T extends BasicRepository> T getRepository();

    @Override
    public void delete(Object t) {
        getRepository().delete(t);
    }

    @Override
    public int delete(Class clazz) {
        return getRepository().delete(clazz);
    }

    @Override
    public int deleteById(Class clazz, Serializable id) {
        return getRepository().deleteById(clazz, id);
    }

    @Override
    public <T> int deleteByIds(Class clazz, List<T> ids) {
        return getRepository().deleteByIds(clazz, ids);
    }

    @Override
    public <T> T findById(Class<T> clazz, Serializable id) {
        return getRepository().findById(clazz, id);
    }

    @Override
    public <T> T find(Class<T> clazz, Map<String, Object> params) {
        return getRepository().find(clazz, params);
    }


    /*	@Override
	public <T> T find(T entity) {
		return getRepository().find(entity);
	}*/
    @Override
    public <T> List<T> list(Class<T> clazz, Map<String, Object> params) {
        return getRepository().list(clazz, params);
    }

    @Override
    public <T> List<T> list(Class<T> clazz, Page page) {
        return getRepository().list(clazz, page);
    }

    @Override
    public <T> List<T> list(Class<T> clazz, Map<String, Object> params, Page page) {
        return getRepository().list(clazz, params, page);
    }

    @Override
    public <T> List<T> list(T entity) {
        return getRepository().list(entity);
    }

    @Override
    public <T> List<T> list(T entity, Page page) {
        return getRepository().list(entity, page);
    }

    @Override
    public <T> T merge(T t) {
        return getRepository().merge(t);
    }

    @Override
    public void save(Object t) {
        getRepository().persist(t);
    }

}
