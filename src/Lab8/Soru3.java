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
public class Soru3 {
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
    static int [][] matrisToplamıHesapla(int [][] matris1,int [][] matris2){
        int [][] toplamMatrisi=new int[matris1.length][matris1[0].length];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                toplamMatrisi[i][j]=matris1[i][j]+matris2[i][j];
            }
        }
        return toplamMatrisi;
    }
    public static void main(String[] args) {
        int [][] matris1=rastgeleMatrisOlustur(3, 3, 1, 100);
        int [][] matris2=rastgeleMatrisOlustur(3, 3, 1, 100);
        System.out.println("1. matris:");
        print(matris1);
        System.out.println("2. matris:");
        print(matris2);
        
        int [][] toplamMatrisi=matrisToplamıHesapla(matris1, matris2);
        System.out.println("Toplam matrisi:");
        print(toplamMatrisi);
    }
}
