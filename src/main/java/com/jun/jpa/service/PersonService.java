package com.jun.jpa.service;

import com.jun.jpa.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by JUN on 2017/5/15.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    /**
     * 新增
     * @param o
     */
    @Transactional
    public void save(Object o){
        personDao.save(o);
    }

    /**
     * 删除
     * @param o
     */
    @Transactional
    public void delete(Object o){
        personDao.delete(o);
    }

    /**
     * 查询
     * @param o
     */
    @Transactional
    public void find(Object o){
        personDao.find(o);
    }
    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
