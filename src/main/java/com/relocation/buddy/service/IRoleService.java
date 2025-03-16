package com.relocation.buddy.service;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.dto.RoleDto;
import com.relocation.buddy.entity.Role;

import java.util.List;

public interface IRoleService {


    String createRole(RoleDto role);

    List<RoleDto> getList();

    void delete(Integer id);

    RoleDto update(RoleDto roleDto);
}
