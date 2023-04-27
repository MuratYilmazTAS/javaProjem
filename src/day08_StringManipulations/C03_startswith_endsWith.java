package day08_StringManipulations;

public class C03_startswith_endsWith {
    public static void main(String[] args) {

        /*
        bir yazinin (str), bir yazi parcacigi ile baslayip baslamadigini test ederek
        true veya false cevabini verir( dondurur)         */

        String str = "Java cok eglenceli";

        System.out.println(str.startsWith("java")); // false cunku kucuk harfle yazdik
        System.out.println(str.startsWith("Java")); /// true

        System.out.println(str.startsWith(str)); // true cunku her yazi kendisi ile baslar ve kendisi ile biter

        System.out.println(str.startsWith("")); //true cunku hiclik var

        System.out.println("====================");

        /*
        endWith methodu istenilen bir yazinin,belli bir yazi parcacicigi ile bitip bitmedigini kontrol eder
         */

        System.out.println(str.endsWith("a")); // false
        System.out.println(str.endsWith("eglenceli")); // true
        System.out.println(str.endsWith("celi")); // true
        System.out.println(str.endsWith("Java cok eglenceli")); //true

        System.out.println(str.length()); // 18

        System.out.println(str.substring(str.length()-3)); // eli
        System.out.println(str.endsWith(str.substring(str.length() - 3))); // true

    }
}
