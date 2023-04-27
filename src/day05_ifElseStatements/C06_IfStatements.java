package day05_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        /*
        Onceki sorulardan farkli olarak bu soruda iki if birbirine baglidir
        iki if,den sadece 1 tanesi calisir
        ikisinin de birden calisma ihtimali yoktur
        ikisininin de calismama ihtimali yoktur
         */
        if (not>=50) {
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }


    }
}
