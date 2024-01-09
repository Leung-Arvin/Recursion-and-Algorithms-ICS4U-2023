import java.awt.*;
import javax.swing.*;

public class Quicksort extends SortingAlgorithm {

  public Quicksort(int[] unsortArray) {
    super(unsortArray);
  }

  public static void sort() {
    sort(0, array.length-1, 0);
    print();
  }

  private static void sort(int lowerBound, int upperBound, int depth) {

    //recursive end case
    if (lowerBound >= upperBound) {
      return;
    }
    
    int pivotIndex = upperBound;
    int pivotValue = array[pivotIndex];

    //if element is less than pivot, move it to this index and increment
    int nextPos = lowerBound; 
    
    for (int i=lowerBound; i<pivotIndex; i++) {
      if (array[i] < array[pivotIndex]) {
        swap(i, nextPos);
        drawBars();
        nextPos++;
      }
    }

    //now put pivot in the 'middle'
    swap(pivotIndex, nextPos);

    print(lowerBound, upperBound, nextPos, depth);
    
    //recursively quicksort each half
    sort(lowerBound, nextPos-1, depth+1);
    sort(nextPos+1, upperBound, depth+1);
    
  }

  private static void print(int lower, int upper, int pivot, int depth) {
    //spaces to represent depth
    for (int i=0; i<depth; i++) {
      //System.out.print(" ");
    }
    
    for (int i=0; i<array.length; i++) {
      if (i < lower || i > upper) { System.out.printf(RED); }
      if (i == pivot)             { System.out.printf(BLUE); }

      System.out.printf("%d ", array[i]);
      System.out.printf(RESET); 
    }
    System.out.println();

    drawBars();
  }
  
}