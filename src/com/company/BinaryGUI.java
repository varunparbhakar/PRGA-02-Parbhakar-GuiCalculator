package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryGUI extends JPanel implements ActionListener {
    JButton oneButton, zeroButton, clearButton, confirmButton,
            oneButton2, zeroButton2, clearButton2, confirmButton2,
            solveButton;
    JTextField valueField1, valueField2, solutionField;
    String existingText1, existingText2;
    JLabel solutionLabel;
    JComboBox operatorSelectB;
    int myNumber1, myNumber2;
    char myOperator;
    BinaryGUI(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        solutionField = new JTextField(20);
        solutionField.setBorder(BorderFactory.createEmptyBorder(10,15,0,0));
        solutionField.setEditable(false);
        solutionField.setText("454521244");
        solutionField.setSize(10,10);
        solutionLabel = new JLabel("Solution:");
        solutionLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));


        valueField1 = new JTextField(20);
        valueField1.setEditable(false);

        oneButton = new JButton("1");
        zeroButton = new JButton("0");
        clearButton = new JButton("C");
        confirmButton = new JButton("Confirm");

        operatorSelectB = new JComboBox();
        operatorSelectB.addItem('+');
        operatorSelectB.addItem('-');
        operatorSelectB.addItem('/');
        operatorSelectB.addItem('*');



        valueField2 = new JTextField(20);
        valueField2.setEditable(false);
        oneButton2 = new JButton("1");
        zeroButton2 = new JButton("0");
        clearButton2 = new JButton("C");
        confirmButton2 = new JButton("Confirm");

        solveButton = new JButton("Solve");

        oneButton.addActionListener(this);
        zeroButton.addActionListener(this);
        clearButton.addActionListener(this);
        confirmButton.addActionListener(this);

        oneButton2.addActionListener(this);
        zeroButton2.addActionListener(this);
        clearButton2.addActionListener(this);
        confirmButton2.addActionListener(this);

        solveButton.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        this.add(valueField1, gbc);

        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(oneButton, gbc);

        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(zeroButton, gbc);

        gbc.gridx = 9;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(clearButton, gbc);

        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(confirmButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 10;
        gbc.gridheight = 1;
        this.add(operatorSelectB, gbc);

        operatorSelectB.setBorder(BorderFactory.createEmptyBorder(15,0,15,0));


        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        this.add(valueField2, gbc);

        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(oneButton2, gbc);

        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(zeroButton2, gbc);

        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(clearButton2, gbc);

        gbc.gridx = 10;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(confirmButton2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 20;
        gbc.gridheight = 10;
        this.add(solutionField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        this.add(solutionLabel, gbc);

        oneButton.setEnabled(false);
        zeroButton.setEnabled(false);
        confirmButton.setEnabled(false);
        valueField1.setText("Value 1");

        oneButton2.setEnabled(false);
        zeroButton2.setEnabled(false);
        confirmButton2.setEnabled(false);
        valueField2.setText("Value 2");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == oneButton) {
            existingText1 = valueField1.getText();
            valueField1.setText(existingText1 + "1");
        }
        if (e.getSource() == zeroButton) {
            existingText1 = valueField1.getText();
            valueField1.setText(existingText1 + "0");
        }
        if (e.getSource() == clearButton) {
            oneButton.setEnabled(true);
            zeroButton.setEnabled(true);
            confirmButton.setEnabled(true);
            valueField1.setText("");
        }
        if (e.getSource() == confirmButton) {
            if (Calculator.inputValid(valueField1.getText())){
                myNumber1 = Integer.parseInt(valueField1.getText());
            } else {
                oneButton.setEnabled(false);
                zeroButton.setEnabled(false);
                confirmButton.setEnabled(false);
                valueField1.setText("Error: Number must be less than 10");
            }
        }

        if (e.getSource() == oneButton2) {
            existingText2 = valueField2.getText();
            valueField2.setText(existingText2 + "1");
        }
        if (e.getSource() == zeroButton2) {
            existingText2 = valueField2.getText();
            valueField2.setText(existingText2 + "0");
        }
        if (e.getSource() == clearButton2) {
            oneButton2.setEnabled(true);
            zeroButton2.setEnabled(true);
            confirmButton2.setEnabled(true);
            valueField2.setText("");
        }
        if (e.getSource() == confirmButton2) {
            if (Calculator.inputValid(valueField2.getText())){
                myNumber2 = Integer.parseInt(valueField2.getText());
            } else {
                oneButton2.setEnabled(false);
                zeroButton2.setEnabled(false);
                confirmButton2.setEnabled(false);
                valueField2.setText("Error: Number must be less than 10");
            }
        }
        if (e.getSource() == solveButton) {
        }

    }
}
