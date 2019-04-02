package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author JEVEM624
 * @Date 2019/4/2
 * @Version 1.0
 */
public class CountNumberswithUniqueDigits {
    int sum=0;
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0){
            return 1;
        }
        int max = (int) Math.pow(10, n);
        for (int i = 1; i < 10; i++) {
            Set<Integer>set=new HashSet<>();
            set.add(i);
            helper(i, set,max);
            sum++;
            set.remove(i);
        }
        return sum+1;
    }
    public void helper(int num, Set<Integer>set, int max) {

        for (int i = 0; i < 10; i++) {
            if (num*10+i>=max){
                return;
            }
            if (set.contains(i)){
                continue;
            }else {
                set.add(i);
                sum++;
                helper(num*10+i, set,max);
                System.out.println(num*10+i);
            }
            set.remove(i);
        }
    }
}
