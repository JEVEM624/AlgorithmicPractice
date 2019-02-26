package leetcode;

import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/2/26
 * @Version 1.0
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        int sum = 0;
        ListNode first = head;
        if (head.next == null) {
            return first;
        }
        ListNode sec = head.next;
        head = head.next.next;
        ListNode firLast = first;
        ListNode secLast = sec;
        while (head != null) {
            if (sum % 2 == 0) {
                firLast.next = head;
                firLast = firLast.next;
            } else {
                secLast.next = head;
                secLast = secLast.next;
            }
            head = head.next;
            sum++;
        }
        secLast.next = null;
        firLast.next = sec;
        return first;
    }
}
