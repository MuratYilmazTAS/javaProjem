package day05_ifElseStatements;

public class C01_basitIfStatement {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
        //Sarta odaklanir,sart true ise calisir,degilse calismaz
        //Birden fazla bagimsiz if statement varsa degerlere bagli olarak tum if body'leri
        //calisabilecegi gibi hic bir if body'sinin calismamasi da mumkundur
        int a=21;
        int b=-75;

        if (a>b){
            System.out.println("a b'den buyuk");
        }

        if (a%7 == 0){
            System.out.println("a 7'ye tam olarak bolunur");
        }

        if(b % 5 == 0){
            System.out.println("b 5'e tam bolunur");
        }

        if (a+b > 100){
            System.out.println("sayilarin toplami 100'den buyuk");
        }
        // Eger if sartindan sonra suslu parantez kullanmazsak Java ilk noktali virgule kadar olan kismi
        // If body olarak kabul eder ve sonraki satirlarla ilgilenmez

        // Eger if sartini yazdigimiz parantezden hemen sonra ; yazarsak if statement ;'de biter
        // bu sarta bagli hic kod olmaz

        if (b > 0) {
            System.out.println("b sifirdan buyuk");
            System.out.println("b gercekten sifirdan buyuk");
            System.out.println("Valla b sifirdan buyuk");
        }

    }
}
