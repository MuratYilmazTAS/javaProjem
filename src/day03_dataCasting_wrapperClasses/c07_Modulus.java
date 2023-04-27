package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class c07_Modulus {
    public static void main(String[] args) {

        System.out.println( 20 % 8);//4
        System.out.println(34875675 % 3); //eger sonuc 0 ise sayi 3 e tam bolunur

        // 12563412 sayisi 17nin tam kati midir?
        System.out.println(12563412 % 17); //tam kati degil

        // Kullanicidan pozitif bir tamsayi alip birler basamaginin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi%10 * girilenSayi%10);

        // girilen sayidan birler basamagini silip kalan sayiyi yazdirin
        // ornegin 213 girildiginde 21 yazdirsin

        System.out.println(girilenSayi / 10);


    }
}
