import java.util.ArrayList;
/*ArrayList is the collection of the elements with same data type which is dynamic that means we can resize the elements of the arrayList and also modified the 
particular element in the array list. */
public class ArrayLists {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
      // Different types of operations we performed in the array list.
    // added the elements into array list element here.
    list .add(0, "Java");
    list.add(1, "Kotlin");
    list.add(2, "ReactJs");
    list.add(3, "SpringBoot");
    list.add(4, "Python");
    list.add(5, "Javascript");
    list.add(6, "Flutter");
    list.add(7, "Golang");
    
  System.out.println("Language: \n" + list);
  System.out.println();
  // remove the element from array list here.
  list.remove(7);
  list.remove(6);
  System.out.println("After remove the two language of the array \n" + list);
  //access the element of the 1 index of the arrayList.
  System.out.println();
  System.out.println("Get the index number of 0 is " + list.get(0));
  // change the 4 element SpringBoot as C++.
  System.out.println();
  System.out.println("After modidfied the one of the element in language arrayList, \nLanguage:");
   list.set(3, "C++");
   System.out.println(list);
   System.out.println();
  // iterates the each element from arrayList using for each method and print that element in console.
  System.out.println("The list of the language is: ");
  for(String language : list) {
    System.out.println(language);
  }
  // find the size of the arrayList.
  System.out.println();
  int size = list.size();
  System.out.println("The size of the arrayList is " + size);
  System.out.println();
  //check the specified element is exist or not. it returns boolean value such as true or false.
  boolean check = list.contains("Java");
  System.out.println(check);
  //checks if the given arrayList is empty or not.
  boolean checkEmpty = list.isEmpty();
  System.out.println(checkEmpty);
  //search the specified element using its value to return the index of the value.
  int index = list.indexOf("Javascript");
  System.out.println(index);
  System.out.println(" After the array list is sorted look like:");
  list.sort(null);
  System.out.println(list);
  //create a new arrayList as same element with same size.
  System.out.println("___________________________________________________________________");
  System.out.println("The new array list is created here: ");
  Object newArrayList = list.clone();
  System.out.println(newArrayList);
  System.out.println("____________________________________________________________________");
  System.out.println();
  System.out.println("Happy endings \n:)");
   }
}
