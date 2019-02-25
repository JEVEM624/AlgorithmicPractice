package nowcoder;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/2/25
 * @Version 1.0
 */
public class IsPopOrder {
    public static void main(String[] args) {
        System.out.println(new IsPopOrder().IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4,3,5,1,2}));
    }

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> s = new Stack<>();
        int index = 1;
        s.push(pushA[0]);
        for (int i = 0; i < popA.length; i++) {
            if (s.lastElement() == popA[i]) {
                s.pop();
                if (index < pushA.length) {
                    s.push(pushA[index]);
                    index++;
                }
            } else {
                if (index == pushA.length) {
                    return false;
                }
                i--;
                s.push(pushA[index]);
                index++;
            }

        }
        return true;
    }
}
