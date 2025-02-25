package com.relocation.buddy.service;

import com.relocation.buddy.dto.DistrictDto;

import java.util.List;

public interface IDistrictService {
    public String createDistrict(DistrictDto dto);

    public List<DistrictDto> list();
}
