package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/19
 * @Version 1.0
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    public static ListNode add(ListNode l1, ListNode l2, int next) {
        int num = 0;
        ListNode l1Next = null;
        ListNode l2Next = null;
        if (l1 == null && l2 == null && next == 0) {
            return null;
        } else if (l1 == null && l2 == null && next == 1) {
            return new ListNode(1);
        } else if (l1 == null) {
            num = l2.val + next;
            l2Next = l2.next;
        } else if (l2 == null) {
            num = l1.val + next;
            l1Next = l1.next;
        } else {
            l2Next = l2.next;
            l1Next = l1.next;
            num = l1.val + l2.val + next;
        }
        ListNode sum = null;
        if (num > 9) {
            sum = new ListNode(num % 10);
            sum.next = add(l1Next, l2Next, 1);
        } else {
            sum = new ListNode(num % 10);
            sum.next = add(l1Next, l2Next, 0);
        }
        return sum;
    }
}
