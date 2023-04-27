package day07_switchStatements_stringManipulation;

public class C08_contains {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");
        // Normalde non-primitive data turundeki objeler, new keyword'u ile olusur
        // String'i de new keyword'u ile olusturabiliriz
        // ancak Java bizim isimizi kolaylastirmak icin String'e direk deger atamasi da saglamistir.

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str4.equals(str5)); // false
        System.out.println(str2.equals(str6));

        /*
        egulas () verilen iki String'in metin olarak ayni olup olmadigina bakar.
        dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir cunku case sensetive'dir
         */

        // String icin == kullanamaz miyim?
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str6); // false Java == Java
        /*
        equals methodu sadece degerler bakar
        metin ayni ise sonuc true, metin farkli ise sonuc false olur.
        == ise hem metin degerine hem de referansa bakar

        ileride anatacagimiz uzere Java bazen ayni referanslari farkli objelere de verir
        bu konuyu ileride detaylandiracagiz
        SIMDILIK
        iki String'in metin olarak ayni oldugunu kontrol etmek isterseniz equals method'u kullanmalisiniz
         */


    }
}
