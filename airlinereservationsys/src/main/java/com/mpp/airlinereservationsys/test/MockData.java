package com.mpp.airlinereservationsys.test;

import com.mpp.airlinereservationsys.model.Address;
import com.mpp.airlinereservationsys.model.Identity;
import com.mpp.airlinereservationsys.model.Passenger;

import java.awt.*;
import java.util.ArrayList;
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
}
