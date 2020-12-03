
package Lab6;

/**
 *
 * @author Tugce Kocak
 */
public class Soru1 {
     public static void aralikYazdir(int sayi1,int sayi2){
         int kucuksayi=(sayi1<sayi2)? sayi1:sayi2;
         int buyuksayi=(sayi1>sayi2)?sayi1:sayi2;
         for (int i = kucuksayi; i <buyuksayi ; i++) {
             System.out.println(i);
         }
     }
    
    public static void main(String[] args) {
        aralikYazdir(3, 8);
    }
}
