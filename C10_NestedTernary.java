package day10_ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		//Verilen Karakter icin  kucuk ise consolda kucuk harf yazdirin
		//buyuk harf ise consola buyuk harf yazdirin
		//yoksa girdiginiz karakter harf degil yazdirin
		
		char krk='&';
		
		//String sonuc=(krk>='a'&&krk<='z')? "Kucuk Harf" :
		//	(//sart yanlis ise sonuc);
		
		String sonuc=(krk>='a'&&krk<='z')? "Kucuk Harf" :(
				(krk>='A'&& krk<='Z')? "Buyuk harf":"Girilen karakter harf degil");
		
		System.out.println(sonuc);
		
		
		

	}

}
