package day02_dataTurleri;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
         int sayi1 = scanner.nextInt();
         int sayi2 = scanner.nextInt();

         sayi1 = sayi1 + sayi2;
         sayi2 = sayi1 - sayi2;
         sayi1 = sayi1 - sayi2;

        System.out.println("Sayi1 = " + sayi1 + " sayi2 = " + sayi2);

    }
}
