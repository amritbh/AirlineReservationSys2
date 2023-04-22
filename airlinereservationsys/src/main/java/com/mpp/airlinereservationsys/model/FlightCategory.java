package com.mpp.airlinereservationsys.model;

public class FlightCategory {
    private SeatType seatType;

    public FlightCategory() {
        this.seatType = null;
    }

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
