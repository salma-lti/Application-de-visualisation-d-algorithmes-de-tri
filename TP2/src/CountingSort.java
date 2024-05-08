import java.util.Arrays;

public class CountingSort {
  
public static void countingSort(int[] arr){
    int min= Arrays.stream(arr).min().orElse(0);
    int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
    int[] count= new int[max - min +1];
    for (int value : arr){
        count[value - min]++;
    }
    int indexInitial =0;
    for (int j= 0; j < max-min +1; j++){
        while(count[j]>0){
            arr[indexInitial] = j + min;
            indexInitial++;
            count[j]--;
        }
    }
}
    
}
