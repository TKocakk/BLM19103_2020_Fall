/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Tugce Kocak
 */
public class Soru6 {
    static boolean mukemmelMi(int x){
        int toplam=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0)
                toplam=toplam+i;
        }
        if(toplam==x) return true;
        else return false;
    }
    public static void main(String[] args) {
        int a=7;
        if(mukemmelMi(a))
            System.out.println("Girilen sayi mükemel sayıdır.");
        else
            System.out.println("Girilen sayi mükemmel sayı değildir");
    }
            
            
}
