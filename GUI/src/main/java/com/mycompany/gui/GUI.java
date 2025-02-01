/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.util.*;
import javax.swing.*;
public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
//        Set Frame Height & width...
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
//        Lable...
        JLabel l1 = new JLabel("Click here :");
        l1.setBounds(80, 80, 80, 60);
        frame.add(l1);
//        Button....
        JButton b1 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\tartagliapostings_471983056_586783890622708_1328982854980504123_n.jpg"));
        b1.setBounds(100,120,80,40);      //(X,Y,Width,Height)....
        frame.add(b1);
    }
}
