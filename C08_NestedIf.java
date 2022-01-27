package day08_IfElseStataments;

import java.util.Scanner;

public class C08NestedIf {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//calisan erkekse 65 yasindan buyukse emekli oabilir

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen cinsiyetinizi giriniz \nErke icin E , Kadin icin K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		double yas =scan.nextDouble();
		
		if (cinsiyet=='E') {
			
		if (yas>=65) {
			
			System.out.println("Erkek Emekli olabilirsin");
			
		} else {
			System.out.println("Erkek Emekli olamazsin");
			
		}	
			
			
		} else if(cinsiyet=='K') {
          
			if (yas>=60) {
				System.out.println("Kadin Emekli olabilirsin");
			} else {
				System.out.println("Kadin Emekli olamazsin");
			}
			
			
			
  		}else {
  			System.out.println("Lutfen cinsiyet icin gecerli bir harf secin");
  		}
		
		
		scan.close();
	}

}
