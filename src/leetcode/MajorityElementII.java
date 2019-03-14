package leetcode;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/3/14
 * @Version 1.0
 */
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
            List<Integer>result=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])){
                    int sum=map.get(nums[i]);
                    sum++;
                    map.put(nums[i],sum);
                }else {
                    map.put(nums[i],1);
                }
            }
            for (Map.Entry<Integer,Integer>e:map.entrySet()){
                if (e.getValue()>nums.length/3){
                    result.add(e.getKey());
                }
            }
            return result;
        }
}
