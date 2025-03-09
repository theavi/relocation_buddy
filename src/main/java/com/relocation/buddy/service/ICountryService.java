package com.relocation.buddy.service;

import com.relocation.buddy.dto.CountryDto;

import java.util.List;

public interface ICountryService {
    public String createCountry(CountryDto dto);

    public List<CountryDto> list();
}
