import java.lang.Math;
 class ArrayStructure {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    //generate the random number for array.
    public void generateNumber() {
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }
    // print the array element in the console
    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");

        }
    }
    // get the index of the array
    public int getIndex(int index) {
        if(index < arraySize)  return theArray[index];
           return 0;
    }
    public void deleteElementfromArray(int index) {
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = theArray[i+1];
        }
        arraySize--;
    }
    public void insertElementArray(int value) {
         if(arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
         }
    }
    public boolean doesContainArray(int searchValue) {
         boolean value = false;
         for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == searchValue) {
                value = true;
            }
         }
         return value;
    }
    public String linearIndexArray(int value) {
      boolean valueInArray = false;
      String indexWithValue = "";
      System.out.println("The value is found in the following index is");
      for(int i = 0; i < arraySize; i++) {
      if(theArray[i] == value) {
        valueInArray = true;
        System.out.print(i + " ");
        indexWithValue = indexWithValue + i + " ";
         }
    }
    if(!valueInArray) {
        indexWithValue = "None";
        System.out.println(indexWithValue);
    }
    System.out.println();
    return indexWithValue;
}
    public static void main(String[] args) {
        ArrayStructure array = new ArrayStructure();
        array.generateNumber();
        array.deleteElementfromArray(2);
        array.insertElementArray(99);
        array.printArray();
        System.out.println();
        System.out.println(array.getIndex(0));
        array.linearIndexArray(17);
        System.out.println();
        System.out.println(array.doesContainArray(14));
        
    }
}