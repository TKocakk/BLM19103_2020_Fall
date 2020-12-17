/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Tugce Kocak
 */
public class Soru9 {
    public static void main(String[] args) {
        int [] dizi=new int [10];
        int adet=0;
        for (int i = 0; i < 10; i++) {
            dizi[i]=(int)(1+Math.random()*(999));
            System.out.println(dizi[i]);
           if(dizi[i]>99 && dizi[i]<1000)  adet++;
           
        }
        System.out.println("3 basamaklı sayılarına adedi: "+ adet);
    }
}
