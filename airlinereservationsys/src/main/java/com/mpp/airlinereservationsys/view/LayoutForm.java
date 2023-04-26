package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutForm extends JFrame {
    private JFrame frame;
    private JDesktopPane jDesktopPane;
    public LayoutForm() {
        // Set window properties

        setTitle("MIU Airlines");
        setSize(800, 600); // increased size for demonstration purposes
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu flightMenu = new JMenu("Flight");

        JMenuItem reservationMenuItem = new JMenuItem("Reservation");
        JMenuItem flightSearchMenuItem = new JMenuItem("Flight Search");
        reservationMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FlightReservation reservationForm = new FlightReservation();

            }
        });

        flightSearchMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FlightSearchForm flightSearchForm=new FlightSearchForm();
                    setVisible(true);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dialogFlag = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (dialogFlag == JOptionPane.YES_OPTION) {
                    System.exit(0);
                   new Login();
                }
            }
        });

        flightMenu.addSeparator();
        flightMenu.add(reservationMenuItem);
        flightMenu.addSeparator();
        flightMenu.add(flightSearchMenuItem);
        flightMenu.addSeparator();
        flightMenu.add(exitMenuItem);

        // Create "Edit" menu with one item
        JMenu reportMenu = new JMenu("Report");
        JMenuItem passengerMenuItem= new JMenuItem("Passenger List");
        passengerMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //PassengerReportForm passengerReportForm = new PassengerReportForm();
                try {
                    new PassengerReportForm();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JMenuItem copyMenuItem = new JMenuItem("Open");
        reportMenu.add(copyMenuItem);
        reportMenu.add(passengerMenuItem);


        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutForm aboutPage = new AboutForm();
                aboutPage.disposeWindow();
                aboutPage.setVisible(true);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(flightMenu);
        menuBar.add(reportMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        jDesktopPane = new JDesktopPane();
        setContentPane(jDesktopPane);

        setVisible(true);
    }


    public static void main(String[] args) {
        new LayoutForm();
    }
}
