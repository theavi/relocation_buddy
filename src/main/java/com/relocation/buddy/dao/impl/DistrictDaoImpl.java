package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.service.IDistrictService;
import org.springframework.stereotype.Repository;

@Repository
public class DistrictDaoImpl implements IDistrictDao {
    @Override
    public String save(District entity) {
        return "Record Save Succesfully";
    }
}
