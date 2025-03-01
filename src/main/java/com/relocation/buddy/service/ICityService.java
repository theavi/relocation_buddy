package com.relocation.buddy.service;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.dto.UserDto;

import java.util.List;

public interface ICityService {
    public String createCity(CityDto dto);
    public List<CityDto> list();

}
