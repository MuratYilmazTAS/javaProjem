package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C13_ListeOlusturmaVeElemanEkleme {
    public static void main(String[] args) {

        // once liste+ elemanlarin turu+ isim = new LinkedList<>();
        List<String> isimListesi = new ArrayList<>();

        isimListesi.add("Hasan");
        isimListesi.add("Mehmet");
        isimListesi.add("Veli");
        isimListesi.add("Ars");
        isimListesi.add("Murat");
        isimListesi.add("Mustafa");
        System.out.println(isimListesi);
    }
}
