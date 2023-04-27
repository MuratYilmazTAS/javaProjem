package day08_StringManipulations;

public class C10_replaceAll {
    public static void main(String[] args) {

        // str icindeki butun sayilari method ile degistirin
        String str = "J23a33344va 23C5667a67n89d65i554r";
        /*
        replaceAll methodu , elemetleri ortak ozelliklerini kullanarak genel islem yapmak icin kullaniriz
         */
        System.out.println(str.replaceAll("\\d", "")); // Java candir
    }
}
