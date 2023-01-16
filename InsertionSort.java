public class InsertionSort {
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
   public void insertionSortMethod() {
    for(int i = 1; i < arraySize; i++) {
        int j = i;
        int toInsert = array[i];
        while((j > 0) && (array[j-1] > toInsert)) {
            array[j] = array[j-1];
            j--;
            printHorizon(i, j);
        }
        array[j] = toInsert;
        printHorizon(i, j);
        System.out.println("\nArray[i] = " + array[i] + " Array[j] = " + array[j] + " Insert = " + toInsert);
    }
   }

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
       i.generateNumber();
       i.insertionSortMethod();
    }
}