package Lab7;

import java.util.Scanner;

/**
 *
 * @author Tugce Kocak
 */
public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        switch(sayi){
            case 1: System.out.println("Ocak");break;
            case 2: System.out.println("Şubat");break;
            case 3: System.out.println("Mart");break;
            case 4: System.out.println("Nisan");break;
            case 5: System.out.println("Mayıs");break;
            case 6: System.out.println("Haziran");break;
            case 7: System.out.println("Temmuz");break;
            case 8: System.out.println("Agustos");break;
            case 9: System.out.println("Eylül"); break;
            case 10: System.out.println("Ekim"); break;
            case 11: System.out.println("Kasım"); break;
            case 12: System.out.println("Aralık"); break;
            default: System.out.println("1-12 arası bir sayı giriniz");
        
        }
    }
}
