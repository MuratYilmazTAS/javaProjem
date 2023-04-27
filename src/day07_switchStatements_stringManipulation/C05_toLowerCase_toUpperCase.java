package day07_switchStatements_stringManipulation;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Candir";

        // tumunu buyuk harf yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        //str'i buyuk harfle yazilmis haline donusturun
        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        // STR'I TURKCE KARAKTERLERI DIKKATE ALARAK KUCUK HARFE CEVIRIN

        System.out.println(str.toLowerCase()); // java candir

        // str'i Turkce karakteri dikkate alarak kucuk harfe cevirin

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // java candir'i turkcedeki I harfiyle yazar

        String str2 = "Kimse beni aramiyor";
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
