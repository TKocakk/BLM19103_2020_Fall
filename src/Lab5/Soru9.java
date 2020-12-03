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
public class Soru9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi=scan.nextInt();
        System.out.println("Üssü giriniz: ");
        int us=scan.nextInt();
        
        int sonuc=1;
        for (int i = 0; i < us; i++) {
            sonuc*=sayi;
        }
        System.out.println("Sonuc: "+ sonuc);
        
    }
}
