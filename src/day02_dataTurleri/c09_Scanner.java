package day02_dataTurleri;

import java.util.Scanner;

public class c09_Scanner {
    public static void main(String[] args) {

       // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");

        double sayi1 = scanner.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = scanner.nextDouble();

        //Mesela sayi1= 10 , sayi2= 20 , temp=0

        double temp= 0;

        temp = sayi2;

        //Mesela sayi1= 10 , sayi2= 20 , temp=20

        sayi2= sayi1;

        //Mesela sayi1= 10 , sayi2= 10 , temp=0

        sayi1= temp;

        //Mesela sayi1= 20 , sayi2= 10 , temp=20

        System.out.println("Sayilarin yerini degistirdim" +
                "\nartik sayi1 : " +sayi1 + ", sayi2 : " + sayi2);










    }
}
