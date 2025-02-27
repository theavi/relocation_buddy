package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ICountryDao;
import com.relocation.buddy.entity.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDaoImpl implements ICountryDao {
    @Autowired
    SessionFactory sessionFactory;


    @Override
    public String save(Country entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        session.close();
        return "Record Save Succesfully";
    }

    @Override
    public List<Country> list() {
        String hql = "from Country c";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        List<Country> countryList = query.list();
        session.close();
        return countryList;
    }
}
