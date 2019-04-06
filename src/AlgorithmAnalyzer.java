import java.util.Arrays;
import Arraysort.Quicksort;

public class AlgorithmAnalyzer{


  public static void main(String[] args){

    int[] array = new int[100000];
    for(int i = 0 ; i < 100000 ; i++){

      array[i] = i;
    }

    int[] array2 = array.clone();

    System.out.println("Time: " + Quicksort.dualPivotSort(array));
  //  System.out.println(Arrays.toString(array));
    System.out.println("Time: " + Quicksort.sort(array2, Quicksort.PivotType.MidOfFirstMidLastElement));
  //  System.out.println(Arrays.toString(array2));

  }
}
