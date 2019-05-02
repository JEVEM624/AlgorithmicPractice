package leetcode;

import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;

/**
 * @Author JEVEM624
 * @Date 2019/5/2
 * @Version 1.0
 */
public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        new SwapNodesinPairs().swapPairs(head);
    }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode res=head.next;
        ListNode first=new ListNode(-1);
        ListNode sec=head;
        ListNode thir=head.next;
        while (sec!=null&&thir!=null){
            first.next=sec.next;
            sec.next=thir.next;
            thir.next=sec;
            first=sec;
            sec=sec.next;
            thir=sec!=null?sec.next:null;
        }
        return res;
    }
}
