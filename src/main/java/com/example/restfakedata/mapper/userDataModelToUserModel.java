package com.example.restfakedata.mapper;

import com.example.restfakedata.model.userDataModel;
import com.example.restfakedata.model.usersModel;


public class userDataModelToUserModel  {
    public static usersModel dtoToEntity(userDataModel userDataModel) {
        usersModel user = new usersModel();
        user.setLat(userDataModel.getAddress().getGeo().getLat());
        user.setLng(userDataModel.getAddress().getGeo().getLng());

        user.setStreet(userDataModel.getAddress().getStreet());
        user.setSuite(userDataModel.getAddress().getSuite());
        user.setCity(userDataModel.getAddress().getCity());
        user.setZipcode(userDataModel.getAddress().getZipcode());

        user.setCompanyName(userDataModel.getCompany().getName());
        user.setCompanyCatchPhrase(userDataModel.getCompany().getCatchPhrase());
        user.setCompanyBs(userDataModel.getCompany().getBs());

        user.setId(userDataModel.getId());
        user.setName(userDataModel.getName());
        user.setUsername(userDataModel.getUsername());
        user.setEmail(userDataModel.getEmail());
        user.setPhone(userDataModel.getPhone());
        user.setWebsite(userDataModel.getWebsite());
        return user;
    }
}
