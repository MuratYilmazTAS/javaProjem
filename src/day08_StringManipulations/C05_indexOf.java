package day08_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        // indexOf methodu aranan yazi parcaciginin, yazi icerisindeki index'ini bize cevap olarak verir (dondurur)

        String str = "Java en en iyisi ";

        System.out.println(str.indexOf("e")); // 5
        System.out.println(str.indexOf("a")); // 1 Java ilk buldugunu getirir

        System.out.println(str.indexOf("en")); // 5 cunku ilk yazdigimizi getirdi

        System.out.println(str.indexOf("yi")); // 9
        System.out.println(str.indexOf("")); // 0 cunku ilk index sifirdir. hiclikten dolayi sifir yazdi
        System.out.println(str.indexOf("iyisi")); //8
        System.out.println(str.indexOf("is"));// 10
        System.out.println(str.indexOf("iy"));// 8
        System.out.println(str.indexOf("o")); // -1  olmadigi icin eksi bir yazar
        System.out.println(str.indexOf("en guzeli")); //-1 cunku oyle iki kelime yok
        System.out.println(str.indexOf("a", 1)); //1
        System.out.println(str.indexOf("a", 2)); //3 //fromIndex den aramaya baslar o yuzden 3 yazar
        System.out.println(str.indexOf("i")); // 8
        System.out.println(str.indexOf("i", 5)); // 8
        System.out.println(str.indexOf("i", 6)); // 8
        System.out.println(str.indexOf("i", 9)); // 10
        System.out.println(str.indexOf("i", 11)); // 12

        /*
        verilen bir cumlede istenen bir String icin
        asagidaki cumlelerden uygun olani yazdirin
        1- aradiginiz kelime cumlede 1 kere kullanilmis
        2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis
         */
        // "Java en iyisi"  icerisinde "en" kelimesi icin
        if (str.indexOf("en")== -1){
            System.out.println("bu cumlede aradiginiz kelime yok");
        } else {
            int birinciKelimeIndex = str.indexOf("en");
            if (str.indexOf("en",birinciKelimeIndex+1)==-1){
                System.out.println("bu cumlede aradiginiz kelime bir tane");
            }else {
                System.out.println("Bu cumlede aradiginiz kelimeden birden cok adet var");
            }
        }


    }
}
