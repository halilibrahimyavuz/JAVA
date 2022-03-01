package _08_While_DoWhile;

public class WhileLOopNotları {
    /*belli durumlarda sonlandırmak ıstedıgımızde dongulerde kullanılabılır
    ornegın atm den ıslemler yapıyorsun adece CIKIS butonuna basınca dongu sonlanıyor
    WHILE dondu yapısı
    while (kosul )--> kosul dogru oldugu surece true oldugu surece dondu donmeye devam eder
    işlem1
    işlem 2
    artırma yada azaltma --> bır yerden sonra false cıkması ıcın
    true oldugu surece dondu donmeye devam eder
    ılk kosul false olursa hıc calısmaz



     */
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            System.out.println("JAVA");
        i++;
        }
        System.out.println("dongu bıttı");

        int sayi=5;
        int fak=1;

        while(sayi!=0){
            fak=sayi*fak;
            sayi--;

        }
        System.out.println(fak);


    }
}
