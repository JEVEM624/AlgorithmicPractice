package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/4/1
 * @Version 1.0
 */
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean>result=new ArrayList<>();
        int num=0;
        for (int i = 0; i < A.length; i++) {
            num=num*2+A[i];
            num=num%5;
            if (num==0){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
