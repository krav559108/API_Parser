package com.example.restfakedata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private geoModel geo;
}
