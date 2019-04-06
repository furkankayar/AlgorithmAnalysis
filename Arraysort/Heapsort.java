
package Arraysort;

public class Heapsort{


  private static void maxHeapify(int arr[], int low, int high, int i){

    int left = 2*i + 1 + low;
    int right = 2*i + 2 + low;
    int largest = i + low;
    if (left <= high && arr[left] > arr[i + low])
      largest = left;
    else largest = i + low;
    if (right <= high && arr[right] > arr[largest])
      largest = right;

    if (largest != i + low){
      int temp = arr[i + low];
      arr[i + low] = arr[largest];
      arr[largest] = temp;
      maxHeapify(arr, low, high, largest - low);
    }
  }

  private static void sort(int arr[], int low, int high){

    int n = high - low;

    for(int i = n/2 ; i >= 0 ; i--){
      maxHeapify(arr, low, high, i);
    }


    for(int i = n + low; i > low ; i--){

      int temp = arr[low];
      arr[low] = arr[i];
      arr[i] = temp;
      maxHeapify(arr, low, i-1 , 0);
    }
  }

  public static long sort(int arr[]) throws IllegalArgumentException{

    if(arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty.");

    long startTime = System.currentTimeMillis();
    sort(arr, 0 , arr.length - 1);

    return System.currentTimeMillis() - startTime;
  }
}
