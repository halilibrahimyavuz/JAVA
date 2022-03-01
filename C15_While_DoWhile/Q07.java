package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner scan = new Scanner(System.in);


        String str="";
        do {
            System.out.println("bır karakter gırınız");
            str = scan.nextLine();
            if (!str.equals("x")){
            System.out.println("program calısıyor");}
        } while (!str.equals("x"));
        System.out.println("Program bitti.");
        /*
                do {
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) break; // break : döngü kırıyor

            System.out.println("Program çalışıyor");
        } while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");

         */

    }
}
