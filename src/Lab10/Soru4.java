/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Tugce Kocak
 */
public class Soru4 {
    static void sekilliYaz(int satir,char karakter){
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(karakter);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        sekilliYaz(7, 'X');
    }
}
