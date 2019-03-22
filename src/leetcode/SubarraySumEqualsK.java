package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/22
 * @Version 1.0
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[]sum=new int[nums.length+1];
        sum[0]=nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1]=sum[i]+nums[i];
        }
        int result=0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j <= nums.length; j++) {
                if (sum[j]-sum[i]==k){
                    result++;
                }
            }
        }
        return result;
    }
}
