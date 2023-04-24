package com.mpp.airlinereservationsys.model;

public enum RoleType {
    ADMIN("Admin"),
    PASSENGER("Passenger");

    private String val;

    RoleType(String val) {
        this.val = val;
    }

    public String getValue() {
        return val;
    }
}
