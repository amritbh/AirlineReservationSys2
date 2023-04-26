package com.mpp.airlinereservationsys.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlightReservation extends JFrame implements ActionListener {

    private JTextField flightNumberField, departureDateField, departureAirportField, departureTimeField, arrivalTimeField;
    private JButton saveButton,backButton;
    private HashMap<String, String> reservationMap;

    public FlightReservation() {
        super("Flight Reservation ");

        reservationMap = new HashMap<>();

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel flightNumberLabel = new JLabel("Flight Number:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(flightNumberLabel, gbc);

        flightNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(flightNumberField, gbc);

        JLabel departureDateLabel = new JLabel("Departure Date:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(departureDateLabel, gbc);

        departureDateField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(departureDateField, gbc);

        JLabel departureAirportLabel = new JLabel("Departure Airport:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(departureAirportLabel, gbc);

        departureAirportField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(departureAirportField, gbc);

        JLabel departureTimeLabel = new JLabel("Departure Time:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(departureTimeLabel, gbc);

        departureTimeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(departureTimeField, gbc);

        JLabel arrivalTimeLabel = new JLabel("Arrival Time:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(arrivalTimeLabel, gbc);

        arrivalTimeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(arrivalTimeField, gbc);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(saveButton, gbc);
        panel.setBackground(new Color(240, 248, 255));

        backButton = new JButton("Back");
        backButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(backButton, gbc);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400, 250));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            if(flightNumberField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Flight no. required.");
            }
            if(departureDateField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Departure date is required.");
            }
            else {
                reservationMap.put("Flight Number", flightNumberField.getText());
                reservationMap.put("Departure Date", departureDateField.getText());
                reservationMap.put("Departure Airport", departureAirportField.getText());
                reservationMap.put("Departure Time", departureTimeField.getText());
                reservationMap.put("Arrival Time", arrivalTimeField.getText());

                JOptionPane.showMessageDialog(this, "Reservation saved successfully");
            }
        }
        if (e.getSource() == backButton) {
            disposeWindow(); // close the AboutForm
            Home home = new Home();
            home.show(); // show the Home page
        }

    }
    public void  disposeWindow()
    {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window.isVisible()) {
                window.dispose();
            }
        }
    }
    public static void main(String[] args) {
        new FlightReservation();
    }
}
