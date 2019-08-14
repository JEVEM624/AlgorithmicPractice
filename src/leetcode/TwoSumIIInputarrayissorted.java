package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/14
 * @Version 1.0
 */
public class TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num == target) {
                return new int[]{left+1, right+1};
            }
            if (num > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}
