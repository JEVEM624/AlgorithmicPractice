package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/5/13
 * @Version 1.0
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
