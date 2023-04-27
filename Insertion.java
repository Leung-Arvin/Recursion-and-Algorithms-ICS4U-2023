public class Insertion extends SortingAlgorithm {

  public Insertion(int[] unsortArray) {
    super(unsortArray);
  }

  public static void sort() {
    System.out.println(array.length);
    for (int i = 1; i < array.length; i++) {
   
      Insert(i);
     
      
    }
    
   
  }    
    
  
  public static void Insert(int index) {

    if (index <= 0 ) {
      return;
    }

    System.out.printf("----Inserting element %d----%n", index+1);
    
    int current, previous;
  
    current = array[index];
    previous = array[index - 1];

  
    while (index > 0 && array[index - 1] > array[index]) {

      //current = array[index];
      //previous = array[index - 1];
      
      //swap
      swap(index, index-1);

      //print new list
      print();
      
      index--;
       
    }
    
  }
    
}