//package AlgorithmBasic;
//
//import java.util.*;
//
//public class StackQueue {
//    public static void main(String[] args) {
//        // create a queue of int
//        // google: javadoc queue => oracle docs
//        Queue<Integer> queue = new LinkedList<Integer>();
//        //Add an element
//        queue.offer(1) ;//[1]
//        queue.offer(2);//[1, 2]
//        // remove the element in the queue front
//        queue.poll(); // [2]
//        //take a look at the element in the queue front.
//        int frontElement = queue.peek(); //frontElement = 2, [2]
//        // get size
//        int queueSize = queue.size();// queueSize = 1
//        // determine whether the queue is empty
//        boolean isEmptyQueue = queue.isEmpty();// isEmptyQueue = false, [2]
//
//
//        // create a stack of int
//        // Deque: double-ended queue
//        Deque<Integer> stack = new LinkedList<>();
//        //add an element.
//        stack.push(1);// [1]
//        stack.push(2);// [2,1]
//        //remove an element on the top of the stack
//        stack.pop(); // [1]
//        //take a look at the element on the top
//        int topElement = stack.peek();// topElement = 1
//        // get size
//        int stackSize = stack.size(); // stackSize = 1
//        // determin whether the stack is empty
//        boolean isEmptyStack = stack.isEmpty(); // isEmptyStack = false, [1]
//    }
//}
