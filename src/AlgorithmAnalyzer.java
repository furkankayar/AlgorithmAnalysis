import java.util.Arrays;
import Arraysort.Quicksort;
import Arraysort.Heapsort;
import Arraysort.Introsort;

public class AlgorithmAnalyzer{


  public static void main(String[] args){

    int[] array = new int[1000000];
    for(int i = 0 ; i < 1000000 ; i++){
       array[i] = (int)(Math.random() * Integer.MAX_VALUE);
    }


    System.out.println("Time: " + Quicksort.sort(array, Quicksort.PivotType.RandomElement));
    //System.out.println(Arrays.toString(array));

  }
}
