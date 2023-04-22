package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  {
    public Login() {
        initComponents();
    }
    private JLabel usernameLabel, passwordLabel, roleTypeLabel,pageNameLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> roleTypeComboBox;
    private JButton signInButton;
    private JPanel pagenamefield;
    private JLabel pageField;

    private void initComponents()
    {


        // Set background color for the frame
        getContentPane().setBackground(new Color(240, 248, 255));
        // Set button color
        UIManager.put("Button.background", new Color(65, 105, 225));
        UIManager.put("Button.foreground", Color.WHITE);



        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        roleTypeLabel = new JLabel("Role Type:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        roleTypeComboBox = new JComboBox<>(new String[]{"Admin", "User"});
        signInButton = new JButton("Sign In");




        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login | Airline Reservation");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(true);


        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(170, 419, 64, 20);

        passwordLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(170, 419, 64, 20);

        roleTypeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roleTypeLabel.setText("Role Type");
        getContentPane().add(roleTypeLabel);
        roleTypeLabel.setBounds(170, 419, 64, 20);


        usernameField.setPreferredSize(new Dimension(200, 25));

        passwordField.setPreferredSize(new Dimension(200, 25));
        roleTypeComboBox.setPreferredSize(new Dimension(200, 25));



       setVisible(true);

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(usernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        add(roleTypeLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(roleTypeComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        add(signInButton, constraints);

        signInButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        signInButton.setText("Login");

        // Attach action listener to sign in button
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (username.equals("admin") && password.equals("123")) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    new LayoutForm();

                } else
                    JOptionPane.showMessageDialog(null, "Username or Password mismatch ");

            }
        });

    }
    public static void main(String[] args) {
        new Login();
    }
}
