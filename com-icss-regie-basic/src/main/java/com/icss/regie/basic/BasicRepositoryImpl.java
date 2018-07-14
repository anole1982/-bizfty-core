/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.basic;

import com.icss.regie.api.beans.Page;
import com.icss.regie.api.models.BasicModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;

/**
 *
 * @author zhangsen
 */
public abstract class BasicRepositoryImpl implements BasicRepository {

    private EntityManager entityManager;

    @Override
    public void flush() {
        getEntityManager().flush();
    }

    @Override
    public void clean() {
        getEntityManager().clear();
    }

    @Override
    public void delete(Object t) {
        getEntityManager().remove(getEntityManager().merge(t));
    }

    @Override
    public int delete(Class clazz) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaDelete criteriaDelete = criteriaBuilder.createCriteriaDelete(clazz);
        return delete(criteriaDelete);
    }

    @Override
    public <T> int delete(CriteriaDelete criteriaDelete) {
        Query query = getEntityManager().createQuery(criteriaDelete);
        int rowCount = query.executeUpdate();
        return rowCount;
    }

    @Override
    public int deleteById(Class clazz, Serializable id) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaDelete criteriaDelete = criteriaBuilder.createCriteriaDelete(clazz);
        Root root = criteriaDelete.from(clazz);
        EntityType<BasicModel> baseModel = root.getModel();
        Predicate condition = criteriaBuilder.equal(root.get(baseModel.getId(Object.class)), id);
        criteriaDelete.where(condition);
        return delete(criteriaDelete);
    }

    @Override
    public <T> int deleteByIds(Class clazz, List<T> ids) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaDelete criteriaDelete = criteriaBuilder.createCriteriaDelete(clazz);
        Root root = criteriaDelete.from(clazz);
        EntityType<BasicModel> baseModel = root.getModel();
        In in = criteriaBuilder.in(root.get(baseModel.getId(Object.class)));
        Iterator iterator = ids.iterator();
        while (iterator.hasNext()) {
            in.value(iterator.next());
        }
        Predicate condition = criteriaBuilder.in(in);
        criteriaDelete.where(condition);
        return delete(criteriaDelete);
    }

    @Override
    public <T> T findById(Class<T> clazz, Serializable id) {
        T result = getEntityManager().find(clazz, id);
        return result;
    }

    @Override
    public <T> T getById(Class<T> clazz, Serializable id) {
        T result = getEntityManager().getReference(clazz, id);
        return result;
    }

    @Override
    public <T> T find(CriteriaQuery<T> criteriaQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

    public <T> T find(Class<T> clazz, Map<String, Object> params) {

        List<Predicate> conditionList = new ArrayList<Predicate>();

        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();

        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);

        Root<T> root = criteriaQuery.from(clazz);

        for (Entry<String, Object> entry : params.entrySet()) {

            Predicate condition = criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue());

            conditionList.add(condition);

        }

        criteriaQuery.where(conditionList.toArray(new Predicate[0]));

        TypedQuery<T> typedQuery = getEntityManager().createQuery(criteriaQuery);

        return (T) typedQuery.getSingleResult();

    }

    /*    @Override
    public <T> T find(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
    public <T> List<T> list(CriteriaQuery<T> criteriaQuery) {
        Query query = getEntityManager().createQuery(criteriaQuery);
        List<T> results = query.getResultList();
        return results;
    }

    @Override
    public <T> List<T> list(CriteriaQuery<T> criteriaQuery, Page page) {
        Query query = getEntityManager().createQuery(criteriaQuery);
        //if(page.getRecordCount()!=0){
        Query queryForPageCount = getEntityManager().createQuery(criteriaQuery);
        List<T> result = queryForPageCount.getResultList();
        page.setRecordCount(result.size());
        page = new Page(page.getCurrentPage(), page.getRecordCount(), page.getPageSize());
        query.setFirstResult(page.getStart());
        query.setMaxResults(page.getPageSize());
        // }

        List<T> results = query.getResultList();
        return results;
    }

    @Override
    public <T> List<T> list(Class<T> clazz, Map<String, Object> params) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //supported by cobain
        List<Predicate> conditionList = new ArrayList<Predicate>();
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        for (Entry<String, Object> entry : params.entrySet()) {
            Predicate condition = criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue());
            conditionList.add(condition);
        }
        criteriaQuery.where(conditionList.toArray(new Predicate[0]));
        TypedQuery<T> typedQuery = getEntityManager().createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    @Override
    public <T extends Object> List<T> list(Class<T> clazz, Page page) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(clazz);
        criteriaQuery.from(clazz);
        try {
            page.setRecordCount(count(clazz));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list(criteriaQuery, page);
    }

    @Override
    public <T> List<T> list(Class<T> clazz, Map<String, Object> params, Page page) {
        List<Predicate> conditionList = new ArrayList<Predicate>();
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        if (params != null && !params.isEmpty()) {
            for (Entry<String, Object> entry : params.entrySet()) {
                Predicate condition = null;
                if (entry.getValue() == null) {
                    condition = criteriaBuilder.isNull(root.get(entry.getKey()));
                    condition.isNull();
                    conditionList.add(condition);
                } else if (entry.getValue() instanceof Collection) {
                    In in = criteriaBuilder.in(root.get(entry.getKey()));
                    Iterator iterator = ((Collection) entry.getValue()).iterator();
                    while (iterator.hasNext()) {
                        in.value(iterator.next());
                    }
                    condition = criteriaBuilder.in(in);
                } else if (entry.getValue().getClass().isArray() && ((Object[]) entry.getValue()).length > 0) {
                    In in = criteriaBuilder.in(root.get(entry.getKey()));
                    Object[] arr = ((Object[]) entry.getValue());
                    for (Object obj : arr) {
                        in.value(obj);
                    }
                    condition = criteriaBuilder.in(in);
                } else {
                    condition = criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue());
                    conditionList.add(condition);
                }
            }
        }
        criteriaQuery.where(conditionList.toArray(new Predicate[0]));
//    	Order asc = criteriaBuilder.asc(root.get(""));
//		criteriaQuery.orderBy(asc);
        page.setRecordCount(count(clazz, params));
        List tasklist = list(criteriaQuery, page);
        return tasklist;
    }

    public <T extends Object> int count(Class<T> clazz) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Long.class);
        criteriaQuery.select(criteriaBuilder.count(criteriaQuery.from(clazz)));
        Query query = getEntityManager().createQuery(criteriaQuery);
        Long result = (Long) query.getSingleResult();
        return result.intValue();
    }

    public <T extends Object> int count(Class<T> clazz, Map<String, Object> params) {
        List<Predicate> conditionList = new ArrayList<Predicate>();
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<T> root = criteriaQuery.from(clazz);
        EntityType baseModel = root.getModel();
        criteriaQuery.select(criteriaBuilder.count(root.get(baseModel.getId(Object.class))));

        if (params != null && !params.isEmpty()) {
            for (Entry<String, Object> entry : params.entrySet()) {
                Predicate condition = null;
                if (entry.getValue() == null) {
                    condition = criteriaBuilder.isNull(root.get(entry.getKey()));
                    condition.isNull();
                    conditionList.add(condition);
                } else if (entry.getValue() instanceof Collection) {
                    In in = criteriaBuilder.in(root.get(entry.getKey()));
                    Iterator iterator = ((Collection) entry.getValue()).iterator();
                    while (iterator.hasNext()) {
                        in.value(iterator.next());
                    }
                    condition = criteriaBuilder.in(in);
                } else if (entry.getValue().getClass().isArray() && ((Object[]) entry.getValue()).length > 0) {
                    In in = criteriaBuilder.in(root.get(entry.getKey()));
                    Object[] arr = ((Object[]) entry.getValue());
                    for (Object obj : arr) {
                        in.value(obj);
                    }
                    condition = criteriaBuilder.in(in);
                } else {
                    condition = criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue());
                    conditionList.add(condition);
                }
            }
        }
        criteriaQuery.where(conditionList.toArray(new Predicate[0]));
        Query query = getEntityManager().createQuery(criteriaQuery);
        Long result = (Long) query.getSingleResult();
        return result.intValue();
    }

    @Override
    public <T> List<T> list(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> List<T> list(T entity, Page page) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T merge(T t) {
        return getEntityManager().merge(t);
    }

    @Override
    public void persist(Object t) {
        getEntityManager().persist(t);
    }

    /**
     * @return the entityManager
     */
    public abstract EntityManager getEntityManager() ;

}
