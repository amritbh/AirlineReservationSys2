package com.mpp.airlinereservationsys.model;


import com.mpp.airlinereservationsys.utility.Validator;

public class Seat extends Validator {
    private String seatID;
    private boolean status;

    public Seat(String seatID, boolean status) {
        this.seatID = seatID;
        this.status = status;

    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSeatID() {
        return seatID;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatID='" + seatID + '\'' +
                ", status=" + status +
                '}';
    }
}
