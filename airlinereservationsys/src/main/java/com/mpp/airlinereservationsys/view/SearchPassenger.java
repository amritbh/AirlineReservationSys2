package com.mpp.airlinereservationsys.view;

import com.mpp.airlinereservationsys.model.Passenger;
import com.mpp.airlinereservationsys.test.MockData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPassenger extends JFrame implements ActionListener {
    private static JFrame jFrame;

    private JTable table;
    private DefaultTableModel tableModel;
    private TableRowSorter<TableModel> sorter;

    private JTextField searchField;

    public SearchPassenger() throws Exception {

        jFrame=new JFrame("Search Passenger");
        setTitle("Search Passenger");

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        tableModel.addColumn("FullName");
        tableModel.addColumn("Address");
        tableModel.addColumn("Telephone Number");


        for(Passenger data : MockData.getPassengerList())
        {
            tableModel.addRow(new Object[]{data.getName().getFirstName(),
                    data.getAddress().getFullAddress(),
                    data.getTelephoneNumber(),
                    });
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
        new SearchFlight();
    }


}


//
//    private JTable table;
//    private DefaultTableModel model;
//
//    public PassengerReportForm() throws Exception {
//        super("Passenger Report");
//
//        model = new DefaultTableModel(new Object[][]{}, new String[]{"Full Name", "Address", "Telephone Number"});
//
//        table = new JTable(model);
//        table.setBackground( new Color(65, 105, 225));
//        JScrollPane scrollPane = new JScrollPane(table);
//
//        scrollPane.setPreferredSize(new Dimension(400, 200));
//
//        JPanel panel = new JPanel();
//        panel.add(scrollPane);
//
//        getPassengerReport();
//        // Add back button
//        JButton backButton = new JButton("Back");
//        backButton.addActionListener(e -> {
//            disposeWindow(); // Close current window
//           Home home = new Home();
//           home.show();
//        });
//        panel.add(backButton);
//
//        getContentPane().add(panel);
//
//        setSize(500, 300);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//
//    public void addRow(String fullName, String address, String telephoneNumber) {
//        model.addRow(new Object[]{fullName, address, telephoneNumber});
//    }
//
//    public static List<Passenger> getPassengerReport() throws  Exception
//    {
//        List<Passenger> passengerList = new ArrayList<>();
//        PassengerReportForm frame = new PassengerReportForm();
//        for (Passenger data : MockData.getPassengerList()) {
//            frame.addRow(data.getName().getFullName(), data.getAddress().getFullAddress(), data.getTelephoneNumber());
//            passengerList.add(data);
//        }
//        frame.setVisible(true);
//        return passengerList;
//    }
//    public void  disposeWindow() {
//        Window[] windows = Window.getWindows();
//        for (Window window : windows) {
//            if (window.isVisible()) {
//                window.dispose();
//            }
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        new PassengerReportForm();
//        //passengerReportForm.getPassengerReport();
//    }
//
//}