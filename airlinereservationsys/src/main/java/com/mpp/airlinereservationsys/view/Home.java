package com.mpp.airlinereservationsys.view;


import javax.swing.*;
import java.awt.*;

public class Home {
    // frame
    private JFrame frame;

    // signup and login buttons
    private JButton searchFlight;
    private  JButton passengerReport;
    private  JButton help;
    private JButton exit;

    private  JButton flightReservation;

    // constructor
    public Home() {
        frame = new JFrame("Home");
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/loginimage.jpeg"));
        JLabel imageLabel = new JLabel(imageIcon);
        JPanel panel = new JPanel(new FlowLayout());
// Add the image label to the panel with appropriate constraints
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridheight = GridBagConstraints.REMAINDER;
//        gbc.fill = GridBagConstraints.VERTICAL;
       // panel.add(imageLabel, gbc);
        // create panel
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(240, 248, 255));



        // create buttons
        JButton searchFlight = new JButton("Search Flight");
        searchFlight.setFont(new Font("Arial", Font.BOLD, 18)); // increase font size of button text
        searchFlight.setBackground(new Color(52, 122, 183)); // set button background color to light gray
        searchFlight.setForeground(Color.white); // set button text color to dark gray


        JButton passengerReport = new JButton("Passenger Report");
        passengerReport.setFont(new Font("Arial", Font.BOLD, 18)); // increase font size of button text
        passengerReport.setBackground(new Color(238, 210, 2)); // set button background color to light gray
        passengerReport.setForeground(Color.DARK_GRAY); // set button text color to dark gray


        JButton flightReservation = new JButton("Flight Reservation");
        flightReservation.setFont(new Font("Arial", Font.BOLD, 18)); // increase font size of button text
        flightReservation.setBackground(new Color(102, 204, 255)); // set button background color to light gray
        flightReservation.setForeground(Color.DARK_GRAY); // set button text color to dark gray


        JButton help = new JButton("Help ?");
        help.setFont(new Font("Arial", Font.BOLD, 18)); // increase font size of button text
        help.setBackground(new Color(102, 204, 255)); // set button background color to light gray
        help.setForeground(Color.DARK_GRAY); // set button text color to dark gray

        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Arial", Font.BOLD, 18)); // increase font size of button text
        exit.setBackground(new Color(255, 0, 0)); // set button background color to light gray
        exit.setForeground(Color.DARK_GRAY); // set button text color to dark gray
        // add buttons to panel

        panel.add(flightReservation);
        panel.add(searchFlight);
        panel.add(passengerReport);
        panel.add(help);
        panel.add(exit);
        // add panel to frame
        frame.add(panel);

        // call method flightSearch when Search Flight button is clicked
        searchFlight.addActionListener(e -> {
            try {
                flightSearch();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        // call method helpSearch when Help button is clicked
        help.addActionListener(e -> helpSearch());

        // call method passengerSearch when Passenger Report button is clicked
        passengerReport.addActionListener(e -> {
            try {
                passengerSearch();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        // call method login when Login button is clicked
        exit.addActionListener(e -> exit());
        flightReservation.addActionListener(e-> {
            try {
                flightReservation_();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        // set frame properties
        frame.setSize(800, 700);
        frame.setLayout(new CardLayout());
    }




    // show the frame
    public void show() {
        frame.setVisible(true);
    }

    public  void flightSearch() throws Exception {
        frame.setVisible(false);
        FlightSearchForm flightSearchForm=new FlightSearchForm();
        flightSearchForm.show();
    }
    public  void flightReservation_() throws Exception {
        frame.setVisible(false);
        FlightReservationForm flightReservationForm=new FlightReservationForm();
        flightReservationForm.show();
    }

    public  void passengerSearch() throws Exception {
        frame.setVisible(false);
        PassengerReportForm passengerReportForm=new PassengerReportForm();
        //passengerReportForm.show();
    }
    public  void helpSearch()  {
        frame.setVisible(false);
         AboutForm aboutForm=new AboutForm();
        //aboutForm.disposeWindow();
    }
    // login - closes the current frame and opens the login page
    public void exit() {
        System.exit(0);
    }

}
