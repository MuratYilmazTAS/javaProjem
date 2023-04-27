package day10_nestedForLoop_methodOlusturma;

public class C07_methodOlusturma {
    public static void main(String[] args) {

        /*
        verilen iki sayinin toplamini yazdiran bir method olusturun
         */
        ikiSayitopla(5,9);
        ikiSayitopla(10,9);



    }
    public static void ikiSayitopla(int sayi1, int sayi2){

        /*
        public : access modifier ==> erisim belileyici, simdilik hep public yapiyoruz
        static : ozel bir keyword'dur,ileride anlatilacak simdilik hep static olacak
        void   : return type, meyhodun bana bir sey dondurmeyecegini, sadece yazdiracagini belirtir
        isim   : method'un yaptigi is ile baglantili olmali
        (parametreler) : methodun yapacagi is icin bizim gondermemiz gereken degiskenler
         */
        System.out.println("Iki sayinin toplami : "+(sayi1+ sayi2));
    }




}
