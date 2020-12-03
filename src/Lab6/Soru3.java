/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru3 {
     static double Carpma(double sayi1, double sayi2, int sayi3, int sayi4){
       return (sayi1+sayi2+sayi3+sayi4)/4;
      
    }
    public static void main(String[] args) {
        System.out.println(Carpma(5.5, 6.7,3,2));
    }
}
