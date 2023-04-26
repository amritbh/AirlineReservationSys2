package com.mpp.airlinereservationsys.view;

import com.mpp.airlinereservationsys.model.Flight;
import com.mpp.airlinereservationsys.test.MockData;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class FlightSearchForm extends JFrame implements ActionListener {
    private static JFrame jFrame;

    private JTable table;
    private DefaultTableModel tableModel;
    private TableRowSorter<TableModel> sorter;

    private JTextField searchField;

    public FlightSearchForm() throws Exception {

        jFrame=new JFrame("Flight Search");
        setTitle("Flight Search");

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        jFrame.setBackground( new Color(240, 248, 255));

        tableModel.addColumn("Flight Number");
        tableModel.addColumn("Departure Date");
        tableModel.addColumn("Departure Airport");
        tableModel.addColumn("Departure Time");
        tableModel.addColumn("Arrival Time");

        for(Flight data : MockData.getFlightMockData())
        {
            tableModel.addRow(new Object[]{data.getFlightNumber(),data.getDepartureDate(),data.getDepartureAirport(),data.getDepartureTime(),data.getArrivalTime()});
        }

        sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);

        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(this);

        // Add the search controls to the layout
        JPanel controls = new JPanel();
        controls.add(searchField);
        controls.add(searchButton);
        add(controls, BorderLayout.NORTH);



        // Add the table to the layout
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Add the back button
        JButton backButton = new JButton("Back");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(backButton);
        add(buttonPanel, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Home home = new Home();
                home.show();
            }
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = searchField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            RowFilter<TableModel, Object> filter = RowFilter.regexFilter("(?i)" + text, 0,1,2,3,4, 5);
            sorter.setRowFilter(filter);
        }
    }
    public static void main(String[] args) throws Exception {
        new FlightSearchForm();
    }


}

