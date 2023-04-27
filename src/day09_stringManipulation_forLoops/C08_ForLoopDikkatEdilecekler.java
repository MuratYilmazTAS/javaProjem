package day09_stringManipulation_forLoops;

public class C08_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // verilen ilk deger bitis sartini saglamiyorsa


        for (int i = 10; i < 0; i--) {
            System.out.println(i);

        }
        // kod calisir ancak ilk deger icin bile bitis sarti saglanmadigindan loop body hic calismaz



        // Baslangic degeri ve artis/azalis miktari ile bitis sarti hic saglanamazsa

        //for (int i = 10; i >= 0; i++) {
            //System.out.println(i); // sonsuza kadar yazdirir.
            // buna sonsuz loop  denir ve makinenin ram'i dolana kadar calisir

        }
    }
