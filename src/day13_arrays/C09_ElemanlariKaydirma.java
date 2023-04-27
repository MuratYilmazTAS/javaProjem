package day13_arrays;

public class C09_ElemanlariKaydirma {

        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        sondaki elementi de basa tasiyacak bir method olusturun,
        array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
         */
        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7};
            arr = sagKaydir(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    public static int[] sagKaydir(int[] arr) {
        int sonEleman = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = sonEleman;
        return arr;
    }


}
