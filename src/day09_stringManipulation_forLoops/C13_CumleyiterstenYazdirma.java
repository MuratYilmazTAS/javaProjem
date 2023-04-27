package day09_stringManipulation_forLoops;

public class C13_CumleyiterstenYazdirma {
    public static void main(String[] args) {





        String str = "java cook güzel";



        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i,i+1));

        }

        // String'in ters halini yeni bir String olarak kaydedin
        String tersStr="";
        for (int i = str.length()-1; i >=0; i--) {
            tersStr += str.substring(i,i+1);

        }
        System.out.println(" Ters haliyle metin : " +tersStr);



    }
    }

