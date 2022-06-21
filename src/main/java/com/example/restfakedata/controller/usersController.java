package com.example.restfakedata.controller;

import com.example.restfakedata.model.usersModel;
import com.example.restfakedata.service.FakeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class usersController {

    @Autowired
    FakeApiClient service;

    @GetMapping("/api/user/{id}")
    usersModel GetUser(@PathVariable Long id){
        return service.GetUser(id);
    }

    @GetMapping("/api/users")
    List<usersModel> GetAllUsers() {return service.GetAllUsers();}
}
