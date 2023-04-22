package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightReservation extends JFrame {
    private JTextField flightNumber;
    private JButton submitButton;
    private JTextField departureDate;
    private JTextField departureAirport;
    private JTextField destinationAirport;
    private JTextField departureTime;
    private JTextField arrivalTime;
    private JLabel flightNumberLabel;
    private JLabel departureDateLabel;
    private JLabel departureAirportLabel;
    private JLabel destinationAirportLabel;
    private JLabel departureTimeLabel;
    private JLabel arrivalTimeLabel;
    private JPanel jPanel1;

    public FlightReservation() {
    initComponents();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flightNumber.getText().length()==0 ||
                    departureDate.getText().length() == 0 ||
                departureAirport.getText().length() == 0 ||
                        destinationAirport.getText().length()== 0 ||
                        departureTime.getText().length() == 0 ||
                        arrivalTime.getText().length() == 0
                ){
                    JOptionPane.showMessageDialog(null, "Input all the details");
                } else {

                    new LayoutForm();
                }

            }
        });
    }

    private void initComponents(){
        jPanel1 = new JPanel();
        flightNumber = new JTextField(3);
        departureDate = new JTextField(3);
        departureAirport = new JTextField(3);
        destinationAirport = new JTextField(3);
        departureTime = new JTextField(3);
        arrivalTime = new JTextField(3);
        flightNumberLabel = new JLabel("Flight Number");
        departureDateLabel = new JLabel("Departure Date");
        departureAirportLabel = new JLabel("Departure Airport");
        destinationAirportLabel = new JLabel("Destination Airport");
        departureTimeLabel =new JLabel("Departure Time");
        arrivalTimeLabel = new JLabel("Arrival Time");
        submitButton = new JButton("Submit");

        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(flightNumberLabel, constraints);

        // Define the constraints for the first text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(flightNumber, constraints);

        // Define the constraints for the second label
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(departureDateLabel, constraints);

        // Define the constraints for the second text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(departureDate, constraints);

//        // Define the constraints for the third label
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(departureAirportLabel, constraints);

        // Define the constraints for the third text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(departureAirport, constraints);

        // Define the constraints for the fourth label
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(destinationAirportLabel, constraints);

        // Define the constraints for the fourth text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(destinationAirport, constraints);

        // Define the constraints for the fifth label
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(departureTimeLabel, constraints);

        // Define the constraints for the fifth text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(departureTime, constraints);

        // Define the constraints for the sixth label
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 200, 5, 0); // add some padding
        add(arrivalTimeLabel, constraints);

        // Define the constraints for the sixth text field
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        add(arrivalTime, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 20, 5, 400); // add some padding
        constraints.gridwidth = 2; // set gridwidth to 2
        add(submitButton, constraints);


        setLocationRelativeTo(null);

        setTitle("Flight Reservation form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);




    }

    public static void main(String[] args){
        new FlightReservation();
    }
}
