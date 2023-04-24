package com.mpp.airlinereservationsys.view;


import com.mpp.airlinereservationsys.model.Passenger;
import com.mpp.airlinereservationsys.model.Seat;
import com.mpp.airlinereservationsys.model.SeatReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SeatReservationForm extends JFrame implements ActionListener {

    private JTextField flightNumberField, departureDateField, numberOfSeatsField;
    private JButton saveButton, submitButton;
    private JComboBox<String> flightNumberComboBox;
    private HashMap<String, String> reservationMap;
    private Passenger[] passengers;
    private int reservationNumber = 1;

    public SeatReservationForm() {
        super("Seat Reservation Form");

        reservationMap = new HashMap<>();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel flightNumberLabel = new JLabel("Flight Number:");
        panel.add(flightNumberLabel);

        flightNumberComboBox = new JComboBox<String>(new String[]{"Flight 1", "Flight 2", "Flight 3", "Flight 4", "Flight 5"});
        panel.add(flightNumberComboBox);

        JLabel departureDateLabel = new JLabel("Departure Date:");
        panel.add(departureDateLabel);

        departureDateField = new JTextField(20);
        panel.add(departureDateField);

        JLabel numberOfSeatsLabel = new JLabel("Number of Seats:");
        panel.add(numberOfSeatsLabel);

        numberOfSeatsField = new JTextField(20);
        panel.add(numberOfSeatsField);

        JLabel passengerNameLabel = new JLabel("Passenger Name:");
        panel.add(passengerNameLabel);

        JTextField passengerNameField = new JTextField(20);
        panel.add(passengerNameField);

        saveButton = new JButton("Add Passenger");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numSeats = Integer.parseInt(numberOfSeatsField.getText());
                if (passengers == null) {
                    passengers = new Passenger[numSeats];
                }

                for (int i = 0; i < numSeats; i++) {
                    if (passengers[i] == null) {
                        passengers[i] = new Passenger(passengerNameField.getText());
                        JOptionPane.showMessageDialog(SeatReservationForm.this, "Passenger added successfully");
                        passengerNameField.setText("");
                        break;
                    }
                }
            }
        });
        panel.add(saveButton);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNumber = (String) flightNumberComboBox.getSelectedItem();
                String departureDate = departureDateField.getText();
                int numberOfPassengers = passengers.length;
                Seat[] reservedSeats = new Seat[numberOfPassengers];

                for (int i = 0; i < numberOfPassengers; i++) {
                    reservedSeats[i] = new Seat("Economy", true);
                }

//                SeatReservation reservation = new SeatReservation(flightNumber, departureDate, numberOfPassengers, passengers, reservedSeats);
//                reservationMap.put(reservation.getReservationNumber() + "", reservation.toString());

                JOptionPane.showMessageDialog(SeatReservationForm.this, "Reservation saved successfully");
                flightNumberComboBox.setSelectedIndex(0);
                departureDateField.setText("");
                numberOfSeatsField.setText("");
                passengerNameField.setText("");
                passengers = null;
            }
        });
        panel.add(submitButton);

        add(panel);
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new SeatReservationForm();
    }
}
