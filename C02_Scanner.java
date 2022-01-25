package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	// kullanicidan deger almak icin 3 adim takip edilir
   //1. adim scanner objesi olusturmak
		
	Scanner scan=new Scanner(System.in);
	
	// ikinci adimda kullaniciya ne istedigimizi soylemek	
	
	System.out.println("lutfen isminizi yaziniz");
	
	String isim=scan.next();
	
	System.out.println("isminiz...:"+isim);
     	

	
   // scan bir scanner objesidir
   // isim olarak farkli bir isim yazsakta calisir ama biz scan demeyi tercih ederiz	
   // scan bir obja oldugu icin data turu non primitive dir
  //primitive data turleri sadece deger icerirken
  //non primitive data turleri degerin yaninda methodlar barindirir
   // scan, dedigimizde kullanabilecegimiz bu metodlari gorebiliriz
   	
	
	scan.close();
	
	
	
	
	}

}
