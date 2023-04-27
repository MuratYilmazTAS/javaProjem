package day16_arrayList;

public class C10_ForEachLoop {
    public static void main(String[] args) {


        int [] arr= {5,7,6,4,2,4,6,8,0,9,5,4,6,8,5,3,2,4,6,8,7,8,0,7,5,4,5};

       // for each loop kullandigimizda 3 unsura dikkat etmeliyiz
        // her bir elementin data type'i (int)
        // her bir elemente ortak isim (each)
        // elementlerin geldigi kaynak (arr)

        int toplam = 0;
        for (int each: arr
             ) {
            if (each>5){
                toplam+=each;
            }

        }
        System.out.println("Array icindeki 5ten buyuk elemanlarin toplami : " +toplam);



    }





}
