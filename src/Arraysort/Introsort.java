
package Arraysort;

public class Introsort{


  public static double sort(int[] arr){

    int maxdepth = (int)((Math.log(arr.length) / Math.log(2)) * 2);
    long startTime = System.nanoTime();
    sort(arr, 0, arr.length - 1 , maxdepth);
    return (System.nanoTime() - startTime) / 1000000d;
  }

  private static void sort(int[] arr, int low, int high, int maxdepth){

    int n = high - low;

    if(n < 1)
      return;

    int p = Quicksort.partitionOnePivot(arr, low, high);

    if(maxdepth == 0)
      Heapsort.sort(arr, low, high);

    else{

      sort(arr, low, p - 1 , maxdepth - 1);
      sort(arr, p + 1, high, maxdepth - 1);

    }
  }
}
