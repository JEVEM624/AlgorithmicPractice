package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/23
 * @Version 1.0
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode first=head;
        ListNode sec=head;
        ListNode begn=head;
        int num=1;
        while(first.next!=null){
            num++;
            first=first.next;
        }
        k=k%num;
        if(k==0){
            return head;
        }

        for (int i = 0; i < k; i++) {
            sec=sec.next;
        }
        while(sec.next!=null){
            head=head.next;
            sec=sec.next;
        }
        ListNode resutlt=head.next;
        sec.next=begn;
        head.next=null;
        return resutlt;
    }
}
