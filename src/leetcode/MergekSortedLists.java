package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author JEVEM624
 * @Date 2019/2/23
 * @Version 1.0
 */
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ArrayList<Integer>result=new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode node=lists[i];
            while(node!=null){
                result.add(node.val);
                node=node.next;
            }
        }
        if(result.size()==0){
            return null;
        }
        Collections.sort(result);
        ListNode head=new ListNode(result.get(0));
        ListNode temp=head;
        for (int i = 1; i < result.size(); i++) {
            temp.next=new ListNode(result.get(i));
            temp=temp.next;
        }
        return head;
    }
}
