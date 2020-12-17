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
public class soru5 {
    public static void main(String[] args) {
        int [] dizi={52,7,31,18,10,93,11,15,2,4,20};
        int [] enKucukElemanlar=new int [2];
        
        int min1=Integer.MAX_VALUE;
        for (int i = 1; i < dizi.length; i++) {
            if(dizi[i]<min1){
                min1=dizi[i];
            }
        }
        
        int min2=Integer.MAX_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            if(min1!=dizi[i] && dizi[i]<min2){
                min2=dizi[i];
            }
        }
        enKucukElemanlar[0]=min1;
        enKucukElemanlar[1]=min2;
        System.out.println(enKucukElemanlar[0]);
        System.out.println(enKucukElemanlar[1]);
    }
}
