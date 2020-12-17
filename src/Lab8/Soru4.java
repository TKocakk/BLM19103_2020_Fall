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
public class Soru4 {
       static int [][] rastgeleMatrisOlustur(int N,int M,int baslangic, int bitis){
         int [][] matris=new int[N][M];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j]=(int)(Math.random()*(bitis-baslangic+1))+baslangic;
            }
        }
        return matris;
    }
       static void print(int [][] matris){
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println("");
        }
    }
       public static void main(String[] args) {
        int[][] matris=rastgeleMatrisOlustur(3, 3, 0, 10);
           print(matris);
        int [] tekrarDizi=new int[11];
        
           for (int i = 0; i < matris.length; i++) {
               for (int j = 0; j < matris[i].length; j++) {
                   tekrarDizi[matris[i][j]]++;
               }
           }
           for (int i = 0; i < tekrarDizi.length; i++) {
               System.out.println(i+" elemanı matriste "+tekrarDizi[i]+" defa geçer");
           }
    }
}
