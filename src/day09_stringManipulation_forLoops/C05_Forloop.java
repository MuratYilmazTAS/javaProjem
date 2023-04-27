package day09_stringManipulation_forLoops;

public class C05_Forloop {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        System.out.println("=============");
        String str = "Hello World ";
        System.out.println(str.repeat(10));

        // 1'den yuze kadar olan sayilari yazdirin
        // 3 basamakli cift sayilari toplayin
        // verilen bir sayinin rakamlar toplamini bulun









        // 1'den yuze kadar olan sayilari yazdirin
        for (int i = 1; i <= 100 ; i++) {


            System.out.print(i + " ");
        }




        // 3 basamakli cift sayilari toplayin
        int sayilarToplami=0;
        for (int i = 100; i <1000 ; i+=2) {

            sayilarToplami += i;

        }

        System.out.println("\n" +sayilarToplami);










    }
}
