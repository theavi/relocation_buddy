package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ICityDao;
import com.relocation.buddy.entity.City;
import com.relocation.buddy.entity.Country;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.exception.RecordNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl implements ICityDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String save(City entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        session.close();
        return "Record Save Succesfully";
    }

    @Override
    public List<City> list() {
        String hql = "from City c";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        List<City> cityList = query.list();
        session.close();
        return cityList;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction trx=session.beginTransaction();
        City isExist = session.get(City.class, id);
        if (null == isExist) {
            throw new RecordNotFoundException("City Not found with id " + id);
        }
        session.delete(isExist);
        trx.commit();
        session.close();
    }
}
