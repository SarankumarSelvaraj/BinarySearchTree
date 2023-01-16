public class Selection {
    private int array[] = new int[50];
    private int arraySize = 10;

    public void generateNumber() {
        for(int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random()*10) + 10;
        }
    }
    public void printHorizon(int i, int j) {
        for(int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++) {
            System.out.print("| " + array[n] + " ");
        }
        System.out.println("|");
        for(int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++) {
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
            for(int l = 0; l < (5*(i-j)-1); l++) System.out.print(" ");
            System.out.println(i);
        }
        System.out.println();
    }
    /* selection sort is used to select the smallest number and arrange the smallest number in ascending order one by one.
     * It is simple sorting algorithmn. if you have 1, 4, 3, 2 and use selection sort first one is 1 which is compare with other
     * element and other elements are greater than 1 so no need to sort the element and next one is 4 which is compare
     * with other element in that case 2 is smallest number after 1 and 4 is swaped to where number 2 is located. next 
     * number is 3 and 3 is not swap because there is no smallest number is exist and next is four that is also not swap
     * because it is end of the sorted array.
      */
     public void selectionSort() {
        for(int x = 0; x < arraySize; x++) {
            // set the minimum is equal to x.
            int minimum = x;
            for(int y = x; y < arraySize; y++) {
                if(array[minimum] > array[y]) {
                    // after the minimum of the array is greater than y of the array, so we set minimum equal to y.
                    minimum = y;
                }
            }
            // call the swap method here i equal to x and j equal to minimum.
            swapValue(x, minimum);
            // here i equal to x and j equal to -1.
            printHorizon(x, -1);
        }
     }

      public void swapValue(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
      }


    public static void main(String[] args) {
      Selection s = new Selection();
      s.generateNumber();
      //s.printHorizon(-1, -1);
      s.selectionSort();
    }
}
