package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.exception.RecordNotFoundException;
import com.relocation.buddy.mapper.DistrictMapper;
import com.relocation.buddy.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictServiceImpl implements IDistrictService {
    @Autowired
    private IDistrictDao districtdao;

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public String createDistrict(DistrictDto dto) {
        System.out.println("Create District Service Called");
        District district = districtMapper.toEntity(dto);
        return districtdao.save(district);
    }

    @Override
    public List<DistrictDto> list() {
        List<District> list = districtdao.list();
        List<DistrictDto> listDto = new ArrayList<>();
        for (District district : list) {
            listDto.add(districtMapper.toDto(district));
        }
        return listDto;
    }

    @Override
    public void delete(Integer id) {
        districtdao.delete(id);
    }

    @Override
    public DistrictDto update(DistrictDto dto) {
        throw new RecordNotFoundException("District not found with ID : " + dto.getId());
      /*District isExist = districtdao.findById(dto.getId());
        if (null == isExist) {
            throw new RecordNotFoundException("District not found with ID : " + dto.getId());
        }
        District entity = DistrictMapper.toEntity(dto);
        entity.setModifiedDate(new Date());
        entity.setModifiedBy(1);
        return DistrictMapper.toDto(districtdao.update(entity));*/
    }
}