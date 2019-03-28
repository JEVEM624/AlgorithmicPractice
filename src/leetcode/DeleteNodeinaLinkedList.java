package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/27
 * @Version 1.0
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        while (node.next.next!=null){
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }
}
