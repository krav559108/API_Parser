package com.example.restfakedata.service;

import com.example.restfakedata.model.usersModel;

import java.util.List;


public interface IFakeApiClient {
     usersModel GetUser(Long id);
     List<usersModel> GetAllUsers();
}
