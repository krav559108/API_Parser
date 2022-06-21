package com.example.restfakedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userDataModel {
    @Id
    private Long id;
    private String name;
    private String username;
    private String email;
    private AddressModel address;
    private String phone;
    private String website;
    private CompanyModel company;
}
