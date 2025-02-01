/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wrapperclass;
//LCD...
public class WrapperClass {

    public static void main(String[] args) {
        int a=25;
//        Integer i = Integer.valueOf(a);
        Integer i=a;     //AutoBoxing...
//        int b=i.intValue(); 
        int b=i;        //UnBoxing
        System.out.println("Premetive : "+a);
        System.out.println("Wrapper Class : "+i);
    }
}
