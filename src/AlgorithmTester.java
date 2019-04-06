import java.util.Arrays;
import Arraysort.Quicksort;
import Arraysort.Heapsort;
import Arraysort.Introsort;

public class AlgorithmTester{

  private int[] numbers1k;
  private int[] numbers10k;
  private int[] numbers100k;

  public AlgorithmTester(){

    numbers1k = new int[1000];
    numbers10k = new int[10000];
    numbers100k = new int[100000];

  }

  public void fillArraysIncreasingNumbers(){

    for(int i = 0 ; i < numbers100k.length ; i++){

      if(i < numbers1k.length) numbers1k[i] = i;
      if(i < numbers10k.length) numbers10k[i] = i;
      numbers100k[i] = i;
    }
  }

  public void fillArraysDecreasingNumbers(){

    for(int i = 0 ; i < numbers100k.length ; i++){

      if(i < numbers1k.length) numbers1k[i] = numbers1k.length - i;
      if(i < numbers10k.length) numbers10k[i] = numbers10k.length - i;
      numbers100k[i] = numbers100k.length - i;
    }
  }

  public void fillArraysRandomNumbers(){

    for(int i = 0 ; i < numbers100k.length ; i++){

      int randomNumber = (int)(Math.random() * Integer.MAX_VALUE);
      if(i < numbers1k.length) numbers1k[i] = randomNumber;
      if(i < numbers10k.length) numbers10k[i] = randomNumber;
      numbers100k[i] = randomNumber;
    }
  }

  public void fillArraysEqualNumbers(){

    int number = (int)(Math.random() * Integer.MAX_VALUE);

    for(int i = 0 ; i < numbers100k.length ; i++){

      if(i < numbers1k.length) numbers1k[i] = number;
      if(i < numbers10k.length) numbers10k[i] = number;
      numbers100k[i] = number;
    }
  }

  public void testAlgorithms(){

    fillArraysIncreasingNumbers();
    System.out.println("\n\n---------------- INCREASING NUMBERS --------------------------------------------------------\n");
    System.out.println(String.format("%55s %20s %20s", "1000", "10000", "100000"));
    System.out.print(String.format("%-37s","\nHeapsort:"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers1k.clone()) , " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(FirstElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(RandomElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(MidOfFirstMidLastElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%-37s","\nQuicksort(DualPivot):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nIntrosort:"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers100k.clone()), " ms"));

    fillArraysDecreasingNumbers();
    System.out.println("\n\n\n\n---------------- DECREASING NUMBERS --------------------------------------------------------\n");
    System.out.println(String.format("%55s %20s %20s", "1000", "10000", "100000"));
    System.out.print(String.format("%-37s","\nHeapsort:"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers1k.clone()) , " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(FirstElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(RandomElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(MidOfFirstMidLastElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%-37s","\nQuicksort(DualPivot):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nIntrosort:"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers100k.clone()), " ms"));

    fillArraysRandomNumbers();
    System.out.println("\n\n\n\n---------------- RANDOM NUMBERS --------------------------------------------------------\n");
    System.out.println(String.format("%55s %20s %20s", "1000", "10000", "100000"));
    System.out.print(String.format("%-37s","\nHeapsort:"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers1k.clone()) , " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(FirstElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(RandomElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(MidOfFirstMidLastElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%-37s","\nQuicksort(DualPivot):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nIntrosort:"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers100k.clone()), " ms"));

    fillArraysEqualNumbers();
    System.out.println("\n\n\n\n---------------- EQUAL NUMBERS --------------------------------------------------------\n");
    System.out.println(String.format("%55s %20s %20s", "1000", "10000", "100000"));
    System.out.print(String.format("%-37s","\nHeapsort:"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers1k.clone()) , " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Heapsort.sort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(FirstElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.FirstElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(RandomElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.RandomElement), " ms"));
    System.out.print(String.format("%-37s", "\nQuicksort(MidOfFirstMidLastElement):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers1k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers10k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.sort(numbers100k.clone(), Quicksort.PivotType.MidOfFirstMidLastElement), " ms"));
    System.out.print(String.format("%-37s","\nQuicksort(DualPivot):"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Quicksort.dualPivotSort(numbers100k.clone()), " ms"));
    System.out.print(String.format("%-37s", "\nIntrosort:"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers1k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers10k.clone()), " ms"));
    System.out.print(String.format("%18.3f%3s", Introsort.sort(numbers100k.clone()), " ms"));






    System.out.println("\n");
  }

  public static void main(String[] args){

    new AlgorithmTester().testAlgorithms();

  }
}
