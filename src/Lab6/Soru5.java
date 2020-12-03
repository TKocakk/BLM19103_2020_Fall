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
public class Soru5 {
    static boolean asalMi(int sayi){
        if(sayi<2) return false;
        
        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(asalMi(1));
    }
}
