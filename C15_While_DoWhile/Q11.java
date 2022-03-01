package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("tamkare kontrolu için bir sayi giriniz");
        int sayi= scan.nextInt();

        int sayaç=0;
        boolean b=false;

        while (sayaç*sayaç<=sayi){
            if (sayaç*sayaç==sayi){
                System.out.println( sayi+" sayisi ===> TAMKARE ");
                b=true;
            }
                  sayaç++;
        }
        if (b==false) System.out.println(sayi+" sayisi TAMKARE DEGİL");


    }
}
