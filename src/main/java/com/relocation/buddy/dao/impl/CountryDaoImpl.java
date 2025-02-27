package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ICountryDao;
import com.relocation.buddy.entity.City;
import com.relocation.buddy.entity.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
