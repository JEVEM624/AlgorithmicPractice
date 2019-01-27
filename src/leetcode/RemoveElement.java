package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        for (int i=0;i<length;i++){
            if(nums[i]==val){
                nums[i]=nums[length-1];
                length--;
                i--;
            }
        }
        return length;
    }
}
