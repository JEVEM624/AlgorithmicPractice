package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/15
 * @Version 1.0
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int begin = -1, end = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;

            }
            if (nums[mid] == target) {
                break;
            }
            mid = (left + right) / 2;
        }
        if (nums[mid] == target) {
            begin = mid;
            end = mid;
        }
        while (begin - 1 >= 0 && nums[begin - 1] == target) {
            begin--;
        }
        while (end + 1 < nums.length && nums[end + 1] == target) {
            end++;
        }
        return new int[]{begin, end};
    }
}
