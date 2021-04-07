package AlgorithmBasic.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int target) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == target) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
