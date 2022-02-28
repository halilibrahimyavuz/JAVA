package _07_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        String cümle = "Bugün hava oldukca güzel.";
        int aMiktarı = 0;

        for (int i = 0; i < cümle.length(); i++) {
            if (cümle.toLowerCase().charAt(i) == 'a') {
                aMiktarı++;
            } else {
                if (cümle.toLowerCase().charAt(i) == 'c') {
                    break;
                }
            }

        }
        System.out.println("c ye gelesıye kadar kı a sayısı :" + aMiktarı);


    }
}
