package leetcode;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @Author JEVEM624
 * @Date 2019/3/22
 * @Version 1.0
 */
public class FruitIntoBaskets {
    public static void main(String[] args) {
        System.out.println(new FruitIntoBaskets().totalFruit(new int[]{1,2,3,2,2}));
    }

    public int totalFruit(int[] tree) {
        int[] diff = new int[tree.length];
        int[] sum = new int[tree.length];

        if (tree.length == 0) {
            return 0;
        }
        diff[0] = -1;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(tree[0]);
        sum[0]=1;
        for (int i = 1; i < tree.length; i++) {
            if (list.contains(tree[i])) {
                if (tree[i] == tree[i - 1]) {
                    sum[i] = sum[i - 1] + 1;
                    diff[i] = diff[i - 1];
                } else {
                    sum[i] = sum[i - 1] + 1;
                    diff[i] = i - 1;
                }
            } else {
                if (list.size() < 2) {
                    sum[i] = sum[i - 1] + 1;
                    diff[i] = i - 1;
                    list.add(tree[i]);
                } else {
                    if (list.getFirst() == tree[diff[i-1]]) {
                        list.remove(0);
                    } else {
                        list.remove(1);
                    }
                    list.add(tree[i]);
                    sum[i] = i-diff[i-1];
                    diff[i] = i - 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}
