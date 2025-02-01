/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

class Parent{
    String Name;
    int Age;
}
class Child1 extends Parent{
    String ParentName1;
}
class Child2 extends Parent{
    String ParentName2;
}
class SubChild extends Child1{
    
}
public class Inheritance {

    public static void main(String[] args) {
        Parent pnt = new Parent();
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        pnt.Name="Parent1";
        ch1.ParentName1="Parent1";
        ch1.Name="ch1";
        ch1.Age=26;
        ch2.Name="ch2";
        ch2.ParentName2="Parent1";
        ch2.Age=22;
        SubChild sc = new SubChild();
        sc.Age=12;
        System.out.println(pnt.Name);
        System.out.println(ch1.Name);
        System.out.println(ch2.Name);
    }
}
