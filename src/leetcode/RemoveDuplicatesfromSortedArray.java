package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[]nums={1,1,2};
        System.out.println(new RemoveDuplicatesfromSortedArray().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int length=nums.length;
        int flag=1;
        int ele=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==ele){
                length--;
            }else{
                nums[flag]=nums[i];
                ele=nums[flag];
                flag++;
            }
        }
        return length;
    }
}
