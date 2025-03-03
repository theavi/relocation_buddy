package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IServiceDao;
import com.relocation.buddy.entity.RLBService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceDaoImpl implements IServiceDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String save(RLBService service) {
        Session session = sessionFactory.getCurrentSession();
        session.save(service);
        session.close();
        return "Record Save Succesfully";
    }
}
