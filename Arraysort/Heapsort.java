
package Arraysort;

public class Heapsort{


  private static void maxHeapify(int arr[], int i, int n){

    int left = 2*i + 1;
    int right = 2*i + 2;
    int largest = left;
    if (left <= n && arr[left] > arr[i])
      largest = left;
    else largest = i;
    if (right <= n && arr[right] > arr[largest])
      largest = right;

    if (largest != i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      maxHeapify(arr, largest, n);
    }
  }

  private static void buildMaxHeap(int arr[], int n){

    for(int i = n/2 ; i >= 0 ; i--)
      maxHeapify(arr, i, n);
  }

  private static void sort(int arr[] , int n){

    buildMaxHeap(arr, n);
    for(int i = arr.length-1; i > 0 ; i--){

      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      maxHeapify(arr, 0, i - 1);
    }

  }

  public static long sort(int arr[]) throws IllegalArgumentException{

    if(arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty.");

    long startTime = System.currentTimeMillis();
    sort(arr, arr.length - 1);

    return System.currentTimeMillis() - startTime;
  }
}
