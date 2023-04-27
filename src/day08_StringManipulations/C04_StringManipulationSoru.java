package day08_StringManipulations;

import java.util.Scanner;

public class C04_StringManipulationSoru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir mail alin
        main @ icermiyorsa "gecersiz mail"
        mail @gmail.com icermiyorsa, "mail gmail olmali"
        mail @gmail.com ile bitmiyorsa, "mail yazim hatasi var" yazdirin.
         */

        //1. adim kullanicidan maili almak

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Lutfen bir mail giriniz");
        //String email= scan.next();
        // name@gmail.com
        /*
        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }

        if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }

        if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }*/


       // Scanner scan = new Scanner(System.in);
       // System.out.println("Lutfen bir mail giriniz");
       // String email= scan.next();
        // name@gmail.com


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir mail giriniz");
        String email= scan.next();
        // name@gmail.com
        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        } else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }


    }



}
