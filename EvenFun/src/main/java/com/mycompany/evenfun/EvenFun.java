/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenfun;
import java.util.Scanner;

public class EvenFun {
    static boolean IfEven(int n){
        if (n%2==0)
        return true;
        else
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        
        if(IfEven(n)==true)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd:");
    }
}
