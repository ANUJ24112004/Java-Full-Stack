/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.optionpane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class OptionPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
//        JOptionPane.showMessageDialog(frame,"Hi!!","Alert",JOptionPane.WARNING_MESSAGE);  //Warninng msg...
//        JOptionPane.showMessageDialog(frame,"Yoi!!!");    //Normal popup...
        String Name = JOptionPane.showInputDialog(frame,"Enter your Name...");
        System.out.println(Name);
    }
}
