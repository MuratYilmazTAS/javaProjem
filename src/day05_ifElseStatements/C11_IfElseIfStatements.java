package day05_ifElseStatements;

import java.util.Scanner;

public class C11_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi 3 ile bolunebiliyorsa Uc ile bolunebilen sayi
       // 5 ile bolunebiliyorsa Bes ile bolunebilen sayi yazdirin
        // hem 3 hemde 5 ile bolunebiliyorsa SUPER yazdirin
        /*
        Not:  coklu if else bloklari
        else ile biterse turm durumlari kapsiyor demektir ve her durumda bir if body'si calisir
        ancak, else ile bitmiyorsa bu durumda bazi degerler icin kodumuz calisir ama hic bir
        if body'si calismayabilir
         */


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
        }


        }
    }

