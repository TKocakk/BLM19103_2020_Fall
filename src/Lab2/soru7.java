/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.awt.BorderLayout;

/**
 *
 * @author Tugce Kocak
 */
public class soru7 {
    public static void main(String[] args) {
        int sayi=547;
        int yuzler=sayi/100;
        sayi=sayi-yuzler*100;
        int onlar=sayi/10;
        int birler=sayi%10;
        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);
        int tersi=birler*100+onlar*10+yuzler;
        System.out.println(tersi);
        
        
    }
}
