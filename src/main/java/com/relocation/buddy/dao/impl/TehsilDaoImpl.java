package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ITehsilDao;
import com.relocation.buddy.entity.Tehsil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TehsilDaoImpl implements ITehsilDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Tehsil create(Tehsil tehsil) {
        System.out.println("im in dao");
        Session session=sessionFactory.getCurrentSession();
        session.save(tehsil);
        return null;
    }
}
