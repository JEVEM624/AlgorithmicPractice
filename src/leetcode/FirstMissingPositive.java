package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/5/2
 * @Version 1.0
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=0||nums[i]<k){
                continue;
            }
            if (nums[i]!=k){
                return k;
            }
            k++;
        }
        return k;
    }
}
