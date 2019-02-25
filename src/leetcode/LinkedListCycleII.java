package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fir=head;
        ListNode sec=head;
        while(fir!=null&&sec!=null&&sec.next!=null&&fir.next!=null&&sec.next.next!=null){
            fir=fir.next;
            sec=sec.next.next;
            if(fir==sec){
                sec=head;
                while(fir.val!=sec.val){
                    fir=fir.next;
                    sec=sec.next;
                }
                return fir;
            }
        }
        return null;
    }
}
