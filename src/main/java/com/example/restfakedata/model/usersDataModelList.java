package com.example.restfakedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class usersDataModelList {
    private List<userDataModel> usersDataModelList;

    public void UsersList() {
        usersDataModelList = new ArrayList<>();
    }
}
