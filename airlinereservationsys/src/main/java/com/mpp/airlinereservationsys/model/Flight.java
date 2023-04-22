package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight extends Validator {
    private String flightNumber;
    private String departureDate;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
     private FlightCategory [] sections;

    public Flight(String flightNumber, int day, int month, int year, String departureAirport, String destinationAirport, String departureTime, String arrivalTime) {
        String airlineID = flightNumber.substring(0,2);
        String number = flightNumber.substring(2);
        this.setFlightNumber(airlineID, number);
        setDepartureDate(day, month, year);
        this.departureAirport = departureAirport.toUpperCase();
        this.destinationAirport = destinationAirport.toUpperCase();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.sections = sections;
    }


    public void setFlightNumber(String airlineID, String number) {
        this.flightNumber=airlineID+number;
    }

    public void setDepartureDate(int day, int month, int year) {
        this.departureDate= String.valueOf(LocalDate.of(year,month,day));
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport.toUpperCase();
    }

    public void setDestinationAirport(String destinationAirport) {

        this.destinationAirport = destinationAirport.toUpperCase();

    }

    public void setDepartureTime(int day, int month, int year,int hour, int minute) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
        this.departureTime=String.valueOf(simpleDateFormat.format(LocalDateTime.of(day,month,year,hour,minute)));
    }

    public void setArrivalTime(int day, int month, int year,int hour, int minute) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
        this.arrivalTime=simpleDateFormat.format(LocalDateTime.of(year,month,day,hour,minute));
    }

    /*public void setSections(FlightSection[] sections) {
        this.sections = sections;
    }*/     //erase

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

     /*public FlightSection[] getSections() {
        return sections;
    }*/

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}
