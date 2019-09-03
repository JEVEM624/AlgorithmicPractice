package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class JumpGame {
    public static void main(String[] args) {
        int[]nums={0};
        System.out.println(new JumpGame().canJump(nums));
    }
    public boolean canJump(int[] nums) {
        boolean[]dp=new boolean[nums.length+1];
        dp[0]=true;

        for (int i = 0; i < dp.length-1; i++) {
            if(!dp[i]){
                return false;
            }
            for (int j = 0; j <= nums[i]; j++) {
                if (i+j>nums.length-1){
                    return true;
                }
                dp[i+j]=true;
            }
        }
        return dp[nums.length-1];
    }
}
