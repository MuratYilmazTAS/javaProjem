package day07_switchStatements_stringManipulation;

public class C07_Contains {
    public static void main(String[] args) {

        String str = "Java ogren offer al";

        // str'da a harfi var mi?

        System.out.println(str.contains("a"));
        System.out.println(str.contains("x"));

        //sadece harf mi aratiyoruz?

        System.out.println(str.contains("Offer")); // str kucuk o harfi icerdigi icin false yazdirir
        System.out.println(str.contains("offer")); // str kucuk o icerdigi icin sonuc true olur

        // char atayabilir miyim?

        // System.out.println(str.contains('e')); charSequence lazim. char aratamiyoruz

    }
}
