package Stack;
import java.util.Iterator;
import java.util.Stack;

public class Bundle {
       public static void main(String[] args) {
    	   // we have to declare the stack class which is inbuilt.
    	   // stack is ls and it is lifo data structure.
    	   Stack<Integer> stack = new Stack<>();
    	   // add the elements into the stack using push method.
    	   stack.push(7);
    	   stack.push(3);
    	   stack.push(6);
    	   stack.push(9);
    	  // System.out.println(stack);
    	   // remove or delete the element on top of the stack using pop method
    	    stack.pop();
    	   // look the top of the stack.
    	   System.out.println(stack.peek());
    	   // sort the elements of the stack in ascending order.
    	    stack.sort(null);
    	   System.out.println(stack);
    	   // search the element in the stack. It will search the element from last(top) to first(bottom)
    	   int indexValue = stack.search(6);
    	   System.out.println(indexValue);
    	   int total = stack.size();
    	   System.out.println(total);
    	   // iterates the elements over stack using iterator and hasNext method
    	   Iterator it = stack.iterator();
    	   // using while condition to print the element one by one
    	   while(it.hasNext()) {  // hasNext method used to print the element next to next(1by1).
    		   //declare the object and use iterator method to iterator.
    		   Object s2 = it.next(); // next is used to read the element one by one
    		   System.out.print(s2 + " ");  
    	   }
       }
}
