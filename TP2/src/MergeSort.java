import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MergeSort {
    private static void merge (int[] array, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){ 
                if (left[i] < right[j]){
                    array[k] = left[i];
                    i++;
                }
                else{
                    array[k] = right[j];
                    j++;
                }
                k++;
        }
        while(i < left.length){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            array[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] array){
        int n = array.length;
        if ( array.length < 2 ){
            return ;
        }
        int mid_size = n / 2 ;
        int[] left = new int[mid_size ];
        int[] right = new int[ n - mid_size];
        for(int i = 0; i < left.length; i++){
            left[i] = array[i];
        }
        for (int j = 0 ;j < right.length; j++){
            right[j] = array[mid_size + j];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    public static void timeMergeSort(int k){
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outpuMerge.txt"), false));
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
        for(int i=0;i<k;i++){
            int[] array = ArrayGenerator.randomArray(i);
            long begin = System.nanoTime() ;
            mergeSort(array);
            long end = System.nanoTime() ;
            long result = (end - begin);
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outputMerge.txt"), true));
            writer.append(i +" " +(result/1000000.0) + "\n");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
  }
 }
}

