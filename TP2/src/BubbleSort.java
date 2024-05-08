import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for (int j = 0; j<array.length - 1; j++){
            for (int i =0; i<array.length -1; i++){
                if (array[i] > array[i+1]){
                    Swap.swap(array, i , i + 1);
                }
            }
        }
    }
    public static void bubbleTime(int k) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outpuBubble.txt"), false));
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
        for(int i=0;i<k;i++){
            int[] array = ArrayGenerator.randomArray(i);
            long begin = System.nanoTime() ;
            bubbleSort(array);
            long end = System.nanoTime() ;
            long result = (end - begin);
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream( new File("outputBubble.txt"), true));
            writer.append(i +" " +(result/1000000.0) + "\n");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        };
        }
    }
}
