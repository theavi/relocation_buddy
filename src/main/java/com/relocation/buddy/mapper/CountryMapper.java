package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.entity.Country;

import java.util.Date;

public class CountryMapper {
    public static Country ToEntity(CountryDto dto) {
        Country country = new Country();
        country.setName(dto.getName());
        country.setCreatedBy(1);
        country.setCreatedDate(new Date());
        return country;
    }

    public static CountryDto toDto(Country entity){
        CountryDto dto = new CountryDto();
        dto.setName(entity.getName());
        return dto;
    }
}
