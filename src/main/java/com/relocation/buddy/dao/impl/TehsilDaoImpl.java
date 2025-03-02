package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ITehsilDao;
import com.relocation.buddy.entity.Tehsil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TehsilDaoImpl implements ITehsilDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Tehsil create(Tehsil tehsil) {
        System.out.println("im in dao");
        Session session = sessionFactory.getCurrentSession();
        Integer id = (Integer) session.save(tehsil);
        tehsil.setId(id);
        session.close();
        return tehsil;
    }

    @Override
    public List<Tehsil> list() {
        String hql="from Tehsil";
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(hql);
        List<Tehsil> list= query.list();
        session.close();
        return list;
    }
}
