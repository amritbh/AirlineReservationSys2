package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

public class Passenger extends Validator {
    private Identity name;
    private Address address;
    private String telephoneNumber;

    public Passenger(Identity name, Address address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public Passenger(String text) {
        super();
    }

    public void setName(Identity name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Identity getName() {
        return this.name;
    }

    public Address getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + name +
                ", address=" + address +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}