package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/15
 * @Version 1.0
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int left=0;
        int right=nums.length-1;
        if (nums[left]<nums[right]){
            return nums[0];
        }
        int mid=(left+right)/2;
        while (left<right){

            if (nums[mid]<nums[right]){
                right=mid-1;
            }else {
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return nums[mid];
    }
}
