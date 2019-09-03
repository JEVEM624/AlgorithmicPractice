package leetcode;

import java.util.HashMap;

/**
 * @Author JEVEM624
 * @Date 2019/8/23
 * @Version 1.0
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer t=map.get(nums[i]);
            if (t==null){
                map.put(nums[i],i);
            }else {
                if(i-t<=k){
                    return true;
                }else {
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
