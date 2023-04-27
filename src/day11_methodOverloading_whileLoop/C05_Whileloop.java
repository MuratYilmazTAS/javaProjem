package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_Whileloop {



    // Kullanicidan bir sayi alip3 ile bolunup bolunemedigini yazdirin
    // Kullanici 3 ile bolunebilen bir sayi girinceye kadar tekrar deger isteyin
    /*
    tekrar sayisi tam olarak bilinmeyen
    tekrar sayisi farkli bir sarta bagli olan durumlarda while loop kullaniriz
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // girilen sayi 3 e bolunebilene kadar tekrar et
        // while loop'ta icine yazilan sart saglanmadigi muddetce kod tekrar calisir
        int sayi=2;

        while (sayi %3 !=0){
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            sayi = scanner.nextInt();

            if (sayi%3==0){
                System.out.println("sayi 3 ile tam bolunuyor");
            }else {
                System.out.println("sayi 3 ile tam bolunemiyor");
            }
        }
    }

}
