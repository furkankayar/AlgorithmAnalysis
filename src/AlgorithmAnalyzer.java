import java.util.Arrays;
import Arraysort.Quicksort;
import Arraysort.Heapsort;
import Arraysort.Introsort;

public class AlgorithmAnalyzer{


  public static void main(String[] args){

    int[] array = new int[100000];
    for(int i = 0 ; i < 100000 ; i++){
       array[i] = (int)(Math.random() * 100000000);
    }


    System.out.println("Time: " + Heapsort.sort(array));
    //System.out.println(Arrays.toString(array));

  }
}
