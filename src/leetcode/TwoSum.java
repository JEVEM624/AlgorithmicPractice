package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author JEVEM624
 * @Date 2019/1/19
 * @Version 1.0
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum={2,7,11,15};
        int target =9;
        System.out.println(new TwoSum().twoSum(twoSum,target));
    }
    public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i< nums.length-1;i++){
//            for(int k=i+1;k<nums.length;k++){
//                if(nums[i]+nums[k]==target){
//                    return new int[] {i,k};
//                }
//            }
//        }
//        return null;
//    }
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;
    }
}
