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
public class soru5 {
    public static void main(String[] args) {
        int toplamTek=0;
        int toplamCift=0;
//        for (int i = 1; i < 50; i++) {
//            if(i%2==1){
//                toplamTek+=i;
//            }else{
//                toplamCift+=i;
//            }
//        }
//        System.out.println("Cift sayıların toplami= "+ toplamCift);
//        System.out.println("Tek sayıların toplami= "+ toplamTek);
//        
        int i=1;
        while(i<50){
            if(i%2==1){
                toplamTek+=i;
            }else{
                toplamCift+=i;
            }
            i++;
        }
        
       System.out.println("Cift sayıların toplami= "+ toplamCift);
       System.out.println("Tek sayıların toplami= "+ toplamTek);
    
        
    }
}
