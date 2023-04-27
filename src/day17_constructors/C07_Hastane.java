package day17_constructors;

public class C07_Hastane {


         /*
         biz gorunur bir costructor olusturdugumuzda
         java default constuctor'i siler

         biz gorunur constructor olusturdugumuzda, daha once
         default constructor'i kullanarak objeler
         CTE verir

         boyle bir soruna sebep olmamak icin gorunur bir constructor olusturdugumuzda
         default cnstructor'in islevini yapan
         parametresiz bir constructor da olustururuz
          */
    public C07_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }
    public C07_Hastane(){
        System.out.println("Parametresiz constuctor calisti");
    }

    @Override
    public String toString() {
        return "C07_Hastane{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", personelTuru='" + personelTuru + '\'' +
                '}';
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
