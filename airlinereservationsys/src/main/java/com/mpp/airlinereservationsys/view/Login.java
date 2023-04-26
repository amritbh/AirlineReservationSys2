package com.mpp.airlinereservationsys.view;

import com.mpp.airlinereservationsys.model.Authenticator;
import com.mpp.airlinereservationsys.model.RoleType;
import com.mpp.airlinereservationsys.utility.Validator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements Authenticator {
    private JFrame frame;
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
//        frame = new JFrame("Login");
//        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/loginimage.jpeg"));
//        JLabel imageLabel = new JLabel(imageIcon);
//        JPanel panel = new JPanel(new GridBagLayout());
//
//// Add the image label to the panel with appropriate constraints
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridheight = GridBagConstraints.REMAINDER;
//        gbc.fill = GridBagConstraints.VERTICAL;
//        panel.add(imageLabel, gbc);
//        frame = new JFrame("Login");
//        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/loginimage.jpeg"));
//        JLabel imageLabel = new JLabel(imageIcon);
//        JPanel panel = new JPanel();
//        panel.add(imageLabel);
//        add(panel);
        //setSize(200, 100);
        setVisible(true);
        //setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JButton forgotPasswordButton = new JButton("Forgot Password ?");



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
//
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a dialog or perform some action for forgot password
                JOptionPane.showMessageDialog(null, "Please contact the administrator to reset your password.");
            }
        });



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

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());

// Add the buttons to the panel
        buttonPanel.add(signInButton);
        buttonPanel.add(forgotPasswordButton);


// Add the button panel to the main panel
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        add(buttonPanel, constraints);

        signInButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        signInButton.setText("Login");
        signInButton.setBackground(new Color(0,171,102));

        forgotPasswordButton.setBackground(new Color(36,160,237));

        // Attach action listener to sign in button
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                String role = (String) roleTypeComboBox.getSelectedItem();
                try {
                    Validator.loginValidator(username,password, RoleType.ADMIN);
                    authorize(username,password,RoleType.ADMIN);
                    Home home= new Home();
                    home.show();


                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

//                if (username.equals("admin") && password.equals("123")) {
//                   // disposeWindow();
//                    Home home= new Home();
//                    home.show();
//
//                } else
//                    JOptionPane.showMessageDialog(null, "Username or Password mismatch ");

            }
        });

    }

    public void  disposeWindow() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window.isVisible()) {
                window.dispose();
            }
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
