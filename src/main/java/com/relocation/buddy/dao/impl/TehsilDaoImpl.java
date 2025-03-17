package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ITehsilDao;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.entity.Tehsil;
import com.relocation.buddy.exception.RecordNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction trx = session.beginTransaction();
        Tehsil isExist = session.get(Tehsil.class, id);
        if (null == isExist) {
            throw new RecordNotFoundException("Tehsil Not found with id " + id);
        }
        session.delete(isExist);
        trx.commit();
        session.close();
    }

    @Override
    public Tehsil update(Tehsil tehsil) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(tehsil);
        tx.commit();
        session.close();
        return tehsil;

    }

    @Override
    public Tehsil findById(Integer id) {
        Session session = sessionFactory.openSession();
        Tehsil isExist = session.get(Tehsil.class, id);
        session.close();
        return isExist;
    }
}
