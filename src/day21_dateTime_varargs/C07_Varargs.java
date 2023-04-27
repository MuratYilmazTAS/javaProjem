package day21_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        topla(15,6); // sayilar[] = {15,6} //Verilen 2 elemntin toplami : 21
        topla(15,20,25); // sayilar[] = {15,20,25} //Verilen 3 elemntin toplami : 60
        topla(10,13,44,35);//Verilen 3 elemntin toplami : 102
        topla(12,14,14,12,23);//Verilen 3 elemntin toplami : 75
        topla(1,3,5,7,8,3,4,2);//Verilen 3 elemntin toplami : 33
        topla(2,3,5,6,7,8,9,1,2,3,5);//Verilen 3 elemntin toplami : 51
    }
    public static void topla(int... sayilar){


        /*
        javada int... , String... gibi variable data turunun yanina ... konulursa
        uzunlugu degisken olan bir array isaret eder
        buna varrargs denir (variaty of arguments)
         */

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;

        }
        System.out.println("Verilen " + sayilar.length+ " elemntin toplami : "+ toplam);
    }
}
