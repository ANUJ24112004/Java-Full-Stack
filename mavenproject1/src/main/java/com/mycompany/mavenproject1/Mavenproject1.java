/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
class User{
    private String Name;
    int Age;
    void input(String n,int a){
        this.Name=n;
        Age=a;
    }
    void Outpute(){
        System.out.println("Name : "+ Name);
        System.out.println("Age : "+ Age);
    }
}
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User Usr1 = new User();
        System.out.println("Enter Name : ");
        String n=sc.nextLine();
        System.out.println("Enter Age : ");
        int a=sc.nextInt();
        Usr1.input(n,a);
        Usr1.Outpute();
    }
}
