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
public class Soru9 {
    static int toplama(int x,int y){
        return x+y;
    }
    static int cikarma(int x,int y){
        return x-y;
    }
    static int carpma(int a,int b){
        return a*b;
    }
    static double bolme(double sayi1,double sayi2){
        return sayi1/sayi2;
    }
    static void hesapla(int x,int y){
        System.out.println("Toplamı= "+toplama(x, y));
        System.out.println("Çıkarma= "+cikarma(x, y));
        System.out.println("Çarpma= "+carpma(x, y));
        System.out.println("Bölme= "+bolme(x, y));
    }
    public static void main(String[] args) {
        hesapla(5, 10);
    }
}
