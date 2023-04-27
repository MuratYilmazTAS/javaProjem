package day21_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        // Calistigi anda sistemde var olan zamani alip saat variable'ina kaydeder
        // Kronometre gibi calismaz sadece 8. satirin calistigi zamani kaydeder
        // eger fakli satirlarin calisma zamanlarini gormek icistersek
        // o satirlarda localTime objeleri olusturmaliyiz
        System.out.println(saat);
        // zamani saat dakika saniye ve nano saniye olarak kaydeder

        System.out.println(saat.getNano()); // sadece nano saniyeleri getirir
        System.out.println(saat.getSecond()); // sadece saniyesini getirir
        // get() bize saatin istedigimiz bolumunu getirir.

        System.out.println(saat.withHour(14)); // bu sekilde sadece saatini benim istedigim sekilde degistirdi.
        System.out.println(saat.withHour(11).withSecond(0).withNano(0)); // 11:10
        // with() saatin istedigimiz bir bolumunu istedigimix yeni bir deger ile degistirerek zamani verir

        System.out.println(saat.plusHours(100)); // 100 saat sonra saatin kac olacagini yazdirdik
        System.out.println(saat.plusMinutes(10000)); // 10.000 dk sonra saatin kac olacagi
        System.out.println(saat.minusHours(37).minusMinutes(22));
        // plus() minus() saati istedigimiz miktarda ileri veya geri goturur

        LocalTime istenenZaman= LocalTime.of(12,23,15,10);
        System.out.println(istenenZaman);

        // iki zamani birbiriyle karsilastirmak istersek
        System.out.println(istenenZaman.isAfter(saat)); // true
        System.out.println(istenenZaman.isBefore(saat));// false

        System.out.println(saat.compareTo(istenenZaman));// -1
        System.out.println(istenenZaman.compareTo(saat)); // 1
        // iki zamani karsilastirir. kucukse negatif,buyukse pozitif bilgi doner



    }
}
