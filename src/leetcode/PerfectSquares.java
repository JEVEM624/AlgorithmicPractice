package leetcode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/31
 * @Version 1.0
 */
public class PerfectSquares {
    public static void main(String[] args) {
        new PerfectSquares().numSquares(12);
    }
    public int numSquares(int n) {
        if (n==0){
            return 1;
        }
        int[]dp=new int[n+1];
        List<Integer> list=new ArrayList<>();
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        for (int i = 0; i*i <= n; i++) {
            dp[i*i]=1;
            list.add(i*i);
        }

        if (dp[n]!=Integer.MAX_VALUE-1){
            return dp[n];
        }
        for (int i = 0; i < list.size(); i++) {
            int k=list.get(i);
            for (int j = k; j < dp.length; j++) {
                dp[j]=Math.min(dp[j],dp[j-k]+1);
            }
        }
        return dp[n];
    }
}
