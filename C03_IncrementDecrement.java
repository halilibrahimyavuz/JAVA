package day04_IcrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
	// atama islemi olursa sayinin degeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama cikarma vs islemler
		//sadece o satirda yapilir sayinin degerinin kalici olarak 
		// degistirmez
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);//15
		// bu islem sayi1 in degerini 5 arttirip sayi1 e assign eder
		System.out.println(sayi1);//15
        
		System.out.println(sayi1+12);//27
		
		System.out.println(sayi1);//15
		
		sayi1++;	
		// her ne kadar = isareti gorunmesede sayi1 ++ isleminde assign vardir
		// dolayisiyla deger kalici olrak degisir
		System.out.println(sayi1);
		
		
		
		
		
           
	}

}
