package day08_StringManipulations;

public class C09_replace {
    public static void main(String[] args) {
        /*
        bir yazi icerisinde belli basli harfleri veya kelimeleri istedigimiz baska
        bir unsur ile degistirmek icin kullanilir
         */

        String str = "Javasiz olmaz";
        System.out.println(str.replace('J', 'H')); // havasiz olmaz
        System.out.println(str.replace("a", "")); // Jvsiz olmz
        System.out.println(str.replace("Javasiz", "X")); // X olmaz
        System.out.println(str.replace("va", "lallala")); // Jalallalasiz olmaz

        System.out.println(str); // Javasiz olmaz. atama yapmadigimiz icin ilk degeri yazdiriyor
        /*
        atama yapilmadigi surece yapilan degisiklikler sadece o satir icinder.
        atama yapilana kadar kalici olmaz
         */
        str = str.replace("va", "lallala"); // atama yapildi
        System.out.println(str); // artik str Jalallalasiz olmaz olarak yazdiracak

        // str1 icindeki bosluklari yok edin
        String str1 = "Java ile hayat Cok daha guzel";
        System.out.println("str1 = " + str1); //str1 = Java ile hayat Cok daha guzel
        str1 = str1.replace(" ","");
        System.out.println("str1 = " + str1); //str1 = JavailehayatCokdahaguzel

        String str2 = " java hayattir";
        System.out.println(str2.replaceFirst("a", "X")); // replaceFirst kullanilirsa sadece ilk degistirilmek isteneeni degistirir


    }
}
