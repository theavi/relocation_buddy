package com.relocation.buddy.service;

import com.relocation.buddy.dto.CityDto;

import java.util.List;

public interface ICityService {
    public abstract String createCity(CityDto dto);

    public abstract List<CityDto> list();

    public abstract void delete(Integer id);
}
