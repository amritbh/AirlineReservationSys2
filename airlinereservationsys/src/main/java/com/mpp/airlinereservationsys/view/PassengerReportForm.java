package com.mpp.airlinereservationsys.view;

import com.mpp.airlinereservationsys.model.Passenger;
import com.mpp.airlinereservationsys.test.MockData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionListener;

public class PassengerReportForm extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public PassengerReportForm() {
        super("Passenger Report");

        model = new DefaultTableModel(new Object[][]{}, new String[]{"Full Name", "Address", "Telephone Number"});

        table = new JTable(model);
        table.setBackground( new Color(65, 105, 225));
        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setPreferredSize(new Dimension(400, 200));

        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Add back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            disposeWindow(); // Close current window
           Home home = new Home();
           home.show();
        });
        panel.add(backButton);

        getContentPane().add(panel);

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void addRow(String fullName, String address, String telephoneNumber) {
        model.addRow(new Object[]{fullName, address, telephoneNumber});
    }

    public void getPassengerReport() throws  Exception
    {
        PassengerReportForm frame = new PassengerReportForm();
        frame.setVisible(true);
        for(Passenger data : MockData.getPassengerList())
        {
            frame.addRow(data.getName().getFullName(),data.getAddress().getFullAddress(),data.getTelephoneNumber());
        }
    }
    public void  disposeWindow() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window.isVisible()) {
                window.dispose();
            }
        }
    }

}