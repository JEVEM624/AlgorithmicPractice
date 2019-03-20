package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/19
 * @Version 1.0
 */
public class MissingNumber {
    public static void main(String[] args) {
        new MissingNumber().missingNumber(new int[]{0,1,2});
    }
    public int missingNumber(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
        }
        return (nums.length+1)*nums.length/2-sum;
    }
}
