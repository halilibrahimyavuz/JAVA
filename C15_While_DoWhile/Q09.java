package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("pin code  giriniz : ");
        int userPin = scan.nextInt();
        int systemPin=1453;

        while(userPin!=systemPin){
           System.out.println("gırılen sıfre yanlıs");

            System.out.println("dogru sıfreyı gırınız");
            userPin = scan.nextInt();


        } System.out.println("BASARILI GIRIS YAPILMISTIR");

    }
}

