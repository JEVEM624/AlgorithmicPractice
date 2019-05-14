package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/13
 * @Version 1.0
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[]left=new int[nums.length];
        int[]right=new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            left[i]=left[i-1]*nums[i];
        }
        for (int i = nums.length-2; i >-1; i--) {
            right[i]=right[i+1]*nums[i];
        }
        int[]res=new int[nums.length];
        for (int i = 1; i < res.length-1; i++) {
            res[i]=left[i-1]*right[i+1];
        }
        res[0]=right[1];
        res[nums.length-1]=left[nums.length-2];
        return res;
    }
}
