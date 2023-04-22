package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.*;

public class AboutForm extends JFrame {

    public AboutForm() {
        setTitle("About Airline Reservation System");
        setSize(400, 300);
        setLocationRelativeTo(null); // center the frame on screen
        setResizable(false);

        JLabel headerLabel = new JLabel("Airline Reservation System", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel infoLabel = new JLabel("<html><div style='text-align: center;'>This airline reservation system is developed by Avinash<br>Version 1.0<br><br>Contact:<br>Avinash<br>avinash@airlines.com<br>123-456-7890</div></html>");
        infoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        infoLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        infoLabel.setBackground(Color.gray);
        infoLabel.setOpaque(true);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(headerLabel, BorderLayout.NORTH);
        panel.add(infoLabel, BorderLayout.CENTER);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        AboutForm aboutPage = new AboutForm();
        aboutPage.setVisible(true);
    }


}
