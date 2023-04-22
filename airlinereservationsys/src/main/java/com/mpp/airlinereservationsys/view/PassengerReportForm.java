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

        // Create a table model with no rows and three columns
        model = new DefaultTableModel(new Object[][]{}, new String[]{"Full Name", "Address", "Telephone Number"});

        // Create a table using the model
        table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Set the preferred size of the scroll pane
        scrollPane.setPreferredSize(new Dimension(400, 200));

        // Add the scroll pane to a panel
        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set the size of the frame
        setSize(500, 300);

        setVisible(true);
        // Exit the application when the frame is closed
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
//    public static void main(String[] args) throws Exception {
//        // Create and show the frame
//        PassengerReportForm frame = new PassengerReportForm();
//        frame.setVisible(true);
//        for(Passenger data : MockData.getPassengerList())
//        {
//            frame.addRow(data.getName().getFullName(),data.getAddress().getFullAddress(),data.getTelephoneNumber());
//        }
//    }
}