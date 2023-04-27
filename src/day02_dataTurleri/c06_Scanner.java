package day02_dataTurleri;

import java.util.Scanner;

public class c06_Scanner {
    public static void main(String[] args) {
       //soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi= scanner.nextInt();

        System.out.println("girilen sayilarin toplami :"+(ondalikliSayi));
        System.out.println("Girilen sayilarin carpimi :"+ondalikliSayi*tamSayi);
    }
}
