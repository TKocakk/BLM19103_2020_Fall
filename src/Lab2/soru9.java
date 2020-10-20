/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class soru9 {
    public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
         System.out.println("5 adet sayı giriniz: ");
         double a=scan.nextInt();
         double b=scan.nextInt();
         double c=scan.nextInt();
         double d=scan.nextInt();
         double e=scan.nextInt();
         
         double ort=(a+b+c+d+e)/5;
         System.out.println("Sayıların ortalaması: "+ ort);
    }
}
