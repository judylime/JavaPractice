package AlgorithmBasic.QueueAndStack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        /*
        1) offer
        2) poll
        3) peek
        4) size
        5) isEmpty
         */
        q.offer(4);
        q.offer(1);
        q.offer(9);

        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());

        Deque<String> stack = new LinkedList<>();
        /*
        1) push
        2) pop
        3) peek
        4) size
        5) isEmpty
         */

        stack.push("yaoshen");
        stack.push("yunqing");
        stack.push("tianzhi");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
