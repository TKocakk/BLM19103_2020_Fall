/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru7 {
    static int faktoriyel(int x){
        int faktoriyel=1;
        int i=1;
        while(i<=x){
            faktoriyel*=i;
            i++;
        }
        return faktoriyel;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        while(sayi!=-1){
            System.out.println(sayi+"!= "+faktoriyel(sayi));
            sayi=scan.nextInt();
        }
    }
}
