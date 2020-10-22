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
public class soru8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi=scan.nextInt();
        switch(sayi%2){
            case 0: System.out.println("sayi çifttir.");
            case 1: System.out.println("sayi tektir.");
        }
    }
}
