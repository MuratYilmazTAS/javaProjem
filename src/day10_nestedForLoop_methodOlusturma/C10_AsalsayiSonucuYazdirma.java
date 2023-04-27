package day10_nestedForLoop_methodOlusturma;

public class C10_AsalsayiSonucuYazdirma {
    public static void main(String[] args) {
        // verilen sayinin asalsayi olup olmadigini yazdiran bir method olusturun

        asalSayimiYazdir(37);
        asalSayimiYazdir(79);
        asalSayimiYazdir(234567);
    }

    public static void asalSayimiYazdir(int sayi){
        boolean asalMi = true;


        for (int i = 2; i <sayi ; i++) {


            if (sayi %i == 0){
                asalMi=false;
                break;
            }

        }
        /*
        bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
        break; yazabilirsiniz
         */

        if (asalMi){
            System.out.println(sayi+" sayi asal");
        }else {
            System.out.println(sayi+ " sayi asal degil");
        }
    }

}
