/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru2 {
    static int [][] rastgeleMatrisOlustur(int N,int M){
         int [][] matris=new int[N][M];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j]=(int)(Math.random()*(100-1+1))+1;
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Matris boyutunu giriniz: ");
        int N=scan.nextInt();
        int M=scan.nextInt();
        int[][] benimMatrisim= rastgeleMatrisOlustur(N, M);
        print(benimMatrisim);
        System.out.println("******************");
        for (int i = 0; i < benimMatrisim.length; i++) {
            double toplam=0;
            for (int j = 0; j < benimMatrisim[i].length; j++) {
                toplam+=benimMatrisim[i][j];
                
            }
            double ortlama=toplam/benimMatrisim[i].length;
            System.out.println(i+". satır ortalaması= " +ortlama);
        }
    }
}
