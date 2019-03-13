package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/3/13
 * @Version 1.0
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, new ArrayList<Integer>(), candidates, target, 0, 0);
        Set<List<Integer>> temp=new HashSet<>(result);
        result.clear();
        result.addAll(temp);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> nums, int[] candidates, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(nums));
            nums.remove(nums.size() - 1);
            return;
        }
        if (sum > target) {
            nums.remove(nums.size() - 1);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            nums.add(candidates[i]);
            helper(result, nums, candidates, target, sum + candidates[i], i+1);
        }
        if (nums.size() > 0) {
            nums.remove(nums.size() - 1);
        }
    }
}
