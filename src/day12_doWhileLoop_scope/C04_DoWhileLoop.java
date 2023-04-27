package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin, sayinin tam kare olup olmadigini bulun
        tamkare ise true, degilse false yazdirin
        Orn: input: 16, output: true
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int kareKok=2;
        boolean tamKareMi= false;

        do {
            if (sayi == kareKok * kareKok){
                tamKareMi = true;
                break;
            }
            kareKok++;

        } while (kareKok*kareKok <= sayi);
        System.out.println(tamKareMi);

    }
}
