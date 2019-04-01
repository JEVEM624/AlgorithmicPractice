package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/1
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        new RemoveDuplicatesfromSortedArrayII().removeDuplicates(new int[]{1,1,1,1,2,2,2,3,3});
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index=1;
        int time=1;
        int temp=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp==nums[i]){
                if (time>=2){
                    continue;
                }else {
                    nums[index]=nums[i];
                    time++;
                    index++;
                }
            }else {
                temp=nums[i];
                time=1;
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
