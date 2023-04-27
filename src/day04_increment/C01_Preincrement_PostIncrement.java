package day04_increment;

import java.util.Scanner;

public class C01_Preincrement_PostIncrement {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin. Girilen tamsayiyi yazdirip sonra 1 artirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);
        girilenSayi++;

        //Kullanicidan bir sayi daha alin bu sayiyi once artirin sonra yazdirin
        System.out.println("Lutfen bir tamsayi daha girin");

        int girilenSayi2= scanner.nextInt();
        girilenSayi2++;
        System.out.println("Girilen sayi : " +girilenSayi2);
        System.out.println("Kodun sonunda GS : " +girilenSayi +  " GS2 : " +girilenSayi2);
    }
}
