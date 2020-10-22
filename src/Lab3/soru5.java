/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class soru5 {

    public static void main(String[] args) {
        Long milliseconds = System.currentTimeMillis();
        Long toplamSaniye = milliseconds / 1000;
        int saat = (int) ((toplamSaniye / (60 * 60)) % 24) + 3;
        int dakika = (int) ((toplamSaniye / 60) % 60);
        int saniye = (int) (toplamSaniye % 60);
        System.out.println(saat+":"+dakika+":"+saniye);

    }
}
