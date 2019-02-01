package nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/2/1
 * @Version 1.0
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        ListNode flag=head;
        ListNode result=head;
        if(head==null||k==0){
            return null;
        }
        for (int i = 1; i < k ; i++) {
            if(flag.next==null){
                return null;
            }
            flag=flag.next;
        }
        while(flag.next!=null){
            flag=flag.next;
            result=result.next;
        }
        return result;
    }
}
