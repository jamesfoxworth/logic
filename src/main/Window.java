package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Logic Simulator");
        JButton button = new JButton("Add New Component");
        button.setBounds(130, 100, 200, 40);

        button.addActionListener(e -> {
            NewGate.NewGate();
        });
        frame.add(button);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}