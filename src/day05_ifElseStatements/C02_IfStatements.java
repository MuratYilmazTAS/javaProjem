package day05_ifElseStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdir
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int girilensayi= scanner.nextInt();
        if (girilensayi % 3 == 0) System.out.println("3 ile bolunebilen sayi");
        if (girilensayi % 5 == 0) System.out.println("5 ile bolunebilen sayi");
    }
}
