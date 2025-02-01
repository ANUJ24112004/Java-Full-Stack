/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstraction;
import java.util.Scanner;

abstract class Parent{   //Abstraction Class
    abstract void Show();   //Abstraction method
    abstract int Input();
}
class Child extends Parent{   //Accessing Abstract Class 
    void Show(){     //Accessing Abstract Method
        System.out.println("HI!! ...");
    }
    int Input(){    //Accessing Abstract Methdo
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        return a+b;
        
    }
}
public class Abstraction {

    public static void main(String[] args) {
        Child CObj = new Child();
        CObj.Show();
        System.out.println("Addition : "+ CObj.Input());
    }
}
