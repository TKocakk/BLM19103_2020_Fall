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
public class Soru8 {
    static int usHesapla(int a,int b){
        int sonuc=1;
        for (int i = 0; i < b; i++) {
            sonuc*=a;
        }
        return sonuc;
    }
    
    public static void main(String[] args) {
        System.out.println(usHesapla(2, 3));
    }
}
