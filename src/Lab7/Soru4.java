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
public class Soru4 {
    public static void main(String[] args) {
        int [] dizi={667,45,7,8,1};
        boolean bulunduMu=false;
        for (int i = 0; i <dizi.length; i++) {
            if(dizi[i]==5){
                System.out.println(i+". indekste 5 bulundu.");
                bulunduMu=true;
                break;
            }
        }
        if(!bulunduMu)
            System.err.println("Bulunamadı!!");
    }
}
