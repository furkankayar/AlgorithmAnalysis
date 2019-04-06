
package Arraysort;


public class Quicksort{

  public enum PivotType{
    FirstElement,
    RandomElement,
    MidOfFirstMidLastElement,
  }


  public static double sort(int[] arrayToSort, PivotType pivotType) throws IllegalArgumentException{

    if(arrayToSort == null || arrayToSort.length == 0) throw new IllegalArgumentException("Array is empty.");


    long startTime = System.nanoTime();
    sortWithOnePivot(arrayToSort, 0, arrayToSort.length - 1, pivotType);
    return (System.nanoTime() - startTime) / 1000000d;
  }

	private static void sortWithOnePivot(int[] arr, int low, int high, PivotType pivotType){

    if (low < high){
      int pi = partitionOnePivot(arr, low, high, pivotType);

      sortWithOnePivot(arr, low, pi - 1, pivotType);
      sortWithOnePivot(arr, pi + 1, high, pivotType);
     }
  }

  private static void setArrayPivot(int[] arrayToSort, PivotType pivotType, int high, int low){

    int temp = 0;
    int pivot = low;

    if(pivotType == PivotType.FirstElement){
      temp = arrayToSort[low];
    }

    else if(pivotType == PivotType.RandomElement){
      pivot = (int)(Math.random() * (high - low + 1)) + low;
      temp = arrayToSort[pivot];
    }
    else if(pivotType == PivotType.MidOfFirstMidLastElement){
      int middleElement = arrayToSort[(high - low)/2 + low];
      int firstElement = arrayToSort[low];
      int lastElement = arrayToSort[high];
      if(firstElement >= middleElement && firstElement <= lastElement) pivot = low;
      else if(firstElement <= middleElement && firstElement >= lastElement) pivot = low;
      else if(middleElement >= firstElement && middleElement <= lastElement) pivot = (high - low)/2 + low;
      else if(middleElement <= firstElement && middleElement >= lastElement) pivot = (high - low)/2 + low;
      else if(lastElement >= middleElement && lastElement <= firstElement) pivot = high;
      else if(lastElement <= middleElement && lastElement >= firstElement) pivot = high;
      temp = arrayToSort[pivot];
    }
    arrayToSort[pivot] = arrayToSort[high];
    arrayToSort[high] = temp;
  }

  private static int partitionOnePivot(int[] arr, int low, int high, PivotType pivotType){ //https://www.geeksforgeeks.org/quick-sort/

    setArrayPivot(arr, pivotType, high, low);

    int pivot = arr[high];
    int i = low-1;

    for (int j=low; j<high; j++){
      if (arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }

  static int partitionOnePivot(int[] arr, int low, int high){

    int pivot = arr[high];
    int i = low-1;

    for (int j=low; j<high; j++){
      if (arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }




  public static double dualPivotSort(int[] arrayToSort) throws IllegalArgumentException{

    if(arrayToSort == null || arrayToSort.length == 0) throw new IllegalArgumentException("Array is empty.");

    long startTime = System.nanoTime();
    sortWithTwoPivot(arrayToSort, 0, arrayToSort.length - 1);
    return (System.nanoTime() - startTime) / 1000000d;
  }

  private static void sortWithTwoPivot(int[] arr, int low, int high){

    if(low < high){
      IntegerNumber lp = new IntegerNumber(0);
      int rp = 0;
      rp = partitionTwoPivot(arr, low, high, lp);
      sortWithTwoPivot(arr, low, lp.value - 1);
      sortWithTwoPivot(arr, lp.value + 1, rp - 1);
      sortWithTwoPivot(arr, rp + 1, high);
    }
  }

  private static int partitionTwoPivot(int[] arr, int low, int high, IntegerNumber lp){ // https://www.geeksforgeeks.org/dual-pivot-quicksort/

    if(arr[low] > arr[high]){
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
    }
    int j = low + 1;
    int g = high - 1, k = low + 1, p = arr[low], q = arr[high];

    while(k <= g){

      if(arr[k] < p){
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
        j++;
      }
      else if(arr[k] >= q){
        while(arr[g] > q && k < g) g--;
        int temp = arr[k];
        arr[k] = arr[g];
        arr[g] = temp;
        g--;
        if(arr[k] < p){
          temp = arr[k];
          arr[k] = arr[j];
          arr[j] = temp;
          j++;
        }
      }
      k++;
    }
    j--;
    g++;

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    temp = arr[high];
    arr[high] = arr[g];
    arr[g] = temp;

    lp.value = j;
    return g;
  }


  private static class IntegerNumber{

    int value;

    public IntegerNumber(int value){
      this.value = value;
    }
  }
}
