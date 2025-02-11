package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;

import java.util.Date;

public class DistrictMapper {
    public static District ToEntity(DistrictDto dto) {
        District district = new District();
        district.setName(dto.getName());
        district.setCreatedBy(1);
        district.setCreatedDate(new Date());
        return district;
    }
}
