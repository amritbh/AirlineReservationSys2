package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LayoutForm extends JFrame{

    public LayoutForm() {
        // Set window properties
        setTitle("MIU Airlines");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu with two items
        JMenu fileMenu = new JMenu("Flight");
        JMenuItem openMenuItem = new JMenuItem("Reservation");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator(); // Add separator between items
        fileMenu.add(exitMenuItem);

        // Create "Edit" menu with one item
        JMenu editMenu = new JMenu("Report");
        JMenuItem copyMenuItem = new JMenuItem("Open");
        editMenu.add(copyMenuItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            FlightReservation flightReservation = new FlightReservation();
            }
        });

        // Show the window
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutForm();
    }

}
