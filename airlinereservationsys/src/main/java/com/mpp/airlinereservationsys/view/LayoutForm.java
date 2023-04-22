package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutForm extends JFrame {
    private JDesktopPane jDesktopPane;
    public LayoutForm() {
        // Set window properties
        setTitle("MIU Airlines");
        setSize(800, 600); // increased size for demonstration purposes
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Flight");

        JMenuItem openMenuItem = new JMenuItem("Reservation");
        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FlightReservation reservationForm = new FlightReservation();

            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.addSeparator();
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator(); // Add separator between items
        fileMenu.add(exitMenuItem);

        // Create "Edit" menu with one item
        JMenu editMenu = new JMenu("Report");
        JMenuItem passengerMenuItem= new JMenuItem("Passenger List");
        passengerMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PassengerReportForm passengerReportForm = new PassengerReportForm();
                passengerReportForm.setVisible(true);
                passengerReportForm.dispose();
            }
        });

        JMenuItem copyMenuItem = new JMenuItem("Open");
        editMenu.add(copyMenuItem);
        editMenu.add(passengerMenuItem);

        // create the "Help" menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutForm aboutPage = new AboutForm();
                aboutPage.dispose();
                aboutPage.setVisible(true);
            }
        });
        helpMenu.add(aboutMenuItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            FlightReservation flightReservation = new FlightReservation();
            }
        });

        // Create desktop pane
        jDesktopPane = new JDesktopPane();
        setContentPane(jDesktopPane);

        setVisible(true);
    }


    public static void main(String[] args) {
        new LayoutForm();
    }
}
