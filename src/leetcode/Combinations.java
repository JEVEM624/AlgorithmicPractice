package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/5/3
 * @Version 1.0
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer>tmp=new ArrayList<>();
            tmp.add(i);
            helper(res, tmp,i,n, 1, k);
        }
        return res;
    }
    public void helper(List<List<Integer>>res,List<Integer>temp,int last,int n,int now,int k){
        if (now==k){
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        for (int i = last+1; i <= n; i++) {
            temp.add(i);
            helper(res, temp,i,n, now+1, k);
        }
        temp.remove(temp.size()-1);
    }
}
