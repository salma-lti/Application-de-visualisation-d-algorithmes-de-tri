public class RadixSort {
    private static void countingSort(int[] array, int exp){
        int[] count = new int[10];
        for (int value : array){
            count[value/exp % 10 + 1]++;
        }
        int[] output = new int[array.length];
        int indexIntial =0;
        for(int i=0; i < )
    }
}
