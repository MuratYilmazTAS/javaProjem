package day01_javayaGiris;

public class C02_Assigment {
    public static void main(String[] args) {

        int sayi;
        // Java deger atanmadan bir variable olusturulmasina izin verir ama
        // deger atanmadan kullanmaya izin vermez.

        // Javada yazdirma islemi yapilirken cift tirnak arasina yazila her sey
        // bir metin olarak algilanir ve ne yazarsaniz oraya yazdiginiz sekilde
        //konsolda yazdirir
        sayi = 20;


        /*
        sayi + 10 = sayi
        Javada esitligin sol tarafi variable dir. ve sol tarafta islem olmaz
        esitligin sag tarafi degerdir. burada islemler olabilir.
        Java = gordufgunde once esitligin sagini hesaplar sonra sag tarafta buldugu
        degeri soldaki variable a atama yapar.
         */
        System.out.println(sayi); //20
        sayi = sayi+10;
        System.out.println(sayi);//30

        sayi = 2 * sayi;
        System.out.println(sayi);//60

        // int sayi = 50
        // data turu yukarida tanimlanmisti
        // Java olusturulan bir variable'in data turunun degistirilmesine izin vermez
        // onun icin data turu sadece 1 kez yazilir.

    }
}
/*
Javada bir kodun alti kirmizi cizilirse orada Compile Time Error CTE vardir

Eger prijenin herhangi bir yerinde CTE varsa o projedeki hic bir Class calismaz

Eger bir variablein o satirdaki degerini yazdirmak izterseniz
sout icerisine variablein ismini yazmaniz yeterlidir.
 */
