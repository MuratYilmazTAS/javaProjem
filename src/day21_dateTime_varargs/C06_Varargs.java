package day21_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {


        // iki tamsayiyi toplayip yazdiran bir method olusturun

        topla(15,6);
    }
    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4){
        System.out.println("sayilarin toplami : "+ (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2){
        System.out.println("sayilarin toplami : "+ (sayi1+sayi2));
    }
}
