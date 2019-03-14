package leetcode;

import java.util.HashMap;

/**
 * @Author JEVEM624
 * @Date 2019/3/14
 * @Version 1.0
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int sum=map.get(nums[i]);
                sum++;
                if (sum>nums.length/2){
                    return nums[i];
                }
                map.put(nums[i],sum);
            }else {
                map.put(nums[i],1);
            }
        }
        return 0;
    }
}
