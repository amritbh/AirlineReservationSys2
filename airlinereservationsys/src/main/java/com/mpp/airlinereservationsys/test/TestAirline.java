package com.mpp.airlinereservationsys.test;


import com.mpp.airlinereservationsys.model.Airline;

public class TestAirline {

   public  static  void main(String[] args) throws Exception {
        Airline airline= new Airline("","TIA");
        System.out.println(airline.toString());
    }
}
