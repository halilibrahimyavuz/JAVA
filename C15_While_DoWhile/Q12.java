package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("topun dustugu yukseklıgı cm olarka gırınız");
        int yükseklik= scan.nextInt();
        int yereVurmaSayacı=0;
        int toplamMesafe=0;
        int ilkYükseklik=yükseklik;

        do {
            toplamMesafe+=yükseklik;
            yükseklik=yükseklik*3/4;
            toplamMesafe+=yükseklik;
            yereVurmaSayacı++;

        }while (yükseklik>=100);

        System.out.println("topun ilk atıldıgı yükseklik :"+ilkYükseklik+"cm");
        System.out.println("topun almıs oldugu toplam mesafe : "+toplamMesafe+"cm");
        System.out.println("top "+yereVurmaSayacı+" kez yere vurmuştur");


    }
}
