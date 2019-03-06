package nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/3/6
 * @Version 1.0
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack=new Stack();
        while(listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        ArrayList<Integer>result=new ArrayList<>();
        ListNode temp;
        while(!stack.isEmpty()){
            temp=stack.pop();
            result.add(temp.val);
        }
        return result;
    }
}
