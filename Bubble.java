import java.awt.*;
import javax.swing.*;

public class Bubble extends SortingAlgorithm {
  // able to use any methods from SortingAlgorithm.java

  // constructor
  public Bubble(int[] unsortArray) {
    super(unsortArray); // calls SortingAlgorithm constructor
  }

  public static void sort() {
    //pass over the array each time, 'bubbling' the largest num up
    for (int i = array.length-1; i > 0; i--) {
      arrayPass(i); // 0 to last element
    }

    System.out.printf("%nSorted List: ");
    print();
  }

  
  private static void arrayPass(int max) {
    System.out.printf("----Sorting from element 1 to %d----%n", max+1);
    for (int i = 0; i < max; i++) {

      print(i, max);

      int leftNum  = array[i]; //num on left
      int rightNum = array[i+1]; //num that it is comparing to
      if (leftNum > rightNum) { // wrong way around
        swap(i);
        System.out.printf("| %d > %d, swap%n", leftNum, rightNum);
      }
      else { //correct way around, dont swap
        System.out.printf("| %d < %d, not swap%n", leftNum, rightNum);
      }

    }
  }


  public static void print(int colorIndex, int maxBeingSorted) {
    drawBars();
  /*
    for (int i=0; i<array.length; i++) { // print unsorted list
      
      if (i == colorIndex || i == colorIndex+1) { //being compared
        System.out.printf(RED); 
      }
      else if (i >= maxBeingSorted+1) { //already sorted
        System.out.printf(BLUE);
      }
      
      System.out.printf("%d ", array[i]); //print number
      System.out.printf(RESET); //reset text colour
      
    }
  
    */
  }

}