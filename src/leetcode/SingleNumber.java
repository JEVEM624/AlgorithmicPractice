package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/23
 * @Version 1.0
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{1,1,2}));
    }
    public int singleNumber(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int result=nums[0];

        for (int i = 1; i <nums.length; i++) {
            result=result^nums[i];
        }
        return result;
    }
}
