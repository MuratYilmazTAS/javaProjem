package day10_nestedForLoop_methodOlusturma;

public class C08_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {
        /*
        Java OOP consept'in en buyuk avantaji proje icerisinde
        1 kere olusturulan methodun her yerden rahatlikla kullanilabilmesidir

        Baska bir class'ta static keyword kullanilarak olusturulan methodlara
        classIsmi.methodIsmi(parametreler) seklinde ulasabiliriz
         */
        C07_methodOlusturma.ikiSayitopla(4,3); // Iki sayinin toplami : 7
        C09_FaktoryelDegeriYazdirma.faktoryelDegeriYazdir(6); //Iki sayinin toplami : 7
        C10_AsalsayiSonucuYazdirma.asalSayimiYazdir(57); //57 sayi asal degil
    }
}
