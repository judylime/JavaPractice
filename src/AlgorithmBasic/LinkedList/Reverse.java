package AlgorithmBasic.LinkedList;

public class Reverse {
    public static void main(String[] args) {

    }
//    public ListNode reverse(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode pre = null, cur = head;
//        while (cur != null) {
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }
    public ListNode reverse(ListNode head ) { // node2
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next); // node3 newHead
        head.next.next = head;
        // ListNode n2 = head.next;
        // n2.next = head;
        head.next = null;
        return newHead;
    }
}
