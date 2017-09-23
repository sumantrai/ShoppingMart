package com.shoppingmart.entities;
 
import java.io.Serializable;
 
public enum UserProfileType implements Serializable{
    USER("USER"),
    DBA("MANAGER"),
    ADMIN("ADMIN");
     
    String userProfileType;
     
    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }
     
    public String getUserProfileType(){
        return userProfileType;
    }
     
}