package Lab2;

public class soru1 {

    public static void main(String[] args) {

        int sayi = 3;
        int sayi2 = 5;
        // System.out.println(sayi+" "+sayi2+"");
        System.out.println("Merhaba" + sayi + sayi);
        System.out.println("Merhaba" + (sayi + sayi));

        int f0 = 0, f1 = 1, f2;
        f2 = f1 + f0;
        System.out.println("f0:" + f0 + " f1:" + f1);
        // f0=0
        //f1=1
        //f2=1
        f0 = f1;  //f0=1
        f1 = f2;   //f1=1
        f2 = f1 + f0; //f2=2

        System.out.println("f0:" + f0 + " f1:" + f1);

        f0 = f1;  //f0=1
        f1 = f2;   // f1=2
        f2 = f1 + f0;  //f2= 3

        System.out.println("f0:" + f0 + " f1:" + f1);

        f0 = f1;   //f0=2
        f1 = f2;   //f1=3
        f2 = f1 + f0;   //f2=5

        System.out.println("f0:" + f0 + " f1:" + f1 + " f2:" + f2);

    }
}
