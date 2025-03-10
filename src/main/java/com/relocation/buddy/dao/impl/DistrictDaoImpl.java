package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IDistrictDao;
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
public class DistrictDaoImpl implements IDistrictDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String save(District district) {
        Session session = sessionFactory.openSession();
        session.save(district);
        session.close();
        return "Record Save Succesfully";
    }

    @Override
    public List<District> list() {
        String hql = "from District d";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        List<District> districtList = query.list();
        session.close();
        return districtList;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction trx=session.beginTransaction();
        District isExist = session.get(District.class, id);
        if (null == isExist) {
            throw new RecordNotFoundException("District Not found with id " + id);
        }
        session.delete(isExist);
        trx.commit();
        session.close();
    }
}
