/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Tugce Kocak
 */
public class Soru1 {
    public static void main(String[] args) {
        int [][] matris=new int[5][3];
        int [][] matris1={{23,5,23},
                         {54,13,65},
                         {3,84,43},
                         {76,13,10},
                         {95,56,75}};
        
        for (int i = 0; i < matris1[i].length; i++) {
            int toplam=0;
            for (int j = 0; j < matris1.length; j++) {
                //System.out.print(matris1[i][j]+"\t");
                toplam+=matris1[j][i];
               
            }
            System.out.println(i+". sütun toplamı="+ toplam);
          //  System.out.println("");
        }
    }
}
