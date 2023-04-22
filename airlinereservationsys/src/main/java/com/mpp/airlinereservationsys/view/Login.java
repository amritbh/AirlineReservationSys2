package com.mpp.airlinereservationsys.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  {
    public Login() {
        initComponents();
    }
    private JLabel usernameLabel, passwordLabel, roleTypeLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> roleTypeComboBox;
    private JButton signInButton;
    private void initComponents()
    {
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

        // Attach action listener to sign in button
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (username.equals("admin") && password.equals("123"))
                    JOptionPane.showMessageDialog(null, "Login Successful");
                else
                    JOptionPane.showMessageDialog(null, "Username or Password mismatch ");

            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
