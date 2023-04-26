package com.mpp.airlinereservationsys.test;

import com.mpp.airlinereservationsys.model.*;

public class TestSeatReservation {
    public static void main(String[] args) throws Exception {

        Seat seat1 = new Seat("A1", true);
        Seat seat2 = new Seat("A2", true);


        Identity identity1 = new Identity("Avinash  ","Ghimire");
        Address address1 = new Address("1000N 4th Street", "Fairfield");
        Passenger passenger1 = new Passenger(identity1, address1, "689741546");

        Identity identity = new Identity("Sayal","Aryal");
        Address address2 = new Address("200N 8th Street", "Apple");
        Passenger passenger2 = new Passenger(identity, address2, "0654654564");


        Passenger[] passengers =  {passenger1, passenger2};
        Seat[] reservedSeats1 = {seat1, seat2};
        SeatReservation reservation1 = new SeatReservation(6, 2, passengers, "ML654", "28 dec 2016", reservedSeats1);
        System.out.println(reservation1);


    }

}
