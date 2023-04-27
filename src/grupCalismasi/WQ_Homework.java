package grupCalismasi;

import java.util.Scanner;

public class WQ_Homework {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Lutfen bir kelime veya cumle giriniz");

        String girilenMetin = scanner.nextLine();

        String tersMetin = "";

        for (int i = girilenMetin.length()-1; i >= 0 ; i--) {
            tersMetin += girilenMetin.charAt(i);

        }
        System.out.println("Girdiginiz metnin ters hali :" + tersMetin);

    }
}
