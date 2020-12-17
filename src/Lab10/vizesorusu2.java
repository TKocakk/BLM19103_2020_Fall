/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Tugce Kocak
 */
public class vizesorusu2 {
    public static void main(String[] args) {
        //Rastgele sayılardan oluşan 5 elemanlı bir 
        //dizi oluşturup bu dizinin  elemanlarının 
        //küplerinin toplamını bulan programı yazınız.
        
        int [] dizi=new int[5];
        // dizinin elemanlarını doldurduk
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*5+1);
        }
        //küpleri toplamını hesapladik
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=(int)Math.pow(dizi[i], 3);
        }
        
    }
}
