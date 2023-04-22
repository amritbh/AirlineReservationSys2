package com.mpp.airlinereservationsys.test;


import com.mpp.airlinereservationsys.model.Address;

public class TestAddress {
    public  static  void main(String[] args) throws Exception {
        Address address= new Address("","Fairfield");
        System.out.println("The address is:  " + address.toString());
    }
}
