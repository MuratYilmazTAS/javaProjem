package day10_nestedForLoop_methodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen sayi icin asagidaki sekli olusturun

        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        int sayi = 5;
        for (int i = 1; i <=sayi ; i++) { // outer
            for (int j = 1; j <=i; j++) { // inner
                System.out.print("* ");

            }
            System.out.println("");


            }

        }
    }





