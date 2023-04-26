package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

public class Address extends Validator {
    private String street;
    private String city;
    public Address(String street, String city) throws Exception {
        addressValidator(street,city);
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getFullAddress()
    {
        return getStreet() + " " + getCity();
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}
