/*Queue is a linear data structure and that is store the data in queue or line. It is first in first out(fifo). 
fifo means which data is first stored and that data is removed first. In technical term we called two things one is front and rear. front is first element of the queue.
rear is the last element of the queue. 
for example, you have to withdraw the money in ATM so you go to ATM and see there is thirty people is standing in the queue 
infront of you. front person is leaved form the ATM after withdraw the money who is come first in the atm. and that person is leaved after that second person 
who is stand next to the front person is going to withdraw the money and leave from the ATM. after the second guy and next one is third guy who is wait next to second 
person is going to withdraw the money and leave from the ATM,......etc. this process will take until it reaches rear point.
 */
/*Queue is interface class so we instantied the queue class from the other collection frameworks such as LinkedList, PriorityQueue, etc. but in that case we define our
 own class inside that write the different methods as our own implementation. */
class QueueOrder {
  // declare the front, rear, capacity as globally.
    private static int front, rear, capacity;
  // declare the queue array as globally.
    private static int queue[];
    // create the constructor for queue order class.
    QueueOrder(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
  // write the enqueue method to add the element to the queue.
    public void enqueue(int item) {
      // here if the size of the queue is full, it will print the queue is full.
      if(capacity == rear) {
        System.out.println("Queue is full.");
      }
      // else, add the new element to the queue.
      else {
        queue[rear] = item;
        // increment the element to the queue.
        rear++;
      }
    }
  // dequeue method is used to delete the element from the queue.
    public void dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty, so there is no need to delete");
        }
        else {
            for(int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i+1];
            }

        if(rear < capacity)
            queue[rear] = 0;
          // decrement the element from the queue.
            rear--;
    }
}
  // display the all the elements of the queue.
    public void display() {
        if(front == rear) {
            System.out.println("Queue is empty.");
        }
        else {
            for(int i = front; i < rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
  // frontQueue method is used to print the first element of the queue.
    public void frontQueue() {
        if(front == rear) {
            System.out.println("Queue is empty");
        }
        System.out.println("Front element of the queue is " + queue[front]);
    }
}
public class Queues {
   public static void main(String[] args) {
     // we instantied the QueueOrder class and create the object for that class and perform the different types of method in the queue main class.
    QueueOrder q1 = new QueueOrder(6);
    // added the elements to the queue.
    q1.enqueue(1);
    q1.enqueue(2);
    q1.enqueue(3);
    q1.enqueue(4);
    q1.enqueue(5);
    q1.enqueue(6);
    // display the elements of the queue using display method.
   q1.display();
   System.out.println();
   // remove the element from the queue using dequeue method.
   q1.dequeue();
   q1.display();
   System.out.println();
   // display the first element of the queue.
   q1.frontQueue();
}
}
