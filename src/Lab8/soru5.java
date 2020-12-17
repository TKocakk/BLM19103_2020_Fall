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
public class soru5 {

    static int[][] rastgeleMatrisOlustur(int N, int M, int baslangic, int bitis) {
        int[][] matris = new int[N][M];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = (int) (Math.random() * (bitis - baslangic + 1)) + baslangic;
            }
        }
        return matris;
    }

    static void print(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] ogrencilervenotlari = rastgeleMatrisOlustur(5, 3, 1, 10);
        print(ogrencilervenotlari);
        int min = 30;
        int kOgrNo = -1;
        for (int i = 0; i < ogrencilervenotlari.length; i++) {
            int toplam = 0;
            for (int j = 0; j < ogrencilervenotlari[i].length; j++) {
                toplam += ogrencilervenotlari[i][j];
            }
             if (toplam < min) {
                    min = toplam;
                    kOgrNo = i;
                }
        }
        System.out.println("En kötü not toplamı olan öğrenci= " + kOgrNo + ". sıradaki öğrenci notu=" + min);
    }
}
