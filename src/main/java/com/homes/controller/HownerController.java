package com.homes.controller;

import com.homes.payload.HownerDto;
import com.homes.service.HownerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/howner")
public class HownerController {

    private HownerService hownerService;

    public HownerController(HownerService hownerService) {
        this.hownerService = hownerService;
    }
    @PostMapping
    public ResponseEntity<String> createHowner(@RequestBody HownerDto hownerDto){
        hownerService.createHowner(hownerDto);
        return new ResponseEntity<>("post is created", HttpStatus.CREATED);
    }
}
