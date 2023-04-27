package day15_multiDimensonalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_remove {
    public static void main(String[] args) {

        String[] harfler = {"a","h","d","k","m","e"};
        List<String> harfList = new ArrayList<>();

        for (int i = 0; i <harfler.length ; i++) {
            harfList.add(harfler[i]);

        }
        System.out.println(harfList); // [a, h, d, k, m, e]
        System.out.println(harfList.remove("h")); // true (yani gittim buldum ve sildim)
        System.out.println(harfList); // [a, d, k, m, e]

        System.out.println(harfList.remove("x")); // false
        System.out.println(harfList); // [a, d, k, m, e]

        /*
        remove() unda obje verirsek bulursa siler ve true dondurur
        bulamazsa silemedigi icin false dondurur
         */
        System.out.println(harfList.remove(2)); // k
        System.out.println(harfList); // [a, d, m, e]

        // remove() index ile verilirse index liste icinde varsa
        // elemani siler ve sildigi elemani bize dondurur
        // index yoksa exception olusur
    }
}
