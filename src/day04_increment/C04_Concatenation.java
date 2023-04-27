package day04_increment;

public class C04_Concatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int i1 = 3;
        int i2 = 4;

        //Sadece bu variable lari kullanarak asagida verilen metinleri yazdirin

        //Java Candir

        System.out.println(s1+s3+s2);

        //Java 34
        System.out.println(s1+s3+i1+i2);

        // Java 7
        System.out.println(s1+s3+(i1+i2));//paranteze alarak matematiksel isleme oncelik verdim

        //12 Java
        System.out.println(i1*i2+s3+s1); //islem onceligi carpmada oldugu icin matematiksel islemi paranteze almadim

        //34 Candir
        System.out.println(s4 + i1 + i2 + s3 + s2); //s4 String'ini ekleyince hepsini stringlestirdim
    }
}
