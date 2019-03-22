package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/22
 * @Version 1.0
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        new FindPivotIndex().pivotIndex(new int[]{-1,-1,-1,-1,-1,0});
    }
    public int pivotIndex(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
        }
        int leftsum=0;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum==sum-leftsum-nums[i]){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}
