package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
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

    @Override
    public String createDistrict(DistrictDto dto) {
        System.out.println("Create District Service Called");
        District district = DistrictMapper.ToEntity(dto);
        return districtdao.save(district);
    }

    @Override
    public List<DistrictDto> list() {
        List<District> list= districtdao.list();
        List<DistrictDto> listDto=new ArrayList<>();
        for (District district:list){
            listDto.add(DistrictMapper.toDto(district));
        }
        return listDto;
    }

    @Override
    public void delete(Integer id) {
        districtdao.delete(id);
    }
}