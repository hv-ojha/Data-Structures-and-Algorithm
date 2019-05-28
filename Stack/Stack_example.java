// Stack
// Main
import java.util.*;

class Stack {
    int arr[];
    int top;
    int size;
    public Stack(int n) {
        this.arr = new int[n];
        top = 0;
        size = n;
    }
    boolean isEmpty(){
        if(this.top == 0)
            return true;
        return false;
    }
    void push(int data) {
        this.arr[top++] = data;
    }
    int pop() {
        return this.arr[--top];
    }
    int peek() {
        return this.arr[top-1];
    }
}

class Stack_example {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}