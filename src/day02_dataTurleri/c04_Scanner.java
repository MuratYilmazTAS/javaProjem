package day02_dataTurleri;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin girilen sayinin 2 katini yazdirin

        // 1- Scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        //2- Kullaniciya ne istedgimizi soyleyin

        System.out.println("Lutfen bir tamsayi giriniz");

        //3- kullanicinin girecegi data turune gore bir variable olusturun
        // Scanner objesi ile variable a uygun hazir methodu kullanip
        // kullanicidan degeri alin ve olusturdugumuz variable a atayin

        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiginiz sayinin iki kati : " + 2 * girilenSayi);

    }
}
