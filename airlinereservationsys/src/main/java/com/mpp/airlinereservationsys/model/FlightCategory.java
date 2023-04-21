package com.mpp.airlinereservationsys.model;

public class FlightCategory {
    private SeatType seatType;

    //constructor 01
    public FlightCategory() {
        this.seatType = null;
    }

    //constructor 02
    public FlightCategory(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setSeatClass(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatType getSeatClass() {
        return seatType;
    }

    @Override
    public String toString() {
        return "Seat Type: " + seatType ;
    }

}
