package day17_constructors;

public class C02_ConstructorRunner {
    public static void main(String[] args) {
        // bu class'tan C01 classindaki variable
        // ve methodlara ulasmak istiyorum

        //Baska class'taki static class uyelerine
        // ulasmak icin


        System.out.println(C01_Constructors.isHappy);
        C01_Constructors.staticMethod();


        // static olmayan class uyelerine ulasmak icin
        // o class'tan obje olusturmamiz lazim

        C01_Constructors obje = new C01_Constructors();
        //bastaki C01_Constructors ==> class adi ve objenin data turudur
        // obje ==> objenin ismi
        //new ==> yeni obje olusturmak icin keyword
        /*
         C01_Constructors() ==> Constructor
         Bir objenin olusturulmasi ve ilk deger atamasinin (initials)
         yapilmasi icin mutlaka constructor calismalidir

         Java bir class olusturuldugunda
         o class'dan obje olusturulabilmesi icin
         her class'a otomatik olarak
         default bir constructor yerlestirir

         bu default constructor'lar gorunmez
         */
        System.out.println(obje.str);
        obje.sayi=20;
        obje.staticOlmayanMethod();


    }
}
