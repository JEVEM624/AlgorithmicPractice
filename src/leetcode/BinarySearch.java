package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/15
 * @Version 1.0
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while (left<right){
            if (target==nums[mid]){
                return mid;
            }
            if (nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return -1;
    }
}
