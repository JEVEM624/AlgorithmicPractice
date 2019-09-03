package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/2
 * @Version 1.0
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int res=0;
        res+=helper(nums, 1,S ,nums[0] );
        res+=helper(nums, 1, S,-nums[0]);
        return res;
    }
    public int helper(int[]nums,int i,int targer,int sum){
        if (i==nums.length){
            if (targer==sum){
                return 1;
            }
            return  0;
        }
        int res=0;
        res=res+helper(nums, i+1, targer, sum+nums[i]);
        res=res+helper(nums, i+1, targer, sum-nums[i]);
        return res;
    }
}
