package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.exception.RecordNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        Session session = sessionFactory.getCurrentSession();
        session.save(district);
        session.close();
        return "Record Save Succesfully";
    }

    @Override
    public List<District> list() {
        String hql = "from District d";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        List<District> districtList = query.list();
        session.close();
        return districtList;
    }

    @Override
    public Integer delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        District isExist = session.get(District.class, id);
        if (null == isExist) {
            throw new RecordNotFoundException("District Not found with id " + id);
        }
        session.delete(isExist);
        return isExist.getId();
    }
}
