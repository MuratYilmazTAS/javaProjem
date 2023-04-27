package day20_passByValue_ImmutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {
    public static void main(String[] args) {

        /*
        Java'da zaman ve tarih ile ilgili pek cok class vardir.
        biz 3 class gorecegiz
        -LocaleTime class'i saat ile ilgili methodalr icerir.

         */

        LocalTime saatBaslangic = LocalTime.now();
        //LocalTime.now() bulundugu satir calistiginda bilgisayarin saatini alip kaydeder
        // saat variable'i canli bir kronometre degil,
        //bulundugu satirin calistigi zamani kaydeden bir variable'dir.

        System.out.println(saatBaslangic);

        int toplam = 0;

        for (int i = 0; i <= 10000 ; i++) {
            toplam +=i;
        }

        System.out.println(toplam); // 50005000 0 dan 10000 e kadar olan sayilari topladik
        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis);

        LocalTime saat = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat);

        LocalTime saat2 = LocalTime.of(11, 20, 25);
        System.out.println(saat2);

        LocalTime saat3 = LocalTime.ofSecondOfDay(10000);
        System.out.println(saat3); // 02:46:40 10.000.ci saniyenin nerede oldugunu gosteriyor.
    }
}
