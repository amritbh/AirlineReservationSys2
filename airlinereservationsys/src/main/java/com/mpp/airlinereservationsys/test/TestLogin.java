package com.mpp.airlinereservationsys.test;

import com.mpp.airlinereservationsys.model.Login;
import com.mpp.airlinereservationsys.model.RoleType;

public class TestLogin {
    public  static  void main(String[] args)
    {
        Login login=new Login("admin","letmein", RoleType.ADMIN);
        Login login1=new Login("pawan","letmein", RoleType.ADMIN);
    }
}
