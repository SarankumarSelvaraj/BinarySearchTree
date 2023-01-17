
import java.util.Arrays;

/* Quick sort is the sorting algorithm that is used to arrange the elements of the array in the ascending order
 *  by choose or pick one element as pivot and divide the array into two sub array and one side of the element is 
 * move to the left side of the pivot that element is smaller than pivot elements value and another side of the element is 
 * moved to the right side of the pivot that elements is greater than pivot element value.
 *  pivot element is pointing from the 0th index which is compare with pivot element if it is smaller than(1) the pivot value(2)
 * it will swapped the smaller value(1) to the 0th index, that prevoius value(8) in 0th index is moved to the the where 
 * the 1 value is positioned. and next compare the next element until the before the pivot element. if it is greater than 
 * pivot value does not swap anything and next pointing to the 1th index of the array again start the process of what
 * it did in 0th index 
  */
class QuickSort {
    // method to find the partition position
  static int partition(int array[], int low, int high) {
    // choose the righmost element as pivot. choose the pivot element is your choice.
    int pivot = array[high];
    // pointer for greater element.
    int i = (low - 1);
    //traverse through all elements.
   // compare each element with pivot.
    for(int j = low; j < high; j++) {
        if(array[j] <= pivot) {
            // if the smaller element than pivot is found then swap it with greater element pointed by i.
            i++;
            // swap the element at i with element at j.
            int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
        }
    }
    // swap the pivot element with the greater element specified by high.
       int temp = array[i+1];
       array[i+1] = array[high];
       array[high] = temp;
       // return the position from where partition is done.
       return (i + 1);
  }
  // write the quick sort method here.
   static void quickSort(int array[],int low, int high) {
    if(low < high) {
        // In pivot element, element is smaller than pivot is move to the left side.
        // if the element is greater than pivot is move to the right side.
        int pi = partition(array, low, high);
        // recursive call on left side of the pivot.
        quickSort(array, low, pi - 1);
        // recursive call on the right side of the pivot.
        quickSort(array, pi + 1, high);
    }
   }
}

 class Main {
    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
     System.out.println("Unsorted Array");
     /*  Arrays.toString() method is used to display the array elements. some times toString method is used to convert 
      from array to string format but often we used to print the elements of the array.*/
     System.out.println(Arrays.toString(data));
     int size = data.length;
     // call the quick sort method here.
     QuickSort.quickSort(data, 0, size - 1);
     // print the elements of the array in ascending order by calling the quickSort() method.
     System.out.println("Sorted Array in the Ascending Order ");
     System.out.println(Arrays.toString(data));
    }
}