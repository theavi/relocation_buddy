package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ITehsilDao;
import com.relocation.buddy.dto.TehsilDto;
import com.relocation.buddy.entity.Tehsil;
import com.relocation.buddy.mapper.TehsilMapper;
import com.relocation.buddy.service.ITehsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TehsilServiceImpl implements ITehsilService {
    @Autowired
    private ITehsilDao iTehsilDao;

    @Override
    public TehsilDto create(TehsilDto dto) {
        System.out.println("im in service");
        Tehsil tehsil = TehsilMapper.toEntity(dto);
        Tehsil saveTehsil = iTehsilDao.create(tehsil);
        TehsilDto tehsilDto = TehsilMapper.toDto(saveTehsil);
        return tehsilDto;
    }
}
