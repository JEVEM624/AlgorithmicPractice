package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/14
 * @Version 1.0
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid + 1] > nums[mid]) {
                l = mid;
                continue;
            }
            if (nums[mid - 1] > nums[mid]) {
                r = mid;
            }
        }
        return -1;
    }
}
