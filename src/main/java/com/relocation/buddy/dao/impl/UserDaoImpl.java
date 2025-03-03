package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IUserDao;
import com.relocation.buddy.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String create(User entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        session.close();
        return "User Created Successfully";
    }
}