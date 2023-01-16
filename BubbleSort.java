
public class BubbleSort {
   private int[] array = new int[50];
   private int sizeOfArray = 10;
   // generate the random number to store that random number in the array rather than we initialize the values of the array.
   public void generateRandomNumber() {
       for(int i = 0; i < sizeOfArray; i++) {
        array[i] = (int) (Math.random() * 10) + 10;
       }
   }
   // shows how bubble sort algorithmn works in step by step.
    public void printHorizontal(int i, int j) {
        for(int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < sizeOfArray; n++) {
            System.out.print("| " + array[n] + " ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++) System.out.print("-");
         System.out.println();
         for(int n = 0; n < sizeOfArray; n++) {
            System.out.print("| " + array[n] + " ");
         }
         System.out.println("|");
         for(int n = 0; n < 51; n++) System.out.print("-");
         System.out.println();         
         if(j != -1) {
           for(int k = 0; k < ((j*5)+2); k++) System.out.print(" ");
            System.out.println(j);
         }
         if(i != -1) {
            for(int l = 0; l < (5*(j-i)-1); l++) System.out.print(" ");
                System.out.println(i);
            
         }
    }
   /* bubble sort method to sort the element and compare the first two values and next two values and so on.... basically it always compare between two values for example, index no: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    and compare again start with 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 suppose if u have doubt run this code and understand well.  */
    public void bubbleSort() {
       // here we nested for loop.
        // first loop is used to decrementing the element which means start at end point of the index.
       // second loop is used to incrementing the element which means end at starting point of the index.
        for(int i = sizeOfArray -1; i > 0; i--) {
           for(int j = 0; j < i; j++) {
              // check if the condition of array[i] is greater than array[j+1].
            if(array[j] > array[j+1]) {
               // call the swap method here.
                swapValue(j, j+1);
               // call the printHorizontal method to show how each element is swaped.
                printHorizontal(i, j);
            }
           }
        } 
    }
   /* Binary search is used to search or compare the the target value in the sorted array, it is easier to search the value. check if the value is present or not. if it is presented it will print the appropriate index
   suppose if it not presented it does not print anything. Binary search uses the algorithm which is middleIndex(total size of the array is divided by 2). if the value 
   is greater than middleIndex it moves towards right side of the middleIndex. else, it is moves towards to the left side of the middleIndex. 
   binary search reduces the memory space and time and also faster than linear search(compare each value).
   for example, middleIndex value is 23. target value is 7 and it is search on the left side or it will search on the right. suppose if the given value is equal to middleIndex value
   it directly print its value and time complexity is reduced.
   */
   
   public void binarySearch(int value) {
    int lowIndex = 0;
    int highIndex = sizeOfArray - 1;
    while(lowIndex <= highIndex) {
        int middleIndex = (lowIndex + highIndex) / 2;
        if(array[middleIndex] < value) lowIndex = middleIndex + 1;
        else if(array[middleIndex] > value) highIndex = middleIndex - 1;
        else {
            System.out.println("\nFound the array value is " + value + "of the index at " + middleIndex);
            lowIndex = highIndex + 1;
        }
        printHorizontal(middleIndex, -1);
    }
}
   // define the swap method here and pass the two arguments.
    public void swapValue(int indexOne, int indexTwo) {
       // In swap technique we usually use third variable that is temp to interchange the two values.
      int temp = array[indexOne];
      array[indexOne] = array[indexTwo];
      array[indexTwo] = temp;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.generateRandomNumber();
       // s.printArray();
        bs.bubbleSort();
    }
}
