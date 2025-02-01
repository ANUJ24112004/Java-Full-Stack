/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu1;
import java.util.*;
import javax.swing.*;

public class Menu1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar");
        
//        Frame...
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        
//        MenuBar Creation...
        JMenuBar mb = new JMenuBar();
        JMenu Menu , SubMenu;               //Menu, SubMenu...
        JMenuItem i1,i2,i3,i4,i5;           //MenueItem
        Menu =new JMenu("Menu");
        SubMenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        
//        Adding MenuItem into Menu...
        Menu.add(i1);
        Menu.add(i2);
        Menu.add(i3);
        SubMenu.add(i4);
        SubMenu.add(i5);
        Menu.add(SubMenu);
        mb.add(Menu);
        
//        Adding into Frame...
        frame.setJMenuBar(mb);
    }
}
