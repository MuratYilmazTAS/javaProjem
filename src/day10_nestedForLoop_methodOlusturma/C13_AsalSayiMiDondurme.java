package day10_nestedForLoop_methodOlusturma;

public class C13_AsalSayiMiDondurme {
    public static void main(String[] args) {
        // verilen bir sayinin asal sayi olup olmadigini
        // true/false olarak donuren bir method olusturun

        System.out.println(asalSayiMi(23)); // true
        System.out.println(asalSayiMi(67)); //true
        System.out.println(asalSayiMi(55)); //false

        /*
        method call sirasinda parantez icerisine yazdigimiz deger veya variable'lara argument denir
        method () icindekivariable'lara ise parametre denir.

        methodun calismasi icin argument ve parametrelerin sayilari ve data turleri uyumlu olmalidir
         */


    }

    public static boolean asalSayiMi(int sayi){

        boolean asalMi = true;


        for (int i = 2; i <sayi ; i++) {


            if (sayi %i == 0){
                asalMi=false;
                break;
            }

        }
        return  asalMi;
    }
}
