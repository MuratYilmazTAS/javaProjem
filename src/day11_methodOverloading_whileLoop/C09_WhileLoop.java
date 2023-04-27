package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere pozitif tam sayilar isteyin
        // kullanici sifira basana kadar isleme devam edin
        //kullanici sifira bastiginda girdigi pozitif tam sayi adedini ve toplamini yazdirin
        //kullanici negatif sayi girerse uyari  verin ve o sayiyi adete eklemeyin

        Scanner scanner = new Scanner(System.in);
        int sayi = 1; // sifira basinca islem biteceginden burada sifirdan farkli deger kullandim
        int sayac = 0;
        int toplam = 0;


        while (sayi != 0){
            System.out.println("toplamak uzere pozitif tamsayi girin \nBitirmek icin 0'a basin");
            sayi = scanner.nextInt();

            if (sayi>0){
                sayac++;
                toplam +=sayi;
            } else if (sayi<0) {
                System.out.println("pozitif tamsayi girmelisiniz");

            }
        }
        System.out.println("Girdiginiz " +sayac + " adet pozitif sayinin toplami : " +toplam);

    }
}
