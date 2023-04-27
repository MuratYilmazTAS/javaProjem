package day08_StringManipulations;

public class C11_replaceAll {
    public static void main(String[] args) {

        // str icindeki butun sayilari method ile temizleyin

        String str = "          J23a3334^%%4va 23C56=-67a67n89d65i554r";

        str = str.replaceAll("\\W","");// \\W harf veya rakam olmayan herseyi siler

       str = str.replaceAll("\\d",""); //  \\d sayilari siler
        System.out.println(str);

        str = str.trim(); // // .trim() bosluklari siler
        System.out.println(str);


    }
}
