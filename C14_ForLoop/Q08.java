package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cümle = scan.nextLine();

        String terstenCümle = "";


        for (int i =cümle.length()-1; i >=0 ; i--) {
            terstenCümle+=cümle.charAt(i);
        }
            if (terstenCümle.equals(cümle)){
                System.out.println("cumle palindromdur");
            }else{
                System.out.println("cümle palindrom degildir");
            }



    }

}

