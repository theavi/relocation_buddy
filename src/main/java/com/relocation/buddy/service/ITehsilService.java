package com.relocation.buddy.service;

import com.relocation.buddy.dto.TehsilDto;

import java.util.List;

public interface ITehsilService {
    public TehsilDto create(TehsilDto dto);
    public List<TehsilDto> list();


}
