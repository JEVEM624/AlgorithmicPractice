package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/8/31
 * @Version 1.0
 */
public class IntegerBreak {
    public static void main(String[] args) {
        new IntegerBreak().integerBreak(4);
    }
    public int integerBreak(int n) {
        if(n==0||n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[]dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i < 10; i++) {
            for (int j = i; j <=n; j++) {
                dp[j]=Math.max(dp[j],dp[j-i]*i);
            }
        }
        return dp[n];
    }
}
