//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
// First stack acts as the entry point, 
// Second stack is the exit point of the queues

import java.util.Scanner;
import java.util.Stack;

public class QueuesATaleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        // Queue - push the elements to stack one
        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        //Peek - the top of the second stack.
        public T peek() {
        	if(stackOldestOnTop.isEmpty()) {
        		while(!stackNewestOnTop.isEmpty()) {
        			stackOldestOnTop.push(stackNewestOnTop.pop());
        		}
        	}
        	return stackOldestOnTop.peek();
        }

        // Dequeue - removing the elements from the seconds stack.
        public T dequeue() {
        	if(stackOldestOnTop.isEmpty()) {
        		while(!stackNewestOnTop.isEmpty()) {
        			stackOldestOnTop.push(stackNewestOnTop.pop());
        		}
        	}
			return stackOldestOnTop.pop();
        }
        
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
