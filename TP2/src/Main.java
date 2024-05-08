import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int [] array ={-2,5,9,3,7,8,0};
        //int[] array = ArrayGenerator.randomArray(4);
        System.out.println(Arrays.toString(array));
        CountingSort.countingSort(array);
        //MergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
        //BubbleSort.bubbleTime(1000);
        //InsertionSort.insertionTime(10000);
        //MergeSort.timeMergeSort(10000);
        
    }
}
