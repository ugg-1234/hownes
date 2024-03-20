package com.homes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "howner")
public class Howner {
    @Id

    private long planId;
    private String planName;
    private Double price;

    private boolean reationshipManager;

    private boolean rentalAgreement;

    private int planValidity;
}
