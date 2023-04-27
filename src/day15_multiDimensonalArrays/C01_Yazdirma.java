package day15_multiDimensonalArrays;

import java.util.Arrays;

public class C01_Yazdirma {
    public static void main(String[] args) {
        /*
        MDA'de yazdirma islemi yaparken yazdirmak istedigimizin ne olduguna bakmamiz gerekir

        Element ise direkt yazdirabiliriz
        tek katli bir array'se Arrays.toString methodunu kullanmaliiz
        MDA ise Arrays.deepToString methodunu kullanmaliyiz.
         */

        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};
        System.out.println(arr [0][0]); //1

        System.out.println(arr.length); // 4
        System.out.println(arr[2].length); //4
        System.out.println(arr[3].length); //1

        // arr[2][1].lenght bir element oldugu icin lenght'i olmaz

        System.out.println(arr[2]); // [I@a09ee92 bir referans yazdirir
        System.out.println(Arrays.toString(arr[2])); //[2, 8, 1, 2]

        System.out.println(arr); //[[I@30f39991
        System.out.println(Arrays.toString(arr)); //[[I@452b3a41, [I@4a574795, [I@a09ee92, [I@f6f4d33]

        System.out.println(Arrays.deepToString(arr)); //[[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]
        // hepsini yazdirirken .deepToString kullanmaliyiz
    }
}
