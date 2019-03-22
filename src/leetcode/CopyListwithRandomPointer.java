package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/21
 * @Version 1.0
 */
public class CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temphead = head;
        while (temphead != null) {
            Node temp = new Node(temphead.val, temphead.next, temphead.random);
            temphead.next = temp;
            temphead = temphead.next.next;
        }
        temphead = head;
        while (temphead != null) {
            Node temp = temphead.next;
            if (temp.random != null) {
                temp.random = temp.random.next;
            }
            temphead = temp.next;
        }
        Node rehead = head.next;
        head.next = rehead.next;
        head = head.next;
        temphead = rehead;
        while (head != null) {
            temphead.next = head.next;
            head.next = temphead.next.next;
            head = head.next;
            temphead = temphead.next;
        }
        return rehead;
    }
}
