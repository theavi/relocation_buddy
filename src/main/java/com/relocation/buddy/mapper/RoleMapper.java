package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.RoleDto;
import com.relocation.buddy.entity.Role;

import java.util.Date;

public class RoleMapper {


    public static Role toEntity(RoleDto dto){

        Role role = new Role();

        role.setRoleId(dto.getRoleId());
        role.setRoleName(dto.getRoleName());
        role.setCreatedBy(1);
        role.setCreatedDate(new Date());
        role.setModifiedDate(dto.getModifiedDate());
        role.setModifiedBy(dto.getModifiedBy());

        return role;
    }


    public static RoleDto toDto(Role role){

        RoleDto roleDto = new RoleDto();

        roleDto.setRoleId(role.getRoleId());
        roleDto.setRoleName(role.getRoleName());
        roleDto.setModifiedBy(role.getModifiedBy());
        roleDto.setModifiedDate(role.getModifiedDate());

        return roleDto;
    }

}
