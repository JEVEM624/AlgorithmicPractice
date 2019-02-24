package leetcode;

import java.util.HashMap;

/**
 * @Author JEVEM624
 * @Date 2019/2/24
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode first =head;
        ListNode sec=head.next;
        while (sec != null) {
            if (first.val == sec.val) {
                sec=sec.next;
            } else {
                first.next = sec;
                first=first.next;
                sec = sec.next;
            }
        }
        first.next=null;
        return head;
    }
}
