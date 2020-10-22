/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class soru7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki sayı giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        
        if(sayi1>sayi2){
            System.out.println("Sayi1 sayi2 den büyüktür.");
        }
        else if(sayi1==sayi2){
            System.out.println("sayi1 sayi2 ye eşittir");
        }
        else{
            System.out.println("sayi1 sayi2 den küçüktür.");
        }
    }
}
