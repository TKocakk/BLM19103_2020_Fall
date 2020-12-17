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
 
public class Soru10 {
    static int sayiUret(int min,int max){
        return (int) (min+ Math.random()*(max-min));
   }
    public static void main(String[] args) {
        int sayi= sayiUret(50,100);
        System.out.println(sayi);
    }
}
