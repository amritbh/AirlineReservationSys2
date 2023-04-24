package com.mpp.airlinereservationsys.test;

import com.mpp.airlinereservationsys.model.Address;
import com.mpp.airlinereservationsys.model.Flight;
import com.mpp.airlinereservationsys.model.Identity;
import com.mpp.airlinereservationsys.model.Passenger;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<Passenger> getPassengerList() throws Exception {
        List<Passenger> passengerList = new ArrayList<>();

        Identity identity1 = new Identity("Avinash", "Ghimire");
        Address address1 = new Address("1000 N 4th Street", "Fairfield");
        Passenger passenger1 = new Passenger(identity1, address1, "9843005650");
        passengerList.add(passenger1);

        Identity identity2 = new Identity("John", "Doe");
        Address address2 = new Address("123 Main Street", "Anytown");
        Passenger passenger2 = new Passenger(identity2, address2, "555-1234");
        passengerList.add(passenger2);

        Identity identity3 = new Identity("Jane", "Smith");
        Address address3 = new Address("456 Elm Street", "Another Town");
        Passenger passenger3 = new Passenger(identity3, address3, "555-5678");
        passengerList.add(passenger3);
        return passengerList;


    }
    public static  List<Flight> getFlightMockData() throws  Exception
    {
        Flight flight1 = new Flight("FN01", 1,12, 2023, "TIA", "TEXAS","11:23","12:23");
        Flight flight2 = new Flight("FN02", 2,12, 2023, "JFK", "LAX","08:45","13:00");
        Flight flight3 = new Flight("FN03", 3,12, 2023, "ORD", "ATL","15:30","19:20");
        Flight flight4 = new Flight("FN04", 4,12, 2023, "LGA", "SFO","10:15","14:45");
        Flight flight5 = new Flight("FN05", 5,12, 2023, "DFW", "MIA","06:20","09:40");
        Flight flight6 = new Flight("FN06", 6,12, 2023, "LAS", "PHL","14:00","22:10");
        Flight flight7 = new Flight("FN07", 7,12, 2023, "SJC", "SEA","12:00","14:30");
        Flight flight8 = new Flight("FN08", 8,12, 2023, "BOS", "MCO","07:30","11:00");
        Flight flight9 = new Flight("FN09", 9,12, 2023, "IAH", "DEN","16:45","19:15");
        Flight flight10 = new Flight("FN10", 10,12, 2023, "PDX", "SJC","13:20","15:00");

        List<Flight> flights= Arrays.asList(flight1,flight2,flight3,flight4,flight5,flight6,flight7,flight8,flight9,flight10);
        return  flights;
    }
}
