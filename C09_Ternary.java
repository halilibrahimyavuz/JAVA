package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		
		// Kullanicidan 2 sayi alin buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi girin");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen bir sayi daha  girin");
		double sayi2=scan.nextDouble();
		System.out.println(sayi1>sayi2?sayi2:sayi1);
	
		scan.close();
		
	}
	
}
