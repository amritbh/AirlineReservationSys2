package com.mpp.airlinereservationsys.test;


import com.mpp.airlinereservationsys.model.Flight;

public class TestFlight {
    public static void  main(String[] args)
    {
        Flight flight = new Flight("FN01", 1,12, 2023, "TIA", "TEXAS","11:23","12:23");
        System.out.println(flight);

    }
}
