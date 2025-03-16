package com.relocation.buddy.service.impl;
import com.relocation.buddy.dao.IRoleDao;
import com.relocation.buddy.dto.RoleDto;
import com.relocation.buddy.entity.Role;
import com.relocation.buddy.exception.RecordNotFoundException;
import com.relocation.buddy.mapper.RoleMapper;
import com.relocation.buddy.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;


    @Override
    public String createRole(RoleDto role) {

        Role entity = RoleMapper.toEntity(role);

        String created = roleDao.save(entity);

        return created ;
    }

    @Override
    public List<RoleDto> getList() {

        List<Role> allRole = roleDao.getAllRole();

        List<RoleDto> roleDtoList = new ArrayList<>();

        for (Role role : allRole){

            roleDtoList.add(RoleMapper.toDto(role));
        }

        return roleDtoList;
    }

    @Override
    public void delete(Integer id) {
        roleDao.deleteRoleById(id);
    }

    @Override
    public RoleDto update(RoleDto dto) {

        Role isExist = roleDao.findByID(dto.getRoleId());

        if (isExist == null){

            throw new RecordNotFoundException("Record not found" + dto.getRoleName());
        }

        Role entity = RoleMapper.toEntity(dto);

        entity.setModifiedDate(new Date());
        entity.setModifiedBy(1);

        return RoleMapper.toDto(roleDao.updateRole(entity));
    }


}
