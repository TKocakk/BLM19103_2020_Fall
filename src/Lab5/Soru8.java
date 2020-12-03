/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Tugce Kocak
 */
public class Soru8 {
    public static void main(String[] args) {
        int sayi=1;
        boolean asalMi=true;
        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0){
                System.out.println(sayi+ " Asal değildir.");
                asalMi=false;
                break;
            }
        }
        if(asalMi==true){
            System.out.println(sayi+" asaldır.");
        }
        
    }
}
