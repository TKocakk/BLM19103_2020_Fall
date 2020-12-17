/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class vizesorusu1 {
    static double faktoriyel(int sayi){
        double faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
        }
        return faktoriyel;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n=scan.nextInt();
        double toplam=0;
        for (int i = 1; i <= n; i++) {
            toplam+=i/faktoriyel(i);
        }
        System.out.println("İşlem sonucu= "+toplam);
    }
}
