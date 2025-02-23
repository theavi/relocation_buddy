package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.TehsilDto;
import com.relocation.buddy.entity.Tehsil;

import java.util.Date;

public class TehsilMapper {
    public static Tehsil toEntity(TehsilDto dto) {
        Tehsil tehsil = new Tehsil();
        tehsil.setName(dto.getName());
        tehsil.setCreatedBy(1);
        tehsil.setCreatedDate(new Date());
        return tehsil;
    }
    public static TehsilDto toDto(Tehsil tehsil){
        TehsilDto tehsilDto = new TehsilDto();
        tehsilDto.setName(tehsil.getName());
        tehsilDto.setId(tehsil.getId());
        tehsilDto.setCreatedBy(tehsil.getCreatedBy());
        tehsilDto.setCreatedDate(tehsil.getCreatedDate());
        tehsilDto.setModifiedBy(tehsil.getModifiedBy());
        tehsilDto.setModifiedDate(tehsil.getModifiedDate());
        return tehsilDto;
    }
}
