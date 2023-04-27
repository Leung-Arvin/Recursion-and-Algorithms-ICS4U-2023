import org.w3c.dom.Element;

// Parent class which all other sorting algorithms will inherit

public abstract class SortingAlgorithm {

  //console colours
  public static final String RESET = "\u001B[0m";
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";
  
  public static int[] array;

  // constructor
  public SortingAlgorithm(int[] unsortedArray) {

    array = unsortedArray;

  }

  public static void print() {
    for (int i : array) { // print unsorted list
      System.out.printf("%d ", i);
    }
    System.out.printf("%n"); // 2x newline at end
  }


  public static void swap(int swapPos) {
    
    int temp = array[swapPos + 1]; // copy right num

    array[swapPos + 1] = array[swapPos]; // replace right rum

    array[swapPos] = temp; // replace left num with stored right num

  }

  public static void swap(int pos1, int pos2) {
    
    int temp = array[pos2]; // copy right num

    array[pos2] = array[pos1]; // replace right rum

    array[pos1] = temp; // replace left num with stored right num

  }


}