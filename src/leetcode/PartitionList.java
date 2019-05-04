package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/3
 * @Version 1.0
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode l1=new ListNode(-1);
        ListNode l2=new ListNode(-1);
        ListNode index1=l1;
        ListNode index2=l2;
        while (head!=null){
            if (head.val<x){
                index1.next=head;
                index1=index1.next;
            }else {
                index2.next=head;
                index2=index2.next;
            }
            head=head.next;
        }
        index2.next=null;
        index1.next=l2.next;
        return l1.next;
    }
}
