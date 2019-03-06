package leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author JEVEM624
 * @Date 2019/3/5
 * @Version 1.0
 */
public class IncreasingSubsequences {
    public static void main(String[] args) {
        new IncreasingSubsequences().findSubsequences(new int[]{4,6,7,7});
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        if (nums.length<1){
            return result;
        }
        ArrayList<ArrayList<ArrayList<Integer>>>index=new ArrayList<>();
        {
            ArrayList<Integer>temp=new ArrayList<>();
            ArrayList<ArrayList<Integer>>temp2=new ArrayList<>();
            temp.add(nums[0]);
            temp2.add(temp);
            index.add(temp2);
        }
        for (int i = 1; i < nums.length; i++) {
            ArrayList<ArrayList<Integer>>temp=new ArrayList<>();
            for (int j = 0; j < i; j++) {

                if (nums[i]>=nums[j]){
                    ArrayList<Integer>temp2=new ArrayList<>();
                    temp2.add(nums[j]);
                    temp2.add(nums[i]);
                    temp.add(temp2);
                    for(ArrayList<Integer>arrayList:index.get(j)){
                        ArrayList<Integer> temp3=(ArrayList<Integer>)arrayList.clone();
                        temp3.add(nums[i]);
                        temp.add(temp3);
                    }
                }
            }
            index.add(temp);
        }
        for (int i = 1; i < index.size(); i++) {
            for(ArrayList<Integer>temp:index.get(i)){
                result.add(temp);
            }
        }
        result.remove(0);
        Set<List<Integer>>set=new LinkedHashSet<>();
        set.addAll(result);
        result.clear();
        result.addAll(set);
        return result;
    }
}
