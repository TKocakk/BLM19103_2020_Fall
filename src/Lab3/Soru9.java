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
public class Soru9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        String sonuc=(sayi%2==0)? "Sayi çiftir" :"Sayı tektir";
        System.out.println(sonuc);
    }
}
