import java.util.Random; //generate random numbers
import java.util.Scanner; //user input

public class Main {
  
  //enum for sorting algs
  static enum Algs { BubbleEnum, InsertionEnum, QuickEnum };
  
  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);

    int[] array = {}; //stores list

    //prompt
    System.out.printf("Choose an array length:%n");

    int inputLength = 0;
    //input filtering loop
    while (true) { //loop until valid input, break out when valid
      try {
        inputLength = input.nextInt();
        //if the chosen length is 0 or negative, reprompt
        if (inputLength <= 0) { throw new Exception("neg"); } 
        break;
      }  
      catch (Exception e) { //invalid input entered
        input.next(); 
        System.out.println("Invalid Input."); 
      }
    }
    
    //generate unsorted array
    array = genList(inputLength);
    
    //print unsorted list
    System.out.printf("%nUnsorted List: "); 
    for(int i : array) { 
      System.out.printf("%d ", i);  
    }
    
    System.out.printf("%n%n"); //2x newline at end
    
    //choose alg
    System.out.printf("Choose a sorting algorithm:%n");
    System.out.printf("1) Bubble Sort%n");
    System.out.printf("2) Insertion Sort%n");
    System.out.printf("3) Quick Sort%n");
    
    
    while (!input.hasNextInt()) { //input not integer
      System.out.printf("Invalid Input .%f");
    }

    //store number corresponding to the alg chosen with enum 
    Algs user_sort = Algs.values()[input.nextInt() - 1];

    switch (user_sort) { //switch case with respective alg
      case BubbleEnum:
        System.out.printf("Sorted using Bubble Sort%n");
        Bubble bubbleSort = new Bubble(array);
        bubbleSort.sort();
        break;
        
      case InsertionEnum:
        System.out.printf("Sorted using Insertion Sort%n");
        Insertion InsertionSort = new Insertion(array);
        InsertionSort.sort();
        break;
        
      case QuickEnum:
        System.out.printf("Sorting using Quicksort%n");
        Quicksort QuickSort = new Quicksort(array);
        QuickSort.sort();
        break;

      default:
        System.out.println("dont pick a trash alg next time");
    }
  }

  public static int[] genList(int length) { //random order list
    int[] array = new int[length];
    Random rand = new Random(); //like scanner

    //fill array with random numbers
    int i = 0;
    while (i < length) {
      int num = rand.nextInt(length) + 1; //0 up to length

      //check if already used
      boolean numUsed = false;
      for (int element=0; element < length; element++) {
        if (array[element] == num) { numUsed = true; }
      }
      if (numUsed) { continue; } //num used, go back and get another

      
      array[i] = num; //add to list
      i++;
      
    }
    
  
    return array;

    
    
  }


  /*
  I. Introduction
  Explain what sorting and searching algorithms are
  Explain what recursion is
  
  II. Sorting Algorithms
  Explain what sorting algorithms are
  Introduce bubble sort algorithm
  Introduce merge sort algorithm
  Introduce quick sort algorithm
  
  III. Searching Algorithms
  Explain what searching algorithms are
  Introduce linear search algorithm
  Introduce binary search algorithm
  
  IV. Recursion
  Explain what recursion is
  Explain how recursion works with sorting and searching algorithms
  
  V. Practice Problems
  Have students practice implementing sorting and searching algorithms using recursion
  
  VI. Conclusion
  Recap what was learned in the lesson
  */
}