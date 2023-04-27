package day08_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        /*
        contains methodu bir yazi parcaciginin baska bir yazi
        icerisinde olup olmadigini kontrol eder.
        ege iceriyorsa true, eger icermiyorsa false cevabini bize verir (dondurur)
         */

        String str = " Java ile hersey cok kolay";
        System.out.println(str.contains("java")); // false yazdi cunku biz j'yi kucuk harfle yazdik
        System.out.println(str.contains("Java")); // true cunku j'yi buyuk harfle yazdik

        String arananKelime ="cok";

        System.out.println(str.contains(arananKelime)); // true
        String olmayankelime = "Deniz";

        System.out.println(str.contains(olmayankelime)); //false

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); //true cunku hiclik var. yani hic birsey var olarak algilar Java.


    }
}
