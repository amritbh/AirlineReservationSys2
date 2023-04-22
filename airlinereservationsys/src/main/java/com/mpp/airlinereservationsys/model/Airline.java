package com.mpp.airlinereservationsys.model;

import com.mpp.airlinereservationsys.utility.Validator;

public class Airline extends Validator {
    private String airlineID;
    private String airlineName;

    public Airline() {
        this.airlineID = "";
        this.airlineName = "";
    }

    public Airline(String airlineID, String name) throws Exception {
        airlineValidator(airlineID,name);
        this.setAirlineID(airlineID);
        this.setAirlineName(name);

    }

    public void setAirlineID(String airlineID) {
            this.airlineID = airlineID;
    }

    public void setAirlineName(String airlineName) {
            this.airlineName = airlineName;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public String getAirlineName() {
        return airlineName;
    }

    @Override
    public String toString() {
        return this.getAirlineID() + "," + this.getAirlineName();
    }

}
