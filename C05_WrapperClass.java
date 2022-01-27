package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		//int sayi1=10;
		//Integer sayi2=20;
		
		//sayi1 yazdigimizda hic bir method cikmaz cunku sayi1 intdir primitivedir
		//sayi2. yazdigimizda ise bircok method geliyor cunku sayi2 non-primitive oldu
		//Wrapper dir sayi2
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);//35789873245434
		
		// bu sayilari toplamak istersek 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));// burda 2 sayiyi topladi
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE);// E308 10 uzeri 308 demek
		
		System.out.println(Short.MAX_VALUE);
		
		//String caddeNo="B203";
		String caddeNo="203";
		String sokakNo="1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		//Integer.valueOf(String numerik ifade) icine rakam yazarsan toplama yapar
		//Methodu String olarak kaydedilis numarik ifadeleri sayiya cevirir ancak 
		//String ifadede numerik olmayan
		//bir karakter olursa java su hatayi verir NumberFormatException stops execution
		
		
		System.out.println("Hello World");
		
		
		
		
		
		
		
		
		
		

	}

}
