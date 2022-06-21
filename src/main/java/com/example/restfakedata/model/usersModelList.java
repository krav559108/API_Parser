package com.example.restfakedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class usersModelList {
    private List<usersModel> usersModelList;
    public void UsersList() {
        usersModelList = new ArrayList<>();
    }
}
