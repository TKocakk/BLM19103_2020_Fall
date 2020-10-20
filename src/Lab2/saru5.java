/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author Tugce Kocak
 */
public class saru5 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int toplam = (sayi1++) + (sayi2++);
        System.out.println(toplam);
        
        System.out.println(sayi1 + "-" + sayi2);
        System.out.println((++sayi1) + (++sayi2));

    }
}
