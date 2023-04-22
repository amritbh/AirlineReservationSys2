package com.mpp.airlinereservationsys.utility;


import com.mpp.airlinereservationsys.model.RoleType;

import java.util.HashMap;
import java.util.Map;

public  class Validator extends ValidatorForInputField {
    public static void addressValidator(String street, String city) throws Exception {
        Map<String, String> fields = new HashMap<>();
        fields.put("Street",street);
        fields.put("City",city);
        validateInputFields(fields,10,false);
    }
    public static void airlineValidator(String airlineID, String name) throws  Exception
    {
        Map<String, String> fields = new HashMap<>();
        fields.put("Airline Id",airlineID);
        fields.put("Name",name);
        validateInputFields(fields,10,false);
    }
    public static void airportValidator(String airportID, String city, String country) throws  Exception
    {
        Map<String, String> fields = new HashMap<>();
        fields.put("Airport Id",airportID);
        fields.put("City",city);
        fields.put("Country",country);
        validateInputFields(fields,10,false);

    }
    public static void flightValidator(String flightNumber, int day, int month, int year, String departureAirport, String destinationAirport, String departureTime, String arrivalTime) throws Exception {
        Map<String, String> fields = new HashMap<>();
        fields.put("Flight Number",flightNumber);
        fields.put("Departure Airport",departureAirport);
        fields.put("Departure Time",departureTime);
        fields.put("Destination Airport",destinationAirport);
        fields.put("Arrival Time",arrivalTime);
        validateInputFields(fields,10,false);
    }
    public static void identityValidator(String firstName, String lastName) throws Exception {
        Map<String, String> fields = new HashMap<>();
        fields.put("First Name",firstName);
        fields.put("Last Name",lastName);
        validateInputFields(fields,10,false);
    }
    public static void loginValidator(String userName, String password, RoleType role) throws Exception {
        Map<String,String> fields= new HashMap<>();
        fields.put("User Name",userName);
        fields.put("Password",password);
        validateInputFields(fields,10,false);


    }
}
