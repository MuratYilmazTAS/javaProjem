package day18_parametreliConstructor_constructorCall;

public class C06 {
    C06(){
        System.out.println("Parametresiz Constructor");
    }

    C06(int sayi){
       //  C06(); java bu sekilde yazimi method call kabul eder
        // yani Constructor'lar constructor ismi yazilarak cagiralamaz!!!

        this();
        // bir constructor'in icindebaska bir constructor'i calistirmak istersek
        // this (istenen argumentler) yazariz
        System.out.println("int parametreli constructor");
    }

    C06(String str){
        this(3);
        System.out.println("String parametreli constructor");
    }




    public static void main(String[] args) {
        C06 obj = new C06("Java");

    }
}
