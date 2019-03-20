package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/3/20
 * @Version 1.0
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head==null){
            return;
        }
        ListNode temp=head;
        Deque<ListNode>deque=new ArrayDeque<>();
        while (head!=null){
            deque.add(head);
            head=head.next;
        }
        head=temp;
        deque.removeFirst();
        boolean flag=false;
        while (deque.size()>0){
            if (!flag){
                head.next=deque.removeLast();
                flag=true;
            }else {
                head.next=deque.removeFirst();
                flag=false;
            }
            head=head.next;
        }
        head.next=null;
        head=temp;
    }
}
