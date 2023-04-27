package day17_constructors;

public class C05_Hastane {
    /*
    Bir class'ta gorunurde bir constructor yoksa
    default constructor vardir

    default constructor parametresiz bir constructor'dir
    ve body'sinde hic bir kod bulunmaz

    default constructor asagida verilen constructor'a benzer
    C05_Hastane(){

    }

    ancak bir constructor gorunur ise artik ona default constructor demeyiz
    parametresi yoksa ona parametresiz constructor diyebiliriz.

    biz herhangi bir constructor olusturursak
    Java default constructor'i siler
    yani bir class'ta gorunur bir constructor varsa
    DEFAULT CONSTRUCTOR yoktur diyebiliriz.



     */

    C05_Hastane(){
        System.out.println("parametresiz kod calisti");
    }
    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "03123454545";
    String personelIsmi = "isim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "personel turu belirtilmedi";

    public int maas() {
        switch (personelTuru) {
            case "Doktor":
                return 5000;

            case "Hemsire":
                return 3000;

            case "Bashemsire":
                return 4000;
            default:
                return 1900;

        }
    }
}
