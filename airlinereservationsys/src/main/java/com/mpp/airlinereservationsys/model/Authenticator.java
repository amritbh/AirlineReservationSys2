package com.mpp.airlinereservationsys.model;

public interface Authenticator {

    default void authorize(String username, String password,RoleType roleType)
    {
        if(username.toLowerCase()!="admin" || password!="letmein")
        {
            throw new RuntimeException("Invalid user.");
        } else {
            System.out.println("Successfully Login !!!!");
        }

    }
}
