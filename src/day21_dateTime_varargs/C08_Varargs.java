package day21_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        // verilen degisken sayidaki tamsayidan
        // ilkinin karesini, digerlerinin toplamiyla carpan ve sonucu yazdiran bir method olusturun

        islemYap(3,4,5); // (3*3) * (4+5) = 81
        islemYap(2,3,4,5); // (2*2) * (3+4+5) = 48
        islemYap(4,5,6,7,8,9,0); // 560
        islemYap(1,2); // 2
        islemYap(5); // 0
        //varrargs degisken sayida element kabul eden bir array oldugundan
        //12. satirda islemde varargs eleman kalmaz, varargs =[] bos bir array olur
    }
    public static void islemYap(int ilksayi, int... geriyeKalanSayilar){
        int toplam = 0;

        for (int each:geriyeKalanSayilar
             ) {
            toplam+=each;

        }
        System.out.println("Istenen islem sonucu : "+(ilksayi*ilksayi*toplam));
    }



}
