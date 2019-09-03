package leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/20
 * @Version 1.0
 */
public class Permutations {
    public static void main(String[] args) {
        new Permutations().permute(new int[]{1, 2, 3});
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        helper(res, nums, new ArrayList<Integer>(), visit);
        return res;

    }
    private void helper(List<List<Integer>> res, int[] nums, List<Integer> tmp, boolean[] visit) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            tmp.add(nums[i]);
            helper(res, nums, tmp, visit);
            visit[i] = false;
            tmp.remove(tmp.size() - 1);
        }
    }
}
