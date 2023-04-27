package day18_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1);

        per1.personelIsmi = "Sevda";
        per1.personelAdresi = "Ankara";
        per1.personelTelefon = "5552344323";
        per1.personelTuru = "Hemsire";

        System.out.println(per1);

        // Bir obje olusturuldugunda o objenin ozellilelrini
        // atama yapmazsak class'daki ilk degerleri alacaktir
        //EGERo objenin kendine ozgu degerleri olmasini istiyorsak
        //atama yapmaliyiz

        C01_Hastane per2 = new C01_Hastane("Adem","Cankaya","5554323232","Doktor");
        System.out.println(per2);


        C01_Hastane per3 = new C01_Hastane ("Murat","Sincan","5322318778","Doktor");
        System.out.println(per3);

    }
}
