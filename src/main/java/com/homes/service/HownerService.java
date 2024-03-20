package com.homes.service;

import com.homes.payload.HownerDto;
import org.springframework.http.ResponseEntity;

public interface HownerService {

    public void createHowner(HownerDto hownerDto);
}
