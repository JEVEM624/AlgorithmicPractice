package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author JEVEM624
 * @Date 2019/8/23
 * @Version 1.0
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        Comparator cmp=new cmp();
        String[]strs=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,cmp);
        if (strs.length==0||strs[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
    class cmp implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            String a=o1+o2;
            String b=o2+o1;
            return b.compareTo(a);
        }
    }
}
