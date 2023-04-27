package day09_stringManipulation_forLoops;

public class C12_ForLoopRakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan  pozitif bir tam sayi alip, rakamlar toplamini yazdirin

        int sayi=1453;

        int basamkSayisi = (""+sayi).length();

        int rakam = 0;
        int rakamlarToplami =0;

        for (int i = 1; i <= basamkSayisi ; i++) {

            rakam = sayi%10;

            rakamlarToplami += rakam;

            sayi /= 10;

        }
        System.out.println("Verilen sayinin rakamlari toplami : " +rakamlarToplami);
    }
}
