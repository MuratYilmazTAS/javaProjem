package day12_doWhileLoop_scope;

public class Hastane {
    static String hastaneIsmi= "Yildiz hastanesi";
    static int personelSayisi;
     String personelismi;
    String personelAdresi;
    String personelTelefonu;

    /*
    Class level'da olusturulan variable'lar
    -eger tum nesneler icin ortak ise static olarak
    -her bir nesne icin farkli olacaksa intance olarak olusturulur.

    bu hastanede 500 personel varsa 500 personel icin
    500 isim, 500 adres, 500 telefon variable'i olmak zorundadir.
    Java bunu su sekilde cozmus:

    bu class'tan bir obje olusturuldugunda java tum instance variable'larin bir kopyasini olusturup
    o obje ile ilintilendirir.

    Tum class level variable'lar icin deger atama mecburiyeti yoktur
    eger deger atanirsa o deger gecerlidir. ancak deger atanmazsa java class level variable'lar icin
    default olarak belirledigi degerleri atama yapar.

    sayisal variable : 0
    boolean : false
    char : hiclik
    non-primitive : null
     */
    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // Yildiz hastanesi
        //System.out.println(personelIsmi);
        System.out.println(personelSayisi);

        Hastane aysehemsire = new Hastane();
        System.out.println(aysehemsire.personelAdresi);
        aysehemsire.personelAdresi= "Cankaya";
        aysehemsire.personelismi= "Ayse";
        aysehemsire.personelTelefonu="312235467";

        Hastane fatmaHemsire= new Hastane();
        fatmaHemsire.personelismi= "Fatma";
        fatmaHemsire.personelAdresi= "Yenimahalle";
        fatmaHemsire.personelTelefonu= "555453455";

        System.out.println(aysehemsire.personelismi);
        System.out.println(fatmaHemsire.personelismi);

        //static variable'lara direk erisim mumkundur.
        System.out.println(hastaneIsmi); // Yildiz hastanesi
        System.out.println(personelSayisi); // 0

        //obje uzerinden de static variable'lara ULASILABILIR
        // ancak intelliJ buna gerek yok diyerek bizi uyarir.
        System.out.println(aysehemsire.hastaneIsmi);
        // static olan hastaneIsmi variable'ina instance sekilde ulasildi diye uyari veriyor

        aysehemsire.hastaneIsmi="Levent hastanesi";

        System.out.println(hastaneIsmi);// Levent hastanesi
        System.out.println(fatmaHemsire.hastaneIsmi); // Levent hastanesi

    }
}
