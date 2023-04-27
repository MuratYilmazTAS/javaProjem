package day11_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*
         overloading : asiri yukleme

         Bir class'da ayni isme sahip birden fazla nethod olmasina denir
         *Javada bir class icerisinde ayni isim, ayni sayida ve data turunde
         paraetre ile olusturulursa CTE (compile time error) verir

         bunun 3 cozumu vardir
         1- parametre sayisi degistirilebilir
         2- parametrelerin data turleri degistirilebilir
         3- farkli data turunde parametrelerin yeri degistirilebilir

         Java bir method call oldugunda ayni isimdeki birden fazla methoddan hangisinin
         calisacagini belirlemek icin argument - parametre uyumuna bakar
         */

        topla(5,8);  // iki int'in toplami : 13
        topla('a', 'b'); // iki char'in toplami : 195
        topla(3.4, 5); // double ve int'in toplami : 8.4
        topla(5,2.1); // int'in ve double'in toplami : 7.1



    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("Iki int'in toplami : " + (sayi1 + sayi2));
    }

    public static void topla(int a, int b, int c) {
        System.out.println("uc int'in toplami : " + (a + b));
    }

    public static void topla(char char1, char char2) {
        System.out.println("iki char'in toplami : " + (char1 + char2));

    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("int'in ve double'in toplami : "+(sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2) {
        System.out.println("double ve int'in toplami : " + (sayi1 + sayi2));
    }
}