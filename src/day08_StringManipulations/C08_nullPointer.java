package day08_StringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {

        /*
        null bir deger degildir
        null bir pointer'dir
        non-primitive datalara deger atanmadigini isaret eder
         */



        String str; // deger atanmadigi icin yazdirma islemleri yapilamiyor
       // System.out.println(str); // CTE  deger atanmadan yazdirma yapilamaz

        /*
        yinede deger atamasi yapmadan, bos olarak kalmasini lakin en azindan yeri geldigin zaman
        en azindan yazdirilabilmesini istiyorsak null pointer kullanilir
         */

        str=null; // str'a deger atanmadi sadece bos oldugunu javaya bildirdik
        System.out.println(str);
        /*
        yazdirma gibi islemlerde hata vermemesi icin bos degere null atamasi yapilir
         */

        //str.concat("Ali"); NullPointerException hatasi veriyor. null olan bir degerle method'lar kullanilamaz
        String test = ""; // burada testin icinde "" kayit altina alinmis. Kullanilabilir
        System.out.println(test.length());
        System.out.println(str+"Ali");

        Integer sayi = null;

        // str=null ,,, test="";
        System.out.println(test.isEmpty());
        //System.out.println(str.isEmpty()); // null pointer exception. bos olan bir seyin bos olup olmadigini kontrol edemeyiz
        /*
        null atamasi yapilan bir variable, hic bir method ile KULLANILAMAZ!
        yazdirilabilir veya + ile kullanilabilir
         */


    }
}
