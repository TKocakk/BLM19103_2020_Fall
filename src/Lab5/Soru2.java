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
public class Soru2 {
    public static void main(String[] args) {
        // a sıkkı
        for (int i = 0; i < 30; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
        // b sıkkı
        int j=1;
        while(j<100){
            if(j%8==0){
                System.out.println(j);
            }
            j++;
        }
    }
}
