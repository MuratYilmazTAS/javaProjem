package day10_nestedForLoop_methodOlusturma;

public class C02_NestedForLoops {
    public static void main(String[] args) {

        /*
        verilen satirve sutun sayisina uygun olarak sagidaki sekli yazdirin

        orn: satir 4 , sutun 5
        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */
        int satirSayisi =4;
        int sutunSayisi =5;
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");

        }
            System.out.println("");

        }

    }
}
