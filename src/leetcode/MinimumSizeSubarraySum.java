package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/14
 * @Version 1.0
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0]>s?1:0;
        }
        int sum=0;
        int left=0;
        int right=1;
        if (nums[left]>s||nums[right]>s){
            return 1;
        }
        int min=Integer.MAX_VALUE;
        sum=nums[left]+nums[right];
        while (right<nums.length){
            if (left<=right&&sum>=s){
                min=Math.min(min, right-left+1);
                sum=sum-nums[left];
                left++;
            }else {
                right++;
                if (right==nums.length){
                    break;
                }
                sum=sum+nums[right];
            }
        }
        while (left<right){
            if (left<=right&&sum>=s){
                min=Math.min(min, right-left+1);
                sum=sum-nums[left];

            }else {
                break;
            }
            left++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
