//Queue class
//Queue Example in QueueExample class
import java.util.*;

public class Queue {
    int[] array;
    int size;
    int capacity;
    int front;
    int rear;

    public Queue(int size) {
        this.capacity = size
        array = new int[size];
    }

    public boolean isEmpty() {
        if(rear < front)
            return true;
        else
            return false;
    }

    public void enqueue(int element) {
        if(rear == front)
        array[rear++] = element;
    }

    public void dequeue(int )
}