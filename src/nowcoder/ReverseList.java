package nowcoder;

/**
 * @Author JEVEM624
 * @Date 2019/3/6
 * @Version 1.0
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode sec=head.next;
        ListNode thir=null;
        head.next=null;
        while(sec !=null){
            thir=sec.next;
            sec.next=head;
            head=sec;
            sec=thir;
        }
        return head;
    }
}
