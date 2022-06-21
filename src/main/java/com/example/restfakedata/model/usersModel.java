package com.example.restfakedata.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dbprofile", schema = "public")
public class usersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column (name = "name")
    private String name;
    @Basic
    @Column (name = "username")
    private String username;
    @Basic
    @Column (name = "email")
    private String email;
    @Basic
    @Column (name = "street")
    private String street;
    @Basic
    @Column (name = "suite")
    private String suite;
    @Basic
    @Column (name = "city")
    private String city;
    @Basic
    @Column (name = "zipcode")
    private String zipcode;
    @Basic
    @Column (name = "lat")
    private String lat;
    @Basic
    @Column (name = "lng")
    private String lng;
    @Basic
    @Column (name = "phone")
    private String phone;
    @Basic
    @Column (name = "website")
    private String website;
    @Basic
    @Column (name = "company_name")
    private String CompanyName;
    @Basic
    @Column (name = "company_catch_phrase")
    private String CompanyCatchPhrase;
    @Basic
    @Column (name = "company_bs")
    private String CompanyBs;
}