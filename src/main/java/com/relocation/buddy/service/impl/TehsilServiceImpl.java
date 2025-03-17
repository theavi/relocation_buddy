package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ITehsilDao;
import com.relocation.buddy.dto.TehsilDto;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.entity.Tehsil;
import com.relocation.buddy.exception.RecordNotFoundException;
import com.relocation.buddy.mapper.DistrictMapper;
import com.relocation.buddy.mapper.TehsilMapper;
import com.relocation.buddy.service.ITehsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public List<TehsilDto> list() {
        List<TehsilDto> listDto=new ArrayList<>();
        List<Tehsil> list=iTehsilDao.list();
        for (Tehsil tehsil:list){
            TehsilDto dto=TehsilMapper.toDto(tehsil);
            listDto.add(dto);
        }
        return listDto;
    }

    @Override
    public void delete(Integer id) {
        iTehsilDao.delete(id);
    }

    @Override
    public TehsilDto update(TehsilDto dto) {

        Tehsil isExist = iTehsilDao.findById(dto.getId());
        if (null == isExist) {
            throw new RecordNotFoundException("Tehsil not found with ID : " + dto.getId());
        }
        Tehsil entity = TehsilMapper.toEntity(dto);
        entity.setModifiedDate(new Date());
        entity.setModifiedBy(1);
        return TehsilMapper.toDto(iTehsilDao.update(entity));
    }

}
