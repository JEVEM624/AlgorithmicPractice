package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author JEVEM624
 * @Date 2019/3/15
 * @Version 1.0
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println(new SlidingWindowMaximum().maxSlidingWindow(new int[]{2, 4, 7}, 2));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 1 || k < 1) {
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        Queue<Integer> queue = new PriorityQueue<>(k + 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1 + o2;
            }
        });
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        result[0] = queue.peek();
        for (int i = k; i < nums.length; i++) {
            queue.add(nums[i]);
            queue.remove(nums[i - k]);
            result[i - k + 1] = queue.peek();
        }
        return result;
    }
}
