package com.jun.jpa.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * JPAdao的父类，负责entityManager的生产
 * Created by JUN on 2017/5/15.
 */
public class JPACommon {
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 添加方法
     * @param o
     */
    public void save(Object o){
        entityManager.persist(o);
    }

    /**
     * 删除
     * @param o
     */
    public void delete(Object o){
        entityManager.remove(o);
    }

    /**
     * 查询一个
     * @param o
     * @return Obeject
     */
    public Object find(Object o){
        return  entityManager.find(Object.class,o);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
