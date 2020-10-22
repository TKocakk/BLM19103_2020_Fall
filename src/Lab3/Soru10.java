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
public class Soru10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç sayı giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        
        if(sayi1>=sayi2 && sayi1>=sayi3){
            if(sayi1==sayi2)    System.out.println("Sayi1 ve sayi2 en büyüktür.");
            if(sayi1==sayi3) System.out.println("sayi1 ve sayi3 en büyüktür.");
            else  System.out.println("En büyük sayi1 dir");
        }
        if(sayi2>=sayi1 && sayi2>=sayi3){
            System.out.println("En büyük sayi2 dir");
        }
        if(sayi3>=sayi1 && sayi3>=sayi2){
            System.out.println("Sayi3 en büyüktür.");
        }
        
    } 
}
