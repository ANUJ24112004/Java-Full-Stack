/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymosphism;
//Polymorphism (Method OverLoading)
//Run time Polymorphism..
//class A{
//    void show(){
//        System.out.println("Class A");
//    }
//}
//class B extends A{
//    void show(){
//        System.out.println("Class B");
//    }
//}
//Compile Time Polymorphism..(Method OverRiding)
class A{
    int age;
    String name;
    void show(int a){
        age=a;
        System.out.println("Age : "+ age);
    }
}
class B extends A{
    void show(int a, String n){
        age=a;
        name=n;
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
    }
}
public class Polymosphism {

    public static void main(String[] args) {
//        CompileTime ... (OverLoading)
//        A obj1 = new A();
//        B obj2 = new B();
//        obj1.show(); //For Class A
//        obj2.show(); //For Class B

//RunTine...(OverRiding)

        A obj1 = new A();
        B obj2 = new B();
        obj1.show(20);
        obj2.show(20,"Anuj");
    }
}
