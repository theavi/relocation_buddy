package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.ServiceDto;
import com.relocation.buddy.entity.RLBService;

import java.util.Date;

public class ServiceMapper {
    public static RLBService ToEntity(ServiceDto dto){
        RLBService service=new RLBService();
        service.setName(dto.getName());
        service.setDescription(dto.getDescription());
        service.setCreatedBy(1);
        service.setCreatedDate(new Date());
        return service;
    }
    public static ServiceDto toDto(RLBService entity){
        ServiceDto dto=new ServiceDto();
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }
}
