package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/2/28
 * @Version 1.0
 */
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-2 && nums[i] <= 0; i++) {
            if (i != 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            for (int j = nums.length-1; nums[j] >= 0 && j > i; j--) {
                if (j != nums.length-1) {
                    if (nums[j] == nums[j + 1]) {
                        continue;
                    }
                }
                int key = Arrays.binarySearch(nums, i+1,j,0 - (nums[i] + nums[j]));
                if (key >-1) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[key]);
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
