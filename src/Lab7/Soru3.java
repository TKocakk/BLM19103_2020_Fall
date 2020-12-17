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
public class Soru3 {
    public static void main(String[] args) {
        short [] array1={4,56,78,1,4,9};
        short [] array2=new short[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i]=(short) (array1[i]*2);
            System.out.print(array2[i]+" ");
        }
    }
}
