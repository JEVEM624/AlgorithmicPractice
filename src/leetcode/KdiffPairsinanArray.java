package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/4/1
 * @Version 1.0
 */
public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        int sum=0;
        int temp=-9999;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==temp){
                continue;
            }
            if (helper(nums, i+1, k+nums[i])){
                sum++;
            }
            temp=nums[i];
        }
        return sum;
    }
    public boolean helper(int[]nums,int begin,int target){
        int last=nums.length-1;
        int mid=(begin+last)/2;
        while (last>=begin) {
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid]>target){
                last=mid-1;
            }else {
                begin=mid+1;
            }
            mid=(begin+last)/2;
        }
        return false;
    }
}
