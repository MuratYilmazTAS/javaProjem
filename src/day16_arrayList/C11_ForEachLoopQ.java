package day16_arrayList;

import java.util.Scanner;

public class C11_ForEachLoopQ {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        // java
        // 1- split ile "" parcaliyoruz
        // 2- forEachLoop ile harfler teker teker kontrol edilir
        // 3- istenilen harfe denk gelindiginde sayac 1 artirilir
        // 4- sayac 0 ise "harf cumlede kullanilmamis",,, sifirdan fazla ise kac kere kullanildigi yazdirilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = scan.next();
        System.out.println("Lutfen aranan harf giriniz");
        String arananHarf = scan.next();

        //String str = "Java ile her sey cok kolay";
       // String arananHarf = "a";

        String[] arr = str.split("");

        int sayac = 0;
        for (String each : arr
             ) {

            if (each.equals("a")){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("harf cumlede hic kullanilmamis");
        } else {
            System.out.println("aranan harf cumle icinde " + sayac +" kere kullanilmis");
        }

    }
}
