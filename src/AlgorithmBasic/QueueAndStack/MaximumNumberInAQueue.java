package AlgorithmBasic.QueueAndStack;

import java.util.Queue;

public class MaximumNumberInAQueue {

}
class Solution {
    public int maxInQueue(Queue<Integer> queue) {
        //corner case
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