package day16_arrayList;

import java.util.List;
import java.util.Scanner;

public class C15_ForEachLoop {
    public static void main(String[] args) {
        /*
        String'lerden olusan bir Liste icindeki kelimelerden "a" harfi
        iceren kelimeleri yazdirin
         */

        // daha once hazirlattigimiz kullanici liste olusturma methodu ile listeyi olusturuyoruz
        List<String> liste =  C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz harfi giriniz");
        String arananHarf = scan.next();
        // ahmet hasan veli
        // for each loop ile elemanlara teker teker ulasma

        for (String each: liste
             ) {
            if (each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
