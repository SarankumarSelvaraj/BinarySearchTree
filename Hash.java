import java.util.*;

class Hash {
  public static void main(String[] args) {
  HashMap<String, Integer> studentMark = new HashMap<String, Integer>();
  // adding the element into the hashmap
  studentMark.put("Maths", 89);
  studentMark.put("Science", 92);
  studentMark.put("Social", 100);
  studentMark.put("Tamil", 100);
  studentMark.put("English", 90);
  // delete the element from hashmap.
    studentMark.remove("Maths");
    // access the one of the element in the hashmap.
    System.out.println(studentMark.get("Tamil"));
    // check if it is empty or not.
    System.out.println(studentMark.isEmpty());
    //if the key is present or not.
  System.out.println(studentMark.containsKey("English"));
    // same as value.
    System.out.println(studentMark.containsValue(92));
    // getOrdefault method.
    System.out.println(studentMark.getOrDefault("Religion", 87));
 //System.out.println(studentMark);
    // for each loop to iterate the each element.
    studentMark.forEach((subject, mark) -> {
      studentMark.replace(subject, mark - 10);
    });
  System.out.println(studentMark);
}
}