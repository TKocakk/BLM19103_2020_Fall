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
public class soru10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int N=scan.nextInt();
        
        int toplam=(N*(N+1)*(2*N+1))/6;
        System.out.println("Kareler Toplamı= "+toplam);
    }
}
