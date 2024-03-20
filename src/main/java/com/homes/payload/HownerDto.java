package com.homes.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HownerDto {
    private long planId;
    private String planName;
    private Double price;

    private boolean reationshipManager;

    private boolean rentalAgreement;

    private int planValidity;
}
