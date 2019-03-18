package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/18
 * @Version 1.0
 */
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        while (true){
            int first=0;
            int sec=0;
            if (nums.length<=2){
                return nums[first];
            }
            while (true){
                sec=nums[sec];
                sec=nums[sec];
                first=nums[first];
                if (sec==first){
                    break;
                }
            }
            first=0;
            while (first!=sec){
                first=nums[first];
                sec=nums[sec];
            }
            return sec;
        }
    }
}
