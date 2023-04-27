public class Bubble extends SortingAlgorithm {
  // able to use any methods from SortingAlgorithm.java

  // constructor
  public Bubble(int[] unsortArray) {
    super(unsortArray); // calls SortingAlgorithm constructor
  }

  public static void sort() {

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

      int leftNum  = array[i];
      int rightNum = array[i+1];
      if (leftNum > rightNum) { // wrong way around
        swap(i);
        System.out.printf("| %d > %d, swap%n", leftNum, rightNum);
      }
      else {
        System.out.printf("| %d < %d, not swap%n", leftNum, rightNum);
      }

    }

  }

  


  public static void print(int colorIndex, int maxBeingSorted) {
    for (int i=0; i<array.length; i++) { // print unsorted list
      
      if (i == colorIndex || i == colorIndex+1) { 
        System.out.printf(RED); 
      }
      else if (i >= maxBeingSorted+1) {
        System.out.printf(BLUE);
      }
      
      System.out.printf("%d ", array[i]);
      System.out.printf(RESET); 
      
    }
  }

}