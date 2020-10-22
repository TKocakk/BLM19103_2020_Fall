/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanıcı adı ve şifre giriniz: ");
        String kullanici=scan.next();
        String sifre=scan.next();
        if(kullanici.equals("admin")){
            if(sifre.equals("admin123")){
                System.out.println("Giris başarılı");
            }
            else{
                System.out.println("Girilen şifre hatalı");
            }
        }
        else{
            System.out.println("Gecersiz kullanici adi");
        }
    }
}
