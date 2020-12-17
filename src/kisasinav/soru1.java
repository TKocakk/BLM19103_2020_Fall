/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisasinav;

/**
 *
 * @author Tugce Kocak
 */
public class soru1 {
    static int [] donustur(float [] dizi){
        int [] intdizi=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            intdizi[i]=Math.round(dizi[i]);
        }
       
        return intdizi;
    }
    public static void main(String[] args) {
        float[] dizi1={15.5f, 10.0f, 5.1f, 3.5f , 5.7f};
        int []  intdizisi = donustur(dizi1);
        for (int i = 0; i < intdizisi.length; i++) {
            System.out.print(intdizisi[i]+"  ");
        }
    }
            
}
