package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fir=head;
        ListNode sec=head;
        while(fir!=null&&sec!=null){
            fir=fir.next;
            sec=sec.next;
            if(sec!=null){
                sec=sec.next;
            }
            if(sec!=null&&fir.val==sec.val){
                return true;
            }
        }
        return false;
    }
}
