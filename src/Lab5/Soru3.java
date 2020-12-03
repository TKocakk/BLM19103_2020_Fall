/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n=scan.nextInt();
        // faktoriyel= n*(n-1)*(n-2)*..*1
        int faktoriyel=1;
        for (int i = n; i>0; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println("Girdiğiniz sayının faktoriyeli= "+ faktoriyel);
        System.out.println("*************");
         // 2. çözüm
        int i=1;
        faktoriyel=1;
        while(i<=n){
            faktoriyel*=i;
            i++;
        }
         System.out.println("Girdiğiniz sayının faktoriyeli= "+ faktoriyel);
        
    }
   
}
