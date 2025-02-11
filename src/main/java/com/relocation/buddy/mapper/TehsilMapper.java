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
}
