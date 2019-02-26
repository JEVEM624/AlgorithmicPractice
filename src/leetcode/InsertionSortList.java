package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/26
 * @Version 1.0
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }
        ListNode index=head.next;
        ListNode last=head;
        while (index != null) {
            if(index.val<head.val){
                last.next=index.next;
                ListNode temp=index.next;
                index.next=head;
                head=index;
                index=temp;
            }else {
                ListNode temp=head;
                while(temp!=last){
                    if(index.val>=temp.val&&index.val<=temp.next.val){
                        last.next=index.next;
                        index.next=temp.next;
                        temp.next=index;
                        break;
                    }
                    temp=temp.next;
                }
                if (temp==last){
                    last=index;
                }
                index=last.next;
            }
        }
        return head;
    }
}
