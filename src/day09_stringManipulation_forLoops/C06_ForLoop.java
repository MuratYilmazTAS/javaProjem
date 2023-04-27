package day09_stringManipulation_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {


        // kullanicidan 2 sayi alin ve bu sayilar dahil olacak sekilde aralarindaki 3 ile bolunebilen sayilari yazdirin.
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki pozitif tam sayi giriniz");

        int ilkSayi = scanner.nextInt();
        int ikinciSayi = scanner.nextInt();

        if (ilkSayi > ikinciSayi){
            System.out.println("Ilk sayi daha kucuk olmalidir");
        }else {
            for (int i = ilkSayi; i <=ikinciSayi ; i++) {

                if (i%3 == 0){
                    System.out.println(i + " ");
                }
            }
        }



    }
}
