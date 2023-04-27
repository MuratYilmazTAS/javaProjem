package day07_switchStatements_stringManipulation;

public class C06_charat_lenght {
    public static void main(String[] args) {


        String str= "Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";

        System.out.println(str.charAt(5));// g

        System.out.println(str.charAt(29));// r

        // str da toplam kac karakter var?
        System.out.println(str.length()); //30 lenght ve index karistirilmamali. index 0'dan baslar,lenght 1'den baslar

        // son harfi yazdirin
        int uzunluk = str.length();

        System.out.println(str.charAt(uzunluk -1 ));

        // son harften bir onceki harfi yazdirin,yani sondan ikinci harfi

        System.out.println(str.charAt(uzunluk - 2));

        // sondan ucuncu harfi yazdirin

        System.out.println(str.charAt(str.length() - 3));




    }
}
