 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

interface A{
    int n = 25;                 //Final ststic
    String Name = "Anuj";       //Final and static
    void Show();                //Public Abstract
    void OutPut();              //Public Abstract
    default void Name(){
        System.out.println("Default method ...");      //Default Method with Body
    }
}
interface C extends A{
    int Add(int a,int b);
}
class B implements A,C{
    public void Show(){
        System.out.println("Show Method");
    }
    public void OutPut(){
        System.out.println("OutPut Method");
    }
    public int Add(int a, int b){
        return a+b;
    }
}
public class Interfaces {

    public static void main(String[] args) {
        B obj = new B();
        obj.OutPut();
        obj.Show();
        System.out.println("Addition : "+ obj.Add(25,30));
        obj.Name();
    }
}
