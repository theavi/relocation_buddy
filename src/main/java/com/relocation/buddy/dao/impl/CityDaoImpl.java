package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ICityDao;
import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.entity.City;
import com.relocation.buddy.service.ICityService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
