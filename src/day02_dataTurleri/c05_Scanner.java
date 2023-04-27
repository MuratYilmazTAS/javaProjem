package day02_dataTurleri;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini isteyip ismi buyuk harfe cevirip kaydedin
        //sonra kullaniciya yeni halini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scanner.nextLine();
        //next line yazilan bilginin tumunu getirir
        // next ise ilk space'e kadar olan kismini getirir. (H Ibrahim yazdiysa next kullanilirsa
        //sadece h harfini getirir
        girilenIsim = girilenIsim.toUpperCase();
        System.out.println("Girilen ismin duzenlenmis hali :" + girilenIsim);
    }
}
