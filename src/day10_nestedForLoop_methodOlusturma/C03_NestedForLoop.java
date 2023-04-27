package day10_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen bir sayi icin asagidaki tabloyu olusturun

        orn: sayi=3
        1*1  1*2  1*3
        2*1  2*2  2*3
        3*1  3*2  3*3

         */

        int sayi = 3;

        for (int i = 1; i <=sayi ; i++) { //disaridaki loop(outer) satirlari kontrol eder
            for (int j = 1; j <=sayi; j++) { // icerideki loop (inner) sutunlari kontrol eder
                System.out.print(i+"*"+j+"  ");
            }
            System.out.println("");

        }

         /*
        verilen bir sayi icin asagidaki tabloyu olusturun

        orn: sayi=3
        1*1  1*2  1*3  1*4
        2*1  2*2  2*3  2*4
        3*1  3*2  3*3  3*4

         */
        int a = 3;
        int b = 4;
        for (int i = 1; i<=a; i++) {
            for (int j = 1; j <=b; j++) {
                System.out.print(i+"*"+j+"  "); //direkt inner da sayi+1 desekte ayni sonucu yapardik
            }
            System.out.println("");

        }
    }
}
