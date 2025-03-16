package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IRoleDao;
import com.relocation.buddy.entity.Role;
import com.relocation.buddy.exception.RecordNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements IRoleDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String save(Role role) {

        Session session = sessionFactory.openSession();
        session.save(role);
        session.close();
        return "Role Saved Successfully";
    }

    @Override
    public List<Role> getAllRole() {

        String hql = "from Role r";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        List roleList = query.list();
        session.close();
        return roleList;
    }

    @Override
    public void deleteRoleById(Integer id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Role isExist = session.get(Role.class, id);

        if (isExist == null){
            throw new RecordNotFoundException("Role not found" + id);
        }

        session.delete(isExist);
        transaction.commit();
        session.close();

    }

    @Override
    public Role updateRole(Role role) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(role);
        transaction.commit();
        session.close();
        return role;
    }

    @Override
    public Role findByID(Integer id) {

        Session session = sessionFactory.openSession();
        Role isExist = session.get(Role.class, id);

        if (isExist == null){
          throw new RecordNotFoundException("Role not found" + id);
        }else {
          session.close();
          return isExist;
        }
    }
}
