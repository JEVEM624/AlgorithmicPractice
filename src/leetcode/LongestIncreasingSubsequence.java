package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/27
 * @Version 1.0
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    public int lengthOfLIS(int[] nums) {
        int[] index = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        index[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    index[i] = Math.max(index[i], index[j] + 1);
                }
            }
            index[i] = Math.max(index[i], 1);
        }
        int max = 0;
        for (int i = 0; i < index.length; i++) {
            max = Math.max(max, index[i]);
        }
        return max;
    }
}
