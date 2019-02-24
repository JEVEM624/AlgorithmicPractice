package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/24
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fir = head;
        ListNode sec = head.next;
        if (sec == null) {
            return fir;
        }
        if (fir.val == sec.val) {
            while (fir.val == sec.val) {
                sec = sec.next;
                if (sec == null) {
                    return null;
                }
            }
            return deleteDuplicates(sec);
        } else {
            fir.next = deleteDuplicates(sec);
            return fir;
        }
    }
}
