package AlgorithmBasic.LinkedList;

public class LinkedList {
    public ListNode findKIndex(ListNode head, int k) {
        //corner case
        if (head == null || k < 0) {
            return null;
        }
        ListNode cur = head;
        int index = 0;
        while (index != k && cur != null) {
            cur = cur.next;
            index++;
        }
        return cur;
    }

    public static void main(String[] args) {

    }
}



