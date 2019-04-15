package leetcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author JEVEM624
 * @Date 2019/4/15
 * @Version 1.0
 */
public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int j=(int)Math.sqrt(c);
        int i=0;
        while (i<=j){
            int num=i*i+j*j;
            if (num==c){
                return true;
            }
            if (num>c){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}
