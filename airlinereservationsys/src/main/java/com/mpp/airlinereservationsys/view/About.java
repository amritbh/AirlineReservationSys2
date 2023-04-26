package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    public About() {
        setTitle("About");
        setSize(400, 300);
        setLocationRelativeTo(null); // center the frame on screen
        setResizable(false);

        var textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        var pane = new JTextPane();
        pane.setContentType("text/html");

        // set text with HTML and CSS
        var text = "<html><head><style>" +
                "body { background-color: #f2f2f2; }" +
                "h1 { color: #444444; text-align: center; }" +
                "p { color: #666666; font-size: 14px; }" +
                "</style></head><body>" +
                "<h1>MIU Airline Reservation System</h1>" +
                "<p><b>This airline reservation system is developed by MIU</b></p>" +
                "<p>Version 1.0. Contact: Miu@airlines.com</p>" +
                "</body></html>";
        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textPanel, BorderLayout.CENTER);

        // create back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            disposeWindow(); // close the AboutForm
            Home home = new Home();
            home.show(); // show the Home page
        });
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(backButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        About aboutPage = new About();
        aboutPage.setVisible(true);
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

}
