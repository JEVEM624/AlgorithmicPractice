package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/23
 * @Version 1.0
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode sec = head;
        if (first.next == null) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            if (sec.next == null) {
                return head.next;
            }
            sec = sec.next;
        }

        while (sec.next != null) {
            sec = sec.next;
            first = first.next;
        }
        if (n == 1) {
            first.next = null;
            return head;
        }
        first.next = first.next.next;
        return head;
    }
}
