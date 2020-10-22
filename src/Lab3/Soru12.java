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
public class Soru12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        switch(sayi){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3:System.out.println("çarşamba"); break;
            case 4: System.out.println("perşembe"); break;
            case 5: System.out.println("cuma"); break;
            case 6:System.out.println("cumartesi"); break;
            case 7:System.out.println("pazar"); break;
            default : System.out.println("gecersiz gün");
        }
    }
}
