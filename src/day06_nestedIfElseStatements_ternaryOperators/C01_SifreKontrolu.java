package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin
        sifre asagidaki 4 sarti sagliyorsa "Sifreniz Kaydedildi" yazdirin

        Saglanmayan sartlarin tamamini kullaniciya soyleyin
        1-sayi 4 basamakli olmalidir
        2- Sayi 3 ile bolunebilmelidir
        3-Sayi 5 ile bolunememelidir
        4-Sayinin 1'ler basamagi tek sayi olmalidir
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        boolean sayiMukemmelMi=true;

        if (sayi<1000 || sayi>9999){
            System.out.println("sayi 4 basamakli olmalidir");
            sayiMukemmelMi=false;
        }
        // sayi 3 ile bolunebilmelidir
        if (sayi%3!=0){
            System.out.println("sayi 3 ile bolunebilmelidir");
            sayiMukemmelMi=false;
        }
        // sayi 5 ile bolunememelidir
        if (sayi%5==0){
            System.out.println("sayi 5 ile bolunememelidir");
            sayiMukemmelMi=false;
        }
        //sayinin 1ler basamagi tek sayi olmalidir
        if ((sayi%10)%2==0){
            System.out.println("sayinin birler basamagi tek sayi olmalidir");
            sayiMukemmelMi=false;

            }
        if (sayiMukemmelMi){
            System.out.println("sayi mukemmel");
        }
    }
}
