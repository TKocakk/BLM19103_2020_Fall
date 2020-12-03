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
public class Soru4 {
    static boolean ciftMi(int sayi){
        if(sayi%2==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(ciftMi(8));
    }
}
