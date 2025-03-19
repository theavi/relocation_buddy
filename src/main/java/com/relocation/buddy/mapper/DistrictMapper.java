package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DistrictMapper {
    public  District toEntity(DistrictDto dto) {
        District district = new District();
        district.setId(dto.getId());
        district.setName(dto.getName());
        district.setCreatedBy(1);
        district.setCreatedDate(new Date());
        district.setModifiedDate(dto.getModifiedDate());
        district.setModifiedBy(dto.getModifiedBy());
        return district;
    }

    public  DistrictDto toDto(District entity) {
        DistrictDto dto = new DistrictDto();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        dto.setModifiedBy(entity.getModifiedBy());
        dto.setModifiedDate(entity.getModifiedDate());
        return dto;
    }
}
