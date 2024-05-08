public class QuickSort {

    public static void quickSort(int[] array, int start, int end) {
        while(start < end){
        int pIndex= partition(array, start, end);
        quickSort(array, start, pIndex-1);
        quickSort(array, pIndex+1, end);
        }
    }
    public static int partition (int[] array,int start, int end){
        int pivot = array[end];
        int pIndex = start;
        for (int i = start; i < end-1; i++){
            if(array[i] <= pivot){
                Swap.swap(array, pIndex, i);
                pIndex++;
            }
        }
        Swap.swap(array, end, pIndex);
        return pIndex;
    }
    
}
