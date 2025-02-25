package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.service.IDistrictService;
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
}
