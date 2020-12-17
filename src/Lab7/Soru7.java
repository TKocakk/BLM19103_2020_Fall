/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru7 {
    static int diziTopla(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Dizinin boyutunu giriniz: ");
//        int boyut=scan.nextInt();
//        int [] dizi=new int[boyut];
//        System.out.println(boyut +" tane sayı giriniz: ");
//        for (int i = 0; i < boyut; i++) {
//            dizi[i]=scan.nextInt();
//        }
        int [] dizi2={5,7,9};
        System.out.println("Dizinin elemanları toplamı= "+ diziTopla(dizi2));
    }
}
