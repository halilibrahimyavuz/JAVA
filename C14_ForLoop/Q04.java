package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("lutfen bır sayı gırınız");
            int sayi = scan.nextInt();
            if (sayi < 10 && sayi > 5) {
                System.out.println("5 ıle 10 arasındakı sayılar topanmayacak");
                continue;
            }


            toplam += sayi;
        }

        System.out.println("gırılen 5 sayıdan 5ıle 10 arasında olmayanların toplamı : " + toplam);


    }



    }

