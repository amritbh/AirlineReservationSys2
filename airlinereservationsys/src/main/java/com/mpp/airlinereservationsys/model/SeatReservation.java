package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

import java.time.LocalDate;
import java.util.Arrays;

public class SeatReservation extends Validator {

        private int reservationNumber;
        private int numberOfPassengers;
        private Passenger[] passengers;
        private String flightNumber;
        private String departureDate;
        private Seat[] reservedSeats;



        public SeatReservation(int reservationNumber, int numberOfPassengers, Passenger[] passengers, String flightNumber, String departureDate, Seat[] reservedSeats) {
            this.reservationNumber = reservationNumber;
            this.numberOfPassengers = numberOfPassengers;
            this.passengers = passengers;
            this.flightNumber = flightNumber;
            this.departureDate = departureDate;
            this.reservedSeats = reservedSeats;
        }

        public void setReservationNumber(int reservationNumber) {
            this.reservationNumber = reservationNumber;
        }

        public void setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        }

        public void setPassengers(Passenger[] passengers) {
            this.passengers = passengers;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public void setDepartureDate(int year, int month, int day) {
            this.departureDate= String.valueOf(LocalDate.of(year,month,day));
        }

        public void setReservedSeats(Seat[] reservedSeats) {
            this.reservedSeats = reservedSeats;
        }

        public int getReservationNumber() {
            return reservationNumber;
        }

        public int getNumberOfPassengers() {
            return numberOfPassengers;
        }

        public void getPassengers() {

            for (int i = 0; i < passengers.length; i++) {
                System.out.println(passengers[i]);
            }

        }

        public Passenger[] getPassengersArray() {

            return passengers;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getDepartureDate() {
            return departureDate;
        }

        public String[] getReservedSeats() {
            String[] reservedSeatID = new String[this.getNumberOfPassengers()];
            for (int i = 0; i < reservedSeatID.length; i++) {
               reservedSeatID[i] = reservedSeats[i].getSeatID();
            }
            return reservedSeatID;
        }


    @Override
    public String toString() {
        return "SeatReservation{" +
                "Reservation Number : " + reservationNumber + "\n"+
                "Passengers : " + numberOfPassengers + "\n"+
                "Passengers : " + Arrays.toString(passengers) + "\n"+
                " Flight Number : " + flightNumber  + "\n"+
                " Departure Date : " + departureDate + "\n"+
                " Reserved Seats : " + Arrays.toString(reservedSeats) + "\n"+
                '}';
    }
}


