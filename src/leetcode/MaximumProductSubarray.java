package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/1
 * @Version 1.0
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(new MaximumProductSubarray().maxProduct(new int[]{-1,2,-3,4,-5,6}));
    }
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int[]dp=new int[nums.length];
        int[]dp2=new int[nums.length];
        dp[0]=nums[0];
        dp2[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1]*nums[i],nums[i]);
            dp[i]=Math.max(dp[i],dp2[i-1]*nums[i]);
            dp2[i]=Math.min(dp2[i-1]*nums[i],nums[i]);
            dp2[i]=Math.min(dp2[i],nums[i]*dp[i-1]);
        }
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
