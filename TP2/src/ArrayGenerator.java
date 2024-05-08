import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
    public static int[] randomArray(int length){
        return new Random().ints(length,0,Integer.MAX_VALUE).toArray();
    }
    public static int[] randomIncreasingArray(int length){
        return new Random().ints(length,0,Integer.MAX_VALUE).sorted().toArray();
    }

    public static int[] randomdecreasingArray(int length){
        int[] array = randomIncreasingArray(length);
        reverseArray(array);
        return array;
    }
    private static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++){
            Swap.swap(array, i, array.length - 1 - i);
        }
    }
    public static int[] indenticalArray (int n){
        Random rando = new Random();
        int randomNumber = rando.nextInt();
        int[] array = new int[n];
        Arrays.fill(array, randomNumber);
        return array;
    }

    public static int[] halfIndenticalArray (int n){
        Random rando = new Random();
        int[] array = new int[n];
        Arrays.fill(array, 0, (n%2==0?n/2: n/2 +1), Math.abs(rando.nextInt()));
        Arrays.fill(array, n - (n/2), n, Math.abs(rando.nextInt()));
        return array;
    }


}
