package day10_nestedForLoop_methodOlusturma;

public class C11_MiniHesapMakinesi {
    public static void main(String[] args) {
        // kullanicinin verdigi iki sayi ve
        //sececegi isleme gore
        //sonucu double olarakbize donduren bir method olusturun
        // orn: Sayilar 3, 5 islem * oldugunda ,ethod 15 dondurmeli

        miniHesapMakinesi(5,4,'+');
        // bize sonuc donduren methodlarda islem sonucunu gormek isterseniz
        //direkt yazdirabilir veya islem sonucunu kaydedip istedigimizde kullanabiliriz.
        System.out.println(miniHesapMakinesi(5, 4, '*'));
        // islem sonucunu kaydeddip, istedigimizde kullanabiliriz
        double sonuc = miniHesapMakinesi(5,4,'+');
    }

    public static double miniHesapMakinesi(int sayi1, int sayi2, char islemSembolu){

        // islem sembolu olarak + - * veya / kullanilabilsin
        double sonuc=0;
        switch (islemSembolu){
            case '+' :
                sonuc = sayi1 + sayi2;
                break;
            case '-' :
                sonuc = sayi1 - sayi2;
                break;
            case '*' :
                sonuc = sayi1 * sayi2;
                break;
            case  '/' :
                sonuc = (double) sayi1 / sayi2;
                break;
            default:;
                System.out.println("islem sembolu yanlis, sonuc 0 olarak atandi");
        }
        return  sonuc;

    }
}
