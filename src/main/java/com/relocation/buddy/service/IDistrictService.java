package com.relocation.buddy.service;

import com.relocation.buddy.dto.DistrictDto;

import java.util.List;

public interface IDistrictService {
    public abstract String createDistrict(DistrictDto dto);

    public abstract List<DistrictDto> list();

    public abstract void delete(Integer id);

    public abstract DistrictDto update(DistrictDto dto);
}
