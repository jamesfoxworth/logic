package main;

import components.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
public class NewGate {
    public static void NewGate() {
        JFrame frame = new JFrame("Select New Component");
        frame.setSize(300, 550);
        ButtonGroup options = new ButtonGroup();

        JRadioButton and = new JRadioButton("AND Gate");
        and.setBounds(75, 50, 100, 30);
        frame.add(and);
        options.add(and);

        JRadioButton or = new JRadioButton("OR Gate");
        or.setBounds(75, 100, 100, 30);
        frame.add(or);
        options.add(or);

        JRadioButton nand = new JRadioButton("NAND Gate");
        nand.setBounds(75, 150, 100, 30);
        frame.add(nand);
        options.add(nand);

        JRadioButton nor = new JRadioButton("NOR Gate");
        nor.setBounds(75, 200, 100, 30);
        frame.add(nor);
        options.add(nor);

        JRadioButton xor = new JRadioButton("XOR Gate");
        xor.setBounds(75, 250, 100, 30);
        frame.add(xor);
        options.add(xor);

        JRadioButton xnor = new JRadioButton("XNOR Gate");
        xnor.setBounds(75, 300, 100, 30);
        frame.add(xnor);
        options.add(xnor);

        JRadioButton not = new JRadioButton("NOT Gate");
        not.setBounds(75, 350, 100, 30);
        frame.add(not);
        options.add(not);

        JRadioButton buffer = new JRadioButton("Buffer");
        buffer.setBounds(75, 400, 100, 30);
        frame.add(buffer);
        options.add(buffer);

        JButton create = new JButton("Create");
        create.setBounds(75, 450, 100, 30);
        create.addActionListener(e -> {
            if (and.isSelected()) {
                AND newAnd = new AND(Collections.emptyList());
            }
            if (or.isSelected()) {
                OR newOr = new OR(Collections.emptyList());
            }
            if (nand.isSelected()) {
                NAND newNand = new NAND(Collections.emptyList());
            }
            if (nor.isSelected()) {
                NOR newNor = new NOR(Collections.emptyList());
            }
            if (xor.isSelected()) {
                XOR newXor = new XOR(Collections.emptyList());
            }
            if (xnor.isSelected()) {
                XNOR newXnor = new XNOR(Collections.emptyList());
            }
            if (not.isSelected()) {
                NOT newNot = new NOT(Collections.emptyList());
            }
            if (buffer.isSelected()) {
                Buffer newBuffer = new Buffer(Collections.emptyList());
            }
            frame.setVisible(false);
        });
        frame.add(create);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
