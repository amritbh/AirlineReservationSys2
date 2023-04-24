package com.mpp.airlinereservationsys.view;


import javax.swing.*;

public class ImageForm extends JFrame {

        public ImageForm() {
            JFrame frame = new JFrame("My Frame");
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/background.jpg"));
            JLabel imageLabel = new JLabel(imageIcon);
            JPanel panel = new JPanel();
            frame.add(imageLabel);
            add(panel);
            setSize(300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            new ImageForm();
        }
    }

