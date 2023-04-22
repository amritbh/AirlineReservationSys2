package com.mpp.airlinereservationsys.model;

public final class Login implements Authenticator {
    private final String username;
    private final String password;
    private RoleType roleType;


    public Login( String username, String password,RoleType roleType)
    {
        authorize(username,password,roleType);
        this.username=username;
        this.password=password;
        this.roleType=roleType;
    }
}
