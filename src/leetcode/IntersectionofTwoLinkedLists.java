package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/21
 * @Version 1.0
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temphead=headA;
        int lenA=0;
        int lenB=0;
        while (temphead!=null){
            lenA++;
            temphead=temphead.next;
        }
        temphead=headB;
        while (temphead!=null){
            lenB++;
            temphead=temphead.next;
        }
        int i=Math.abs(lenA-lenB);
        if (lenA>lenB){
            while (i>0){
                headA=headA.next;
                i--;
            }
        }else {
            while (i>0){
                headB=headB.next;
                i--;
            }
        }
        while (headA!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
