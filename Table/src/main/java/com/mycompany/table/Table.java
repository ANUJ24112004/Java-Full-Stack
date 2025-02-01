/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.table;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Table {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
//        Set Frame Height & width...
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
//        Creating Table....
//        Define Columns and Data For Table...
        String column[]={"Id","Name","G-Mail"};
        String data[][]={{"01","Anuj","anuj7902047@gmail.com"},
            {"02","Sameer","samvrok790@gmail.com"},
            {"03","Vibhor Sharma","devilking724@gmail.com"}};
        
//        JTable....
        JTable tb1 = new JTable(data,column);
        tb1.setBounds(10,10,500,800);
        
//        Adding into Frame...
        frame.add(tb1);
    }
}
