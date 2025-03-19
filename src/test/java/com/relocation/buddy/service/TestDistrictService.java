package com.relocation.buddy.service;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.mapper.DistrictMapper;
import com.relocation.buddy.service.impl.DistrictServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestDistrictService {

    @Mock
    private IDistrictDao iDistrictDao;

    @Mock
    private DistrictMapper districtMapper;

    @InjectMocks
    private DistrictServiceImpl districtService;

    @Test
    public void testDistrictList() {
        //Given
        List<DistrictDto> list = Arrays.asList(new DistrictDto(1, "Palghar"), new DistrictDto(2, "Panvel"));
        List<District> entities = Arrays.asList(new District(1, "Palghar"), new District(2, "Panvel"));

        //When
        BDDMockito.when(iDistrictDao.list()).thenReturn(entities);
        BDDMockito.when(districtMapper.toDto(new District(1, "Palghar"))).thenReturn(new DistrictDto(1, "palghar"));
        List<DistrictDto> result = districtService.list();
        //Then
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2,result.size());
    }

}
