
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru2 {

    static double Carpma(double sayi1, double sayi2){
       double carpim=sayi1*sayi2;
       return carpim;
      
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki double sayı giriniz:");
        double sayi3=scan.nextDouble();
        double sayi4=scan.nextDouble();
        System.out.println(Carpma(sayi3, sayi4));
    }
}
