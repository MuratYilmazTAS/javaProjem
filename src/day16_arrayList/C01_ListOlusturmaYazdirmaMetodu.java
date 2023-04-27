package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaYazdirmaMetodu {
    public static void main(String[] args) {

       // olusturulan bir listeyi yazdiran bir method egzersizi

        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

        // method call: method cagirma
        listeYazdirma(isimler);
    }

    // yazi yazdirilacaksa void return type kullanilir
    public static void listeYazdirma (List<String> isimler){
        System.out.println(isimler); // [Ahmet, Murat, Muhammed, Sefa, Erhan]

    }
}
