package com.homes.service.impl;

import com.homes.entity.Howner;
import com.homes.payload.HownerDto;
import com.homes.repository.HownerRepository;
import com.homes.service.HownerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HownerServiceImpl implements HownerService {


    private HownerRepository hownerRepository;


    private ModelMapper modelMapper;

    public HownerServiceImpl(HownerRepository hownerRepository, ModelMapper modelMapper) {
        this.hownerRepository = hownerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createHowner(HownerDto hownerDto) {
        Howner howner = mapToEntity(hownerDto);
        Howner save = hownerRepository.save(howner);
        mapToDto(save);

    }

    HownerDto mapToDto(Howner howner) {
        HownerDto dtoMap = modelMapper.map(howner, HownerDto.class);
        return dtoMap;
    }

    Howner  mapToEntity(HownerDto hownerDto) {
        Howner map = modelMapper.map(hownerDto, Howner.class);
        return map;
    }
}
