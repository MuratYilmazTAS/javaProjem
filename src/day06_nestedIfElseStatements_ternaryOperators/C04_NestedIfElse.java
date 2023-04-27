package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve liste fiyatini alin.
        //kullanicinin musteri karti olup olmadigini sorun
        //musteri karti varsa 10 urunden fazla alirsa %20 yoksa %15 indirim yapin
        //musteri karti yoksa 10 urunden fazla alirsa %15 yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girdiginiz urun adedini yaziniz");
        int urunadedi = scanner.nextInt();

        System.out.println("Urunun liste fiyatini giriniz");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? E : Evet , H : Hayir");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        double toplamFiyat = 0;

        if (kartVarmi == 'E') {//karti olanlar

            if (urunadedi>10){
                toplamFiyat=urunadedi*listeFiyati*80 / 100;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
            }else {
                toplamFiyat = urunadedi * listeFiyati * 85 / 100;
                System.out.println("%15 indirimli toplam fiyat : " +toplamFiyat);
            }



        } else if (kartVarmi == 'H') {//karti olmayanlar
            if (urunadedi>10){
                toplamFiyat=urunadedi*listeFiyati* 85 / 100;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
            }else {
                toplamFiyat = urunadedi * listeFiyati * 90 / 100;
                System.out.println("%15 indirimli toplam fiyat : " +toplamFiyat);
            }




        }else {
            System.out.println("Kart bilgisi icin yanlis giris yaptiniz");
        }
    }
}