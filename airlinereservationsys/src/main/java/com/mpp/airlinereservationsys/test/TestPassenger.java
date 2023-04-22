package com.mpp.airlinereservationsys.test;

import com.mpp.airlinereservationsys.model.Address;
import com.mpp.airlinereservationsys.model.Identity;
import com.mpp.airlinereservationsys.model.Passenger;

public class TestPassenger {
    public  static  void main(String[] args) throws Exception {
        Identity identity=new Identity("Avinash","Ghimire");
        Address address = new Address("1000 N 4th Street","Fairfield");
        Passenger passenger= new Passenger(identity,address,"9843005650");
        System.out.println("Passenger:  " + passenger);
    }
}
