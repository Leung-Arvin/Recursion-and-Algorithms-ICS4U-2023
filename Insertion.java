import java.awt.*;
import javax.swing.*;

public class Insertion extends SortingAlgorithm {

  public Insertion(int[] unsortArray) {
    super(unsortArray);
  }

  public static void sort() {
   
    for (int i = 1; i < array.length; i++) { //dont insert 1st element
      System.out.printf("----Inserting element %d---- %n", i+1);
      Insert(i); // loop insert method for length of array
    }

    System.out.print(" Sorted list Complete");
    
  }    
  
  public static void Insert(int index) {

    // return method when index passed is either zero or negative
    if (index <= 0 ) {
      return;
    }

    // upperbound variable to keep track of what is sorted
    int upperBound = index+1;
    
      
    // while loop operates when previous value is greater than current passed value and when list has not 
    
    while (index > 0 && array[index -1] > array[index]) { 
      
      
      print(index, index-1, upperBound);
      
      System.out.printf("|| comparing %d and %d" , array[index-1], array[index]);
      System.out.println();
      
      //swap the two values 
      swap(index, index-1);

      
      // after swap, go through all values before hand
      index--;
    }

    print(index, index, upperBound);
    System.out.println("|| inserted");
  }


  //enhanced print function
  public static void print(int insert, int comparison, int upper) {
    for (int i=0; i<array.length; i++) { // print unsorted list
      if (i == comparison) { System.out.printf(BLUE); } //compared nums are marked blue
      if (i == insert) { System.out.printf(GREEN);  } //num being inserted is marked green
      if (i >= upper) { System.out.printf(RED); } //the values that are not being sorted are marked red
      
      System.out.printf("%d ", array[i]);
      System.out.printf(RESET); 
      
    }

    drawBars();
  }

  
}