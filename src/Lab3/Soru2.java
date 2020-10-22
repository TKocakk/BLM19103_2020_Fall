/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class Soru2 {
    public static void main(String[] args) {
        int sayi1=5;
        int sayi2=6;
        int sayi3;
        
        sayi3= ++sayi2 * sayi1 / sayi2 + sayi2;
        System.out.println("Sonuc= "+sayi3);
    }
}
