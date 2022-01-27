package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumlalari {

	public static void main(String[] args) {
	
        /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Gun Isimlerinden Birinin Ilk HArfini Giriniz");
		//Kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yapabilirsiniz
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi veya Persembe   ");
		}
		if (ilkHarf=='S') {
			System.out.println("Sali");
		}
		if (ilkHarf=='C') {
			System.out.println("Carsamba Cuma Cumartesi");
		}
		if (ilkHarf!='C' &&ilkHarf!='P' &&ilkHarf!='S' ) {
			System.out.println("Gecersiz HArf Girildi!!!!!"
					+ "Lutfen gun isimlerinden birinin bas harfini yaziniz");
		}
		
		
		scan.close();
		
		
		
	}

}
