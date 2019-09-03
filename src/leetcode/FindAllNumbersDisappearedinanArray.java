package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int n=String.valueOf(nums.length).length();
        n=(int)Math.pow(10.0, (double)n)*10;
        for (int i = 0; i < nums.length; i++) {
            int k=nums[i]%n-1;
            nums[k]=nums[k]+n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<n){
                res.add(i+1);
            }
        }
        return res;
    }
}
