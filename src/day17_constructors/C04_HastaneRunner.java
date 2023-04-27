package day17_constructors;

public class C04_HastaneRunner {
    public static void main(String[] args) {
        /*
        // Biz bir obje olusturdugumuzda java once bu constructor un varligini teyit eder.
            Constructor varsa bu objeyi olusturur.
            Obje olusturulunca instance olan butun variable larin birer
            kopyalarini olusturur ve objeye iliskilendirir
            Objeye yeni bir atama yapmadigimiz muddetce objenin olusturuldugu class'taki
            ilk degerleri kullanir.

            obje uzrinden static variable'lara ulasmak istedigimizde Java once objeye gider
            o obje'ye ilisiklendirilen bilgilerde istenen variable'i bulamazsa
            class seviyesinde static variable'lara ulasir.

            static variable'lar class'a baglidir ve degistirilirse
            tum objeler icin degisiklik gecerli olur
         */

        C03_Hastane per1 = new C03_Hastane();
        System.out.println(per1.personelIsmi);
        per1.personelTuru = "Doktor";
        System.out.println(per1.maas("Doktor"));

        C03_Hastane per2 = new C03_Hastane();
        System.out.println(per2.personelTuru);

        System.out.println(per1.hastaneAdi);

        per2.hastaneAdi = "Java Hastanesi";
        System.out.println(per1.hastaneAdi);
    }
}
