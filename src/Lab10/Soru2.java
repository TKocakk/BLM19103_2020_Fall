/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru2 {
    static double zamliMaasHesapla(int yas,double maas){
        if(yas<24 && maas<1000){
            maas+=maas*38/100;
        } 
        else if(24<=yas && yas<36 && maas>3000 && maas<4000){
            maas+=maas*24/100;
        }
        else if(yas>=36 && maas<4000){
            maas+=maas*21/100;
        }
        return maas;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int yas=scan.nextInt();
        System.out.println("Maasınızı giriniz: ");
        double maas=scan.nextDouble();
        double zamliMaas=zamliMaasHesapla(yas, maas);
        System.out.println("Yeni zamli maaşınız= "+zamliMaas);
    }
}
