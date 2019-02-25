package leetcode;


/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head!=null&&head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode fir = head;
        ListNode sec = head.next;
        while (sec != null) {
            if(sec.val==val){
                fir.next=sec.next;
                sec=sec.next;
            }else {
                fir=sec;
                sec=sec.next;
            }
        }
        return head;
    }
}
