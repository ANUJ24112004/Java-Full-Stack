/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter : ");
        int n=sc.nextInt();
        int i=1;
        int f=0;
        while(i<=n){
            f=f+i;
            i++;
        }
        System.out.println(f);
    }
}
