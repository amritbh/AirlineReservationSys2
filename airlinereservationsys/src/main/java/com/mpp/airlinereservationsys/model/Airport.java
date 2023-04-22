package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

public class Airport extends Validator {

        private String airportID;
        private String city;
        private String country;


        public Airport() {

            this.airportID = String.valueOf(toString().isEmpty());
            this.city = String.valueOf(toString().isEmpty());
            this.country =String.valueOf(toString().isEmpty());
        }

        public Airport(String airportID, String city, String country) throws Exception {

            airportValidator(airportID,city,country);
            this.setAirportID(airportID);
            this.setCity(city);
            this.setCountry(country);
        }


        public void setAirportID(String airportID) {
                this.airportID = airportID.toUpperCase();
        }

        public void setCity(String city) {
                this.city = city;

        }

        public void setCountry(String country) {
          this.country=country;
        }

        public String getAirportID() {
            return airportID;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

    @Override
    public String toString() {
        return "Airport{" +
                "airportID='" + airportID + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

