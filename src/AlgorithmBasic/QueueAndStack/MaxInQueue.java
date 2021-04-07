package AlgorithmBasic.QueueAndStack;

import java.util.Queue;

public class MaxInQueue {
    public static void main(String[] args) {

    }
    public int maxInQueue(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}
