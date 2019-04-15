package leetcode;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/4/15
 * @Version 1.0
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[]result=new int[nums.length];
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty()){
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                result[stack.pop()]=nums[i];
            }
            stack.push(i);
        }
        for (int i = 0; i < nums.length&&!stack.isEmpty(); i++) {
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                result[stack.pop()]=nums[i];
            }
        }
        while (!stack.isEmpty()){
            result[stack.pop()]=-1;
        }
        return result;
    }
}
