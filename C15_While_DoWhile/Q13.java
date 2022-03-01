package _08_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kac adet urun aldıgınız gırınız");
        int ürünSayısı= scan.nextInt();
        int toplamTutar=0;
        int sayaç =1;

        while (sayaç<=ürünSayısı){
            System.out.println("lutfen "+sayaç+". ürün fiyatını gırınıuz");
            int fiyat= scan.nextInt();
            toplamTutar+=fiyat;
            sayaç++;
        }
        System.out.println("toplam "+ürünSayısı+"ürün alınmıstır \n " +
                "toplam tutar :"+toplamTutar  );

        System.out.println("alısverıs kartınız varsa Evet yoksa Hayır yazınız");
        char müsteriKartı=scan.next().toUpperCase().charAt(0);

        if (müsteriKartı=='E') {
            if (ürünSayısı >= 10) {
                System.out.println("müsteri kartınız oldugu için ve 10 üründen fazla aldıgınız ıcın\n " +
                        "toplam fıyat uzerınde yuzde 20 ındırım yapılmıstır\n" +
                        "Indırımlı fıyatınız  : " + (toplamTutar - (toplamTutar * 20 / 100)));

            } else {

                System.out.println("musterı kartınız oldugu için toplam fıyat uzerınden yuzde 15 ındıırm yapılmıstır \n" +
                        "indirimli toplam tutarınız :" + (toplamTutar - (toplamTutar * 15 / 100)));
            }
            System.out.println("GÜLE GÜLEE******");

        } else  if (müsteriKartı!='E') {
                if (ürünSayısı >= 10) {

                    System.out.println("10 urunden fazla laısverıs yaptıhınıziçin  yuzde 15 ındıırm yapılmıstır \n" +
                            "indirimli toplam tutarınız :" + (toplamTutar - (toplamTutar * 15 / 100)));
                } else {

                    System.out.println("Magazamızı tercıh ettıgınız ıcın yuzde 10 ındıırm yapılmıstır \n" +
                            "indirimli toplam tutarınız :" + (toplamTutar - (toplamTutar * 10 / 100)));
                }
            }
            System.out.println("GÜLE GÜLEE******");

        }



        }







