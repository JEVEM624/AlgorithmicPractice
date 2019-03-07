package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/7
 * @Version 1.0
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;

            }else{sum++;}
        }
        for (int i = nums.length-sum; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
