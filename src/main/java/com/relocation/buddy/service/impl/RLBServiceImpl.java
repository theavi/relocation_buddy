package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IServiceDao;
import com.relocation.buddy.dto.ServiceDto;
import com.relocation.buddy.entity.RLBService;
import com.relocation.buddy.mapper.ServiceMapper;
import com.relocation.buddy.service.IRLBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RLBServiceImpl implements IRLBService {
@Autowired
private IServiceDao iServiceDao;

@Override
    public String createService(ServiceDto dto){
    System.out.println("Create RLBService service called");
   RLBService service= ServiceMapper.ToEntity(dto);
   return iServiceDao.save(service);

    }
}
