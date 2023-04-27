package day05_ifElseStatements;

import java.util.Scanner;

public class C12_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi 3 ile bolunebiliyorsa Uc ile bolunebilen sayi
        // 5 ile bolunebiliyorsa Bes ile bolunebilen sayi yazdirin
        // hem 3 hemde 5 ile bolunebiliyorsa SUPER yazdirin
        // ikisine de bolunemeyen sayilar icin YAZIK yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi %5 == 0) {
            System.out.println("SUPER");
        }

        else if (girilenSayi % 3 == 0){
            System.out.println(" 3 ile bolunebilen sayi");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("5 ile bolunebilen sayi");
        }else {
            System.out.println("YAZIK");
        }
    }
}
