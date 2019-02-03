package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/3
 * @Version 1.0
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 1));
    }

    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int flag = last / 2;
        while (first <= last) {
            if (nums[flag] == target) {
                return flag;
            }
            if (nums[flag] > target) {
                last = flag-1;
            } else {
                first = flag+1;
            }
            flag = (first + last) / 2;
        }
        return nums[flag]>target?flag:flag+1;
    }
}
