package com.relocation.buddy.dao;

import com.relocation.buddy.entity.Role;

import java.util.List;

public interface IRoleDao {


    String save(Role role);

    List<Role> getAllRole();

    void deleteRoleById(Integer id);

    Role updateRole(Role role);

    Role findByID(Integer id);
}
