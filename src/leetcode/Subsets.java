package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/11
 * @Version 1.0
 */
public class Subsets {
    public static void main(String[] args) {
        new Subsets().subsets(new int[]{1, 2, 3});
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int l = temp.size();
            for (int j = 0; j < l; j++) {
                List<Integer> temp2 = new ArrayList<>(temp.get(j));
                temp2.add(nums[i]);
                temp.add(temp2);
            }
            ArrayList<Integer> temp3 = new ArrayList<>();
            temp3.add(nums[i]);
            temp.add(temp3);
            result.addAll(temp);
        }
        temp.add(new ArrayList<>());
        return temp;
    }
}
