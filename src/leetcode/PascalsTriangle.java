package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/8/23
 * @Version 1.0
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>last=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        last.add(1);
        res.add(new ArrayList<>(last));
        for (int i = 2; i <=numRows; i++) {
            List<Integer>now=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j==0){
                    now.add(1);
                }else if (j==i-1){
                    now.add(1);
                }else {
                    now.add(last.get(j-1)+last.get(j));
                }
            }
            res.add(now);
            last=now;
        }
        return res;
    }
}
