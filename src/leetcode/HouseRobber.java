package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/4
 * @Version 1.0
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 1) {
            return Math.max(nums[0], nums[1]);
        }
        int[] value = new int[nums.length];
        value[0] = nums[0];
        value[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            value[i] = Math.max(value[i - 2] + nums[i], value[i - 1]);
        }
        return value[nums.length - 1];
    }
}
