package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.City;
import com.relocation.buddy.entity.District;

import java.util.Date;

public class CityMapper {
    public static City ToEntity(CityDto dto) {
        City city = new City();
        city.setName(dto.getName());
        city.setCreatedBy(1);
        city.setCreatedDate(new Date());
        return city;
    }
    public static CityDto toDto(City entity){
        CityDto dto = new CityDto();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }

}
