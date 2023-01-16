class QueueOrder {
    private static int front, rear, capacity;
    private static int queue[];
    // create the constructor for queue order class.
    QueueOrder(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    public void enqueue(int item) {
      if(capacity == rear) {
        System.out.println("Queue is full.");
      }
      else {
        queue[rear] = item;
        rear++;
      }
    }
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
            rear--;
    }
}
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
    public void frontQueue() {
        if(front == rear) {
            System.out.println("Queue is empty");
        }
        System.out.println("Front element of the queue is " + queue[front]);
    }
}
public class Queues {
   public static void main(String[] args) {
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
   // display the front element of the queue.
   q1.frontQueue();
}
}
