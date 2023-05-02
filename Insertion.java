public class Insertion extends SortingAlgorithm {

  public Insertion(int[] unsortArray) {
    super(unsortArray);
  }

  public static void sort() {
   
    System.out.println(array.length);
    for (int i = 1; i < array.length; i++) {
      System.out.printf("----Inserting element %d----%n", i);
      Insert(i);
     
      
    }
    
   
  }    
    
  
  public static void Insert(int index) {

    if (index <= 0 ) {
      return;
    }

   
    
    int current, previous;
  
    current = array[index];
    previous = array[index - 1];

    
    
    while (index > 0 && array[index - 1] > array[index]) {
      
      //current = array[index];
      //previous = array[index - 1];
      
      //swap
      swap(index, index-1);
      
      //print new list
     // print();
      
      index--;
       
    }
    
    print();
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