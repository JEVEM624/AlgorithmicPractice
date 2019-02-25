package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fir=null;
        ListNode sec=head;
        ListNode thir=null;
        while(sec!=null){
            thir=sec.next;
            sec.next=fir;
            fir=sec;
            sec=thir;
        }
        return fir;
    }
}
