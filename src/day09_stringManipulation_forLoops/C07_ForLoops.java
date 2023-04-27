package day09_stringManipulation_forLoops;

public class C07_ForLoops {
    public static void main(String[] args) {

        // verilen iki sayi ve aralarindaki tum tam sayilari toplayim yazdirin
        // iki sayidan hangisinin kucuk oldugu bilinmiyor

        int sayi1 = 100;
        int sayi2 = 20;
        int toplam = 0;


        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
        } else {

            for (int i = sayi1; i >= sayi2; i--) {
                toplam += i;

            }
            System.out.println(toplam);
        }
    }
}