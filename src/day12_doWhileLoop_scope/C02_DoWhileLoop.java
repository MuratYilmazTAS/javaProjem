package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Do while loop kontrol etmeden once bir kere loop'u calistirir

        while loop'ta loop body'sinin hic calismama ihtimali VARDIR
        d-while loop'da loop body'sinin hic calisama ihtimali YOKTUR
        loop body'si en az 1 kere calisir
         */

        // kullanicidan sayi degeri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin
        //ve toplami yazdirsin

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBiritmek icin 0'a basin");
            sayi = scanner.nextInt();
            toplam+=sayi;

        }while (sayi != 0);
    }
}
