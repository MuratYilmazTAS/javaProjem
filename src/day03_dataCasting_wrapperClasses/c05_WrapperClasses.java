package day03_dataCasting_wrapperClasses;

public class c05_WrapperClasses {
    public static void main(String[] args) {

        int sayi = 10;
        //primitive data turlerinin hazir methodlari YOKTUR
        //Java primitive data turleriyle bazi methodlari kullanabilmemiz icin ozel Wrapper Classlar olusturmus

        Integer sayWrap = 10;
        /*
        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean
        Class'lari primitive data turleri ile ayni degerleri alabilir ayni data turlerindeki primitive
        ve Wrapper Class
        aralarinda hic bir Casting olmaksizin atama yapilabilir
         */

        sayWrap = sayi;
        sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str1 = "34";
        String str2 = "45";

        // Bu iki String icindeki sayilarin toplamini yazdirin
        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        char chr = 'm';
        System.out.println(Character.toUpperCase(chr));//M
        System.out.println(Character.isAlphabetic(chr));//true
        System.out.println(Character.isDigit(chr));//false

        Double dbl = 34.4;
        String doublestr= "44.3";
        System.out.println(Double.parseDouble(doublestr) -5); //39.3

    }
}
