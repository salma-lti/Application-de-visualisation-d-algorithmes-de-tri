import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for (int i = 1 ; i < array.length ; i++){
            int value = array[i];
            int hole = i;
            while( hole > 0 && array[hole -1] > value){
                Swap.swap(array, hole, hole-1);
                hole--;
            }
            array[hole] = value;
        }   
    }
    public static void insertionTime(int k) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outpuInsertion.txt"), false));
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
        for(int i=0;i<k;i++){
            int[] array = ArrayGenerator.randomArray(i);
            long begin = System.nanoTime() ;
            insertionSort(array);
            long end = System.nanoTime() ;
            long result = (end - begin);
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outputInsertion.txt"), true));
            writer.append(i +" " +(result/1000000.0) + "\n");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
 }
}
}
