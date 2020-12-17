
package Lab7;

/**
 *
 * @author Tugce Kocak
 */
public class Soru2 {
    public static void main(String[] args) {
        int[] dizi={3,5,6,77,89,7,8,9};
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>5 && dizi[i]<8){
                toplam+=dizi[i];
            }
        }
        System.out.println("5-8 arası elemanların toplamı= "+toplam);
    
        // 2. gezinme yöntemi
        toplam=0;
        for (int eleman : dizi) {
            if(eleman>5 && eleman<8){
                toplam+=eleman;
            }
        }
        System.out.println("5-8 arası elemanların 2. toplamı= "+toplam);
    
    }
}
