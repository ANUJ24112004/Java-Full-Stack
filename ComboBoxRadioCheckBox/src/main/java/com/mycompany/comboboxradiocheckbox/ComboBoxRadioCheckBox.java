/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comboboxradiocheckbox;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class ComboBoxRadioCheckBox {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
//        Set Frame Height & width...
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
//        Label Creating...
        JLabel l1 = new JLabel("Your Fav language :");
        JLabel l2 = new JLabel("Your Gender :");
        l1.setBounds(10,10,150,25);
        l2.setBounds(10,70,150,25);
        
//        CheckBox...
        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(10,40, 60, 20);
        JCheckBox cb2 = new JCheckBox("Python");
        cb2.setBounds(80, 40, 100, 20);
        
//        RadioButton...
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(10,100,60,25);
        rb2.setBounds(80,100,80,25);
        
//        ComboBox...
        String data[]={"Java","Python","Male","Female"};
        JComboBox CBox1 = new JComboBox(data);
        CBox1.setBounds(10,130,80,25);

//        Adding into Franme...
        frame.add(l1);
        frame.add(l2);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(CBox1);
    }
}
