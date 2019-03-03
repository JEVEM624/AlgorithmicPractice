package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/3
 * @Version 1.0
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                len++;
            } else {
                max = Math.max(max, len);
                len = 0;
            }
            max = Math.max(max, len);
        }
        return max;
    }
}
