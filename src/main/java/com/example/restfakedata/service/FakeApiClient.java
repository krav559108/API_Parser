package com.example.restfakedata.service;

import com.example.restfakedata.mapper.userDataModelToUserModel;
import com.example.restfakedata.model.usersDataModelList;
import com.example.restfakedata.model.userDataModel;
import com.example.restfakedata.model.usersModel;
import com.example.restfakedata.model.usersModelList;
import com.example.restfakedata.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FakeApiClient implements IFakeApiClient{
    @Autowired
    private usersRepository repository;

    @Override
    public usersModel GetUser(Long id){
        RestTemplate restTemplate = new RestTemplate();
        userDataModel userResponse = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+id, userDataModel.class);
        usersModel user = userDataModelToUserModel.dtoToEntity(userResponse);
        return repository.save(user);
    }

    @Override
    public List<usersModel> GetAllUsers(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<userDataModel[]> userResponse = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users/", userDataModel[].class);

        List<usersModel> userList = new ArrayList<usersModel>();
        userDataModel[] userDatalist = userResponse.getBody();

        for(int i = 0; i < Arrays.stream(userDatalist).count(); i++){
            userList.add(userDataModelToUserModel.dtoToEntity(userDatalist[i]));
            System.out.println(userList);
        }

        return repository.saveAll(userList);
    }
}