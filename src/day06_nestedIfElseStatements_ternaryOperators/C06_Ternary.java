package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {
    public static void main(String[] args) {

        int sayi = 10;

        // verilen sayi pozitif ise degerini iki katina cikarin
        // pozitif degil ise degerini 10 artirin

        sayi = sayi>0 ? 2*sayi : sayi+10 ;

        // Ternary bize sonuc verir, bu sonucu ya direkt yazdirmaliyiz veya variable'a atamaliyiz
        System.out.println(sayi);
    }
}
