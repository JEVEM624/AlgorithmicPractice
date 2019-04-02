package leetcode;

import org.omg.CORBA.MARSHAL;

/**
 * @Author JEVEM624
 * @Date 2019/4/2
 * @Version 1.0
 */
public class MaximumLengthofRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int[][]dp=new int[B.length][A.length];
        for (int i = 0; i < A.length; i++) {
            if (B[0]==A[i]){
                dp[0][i]=1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (A[0]==B[i]){
                dp[i][0]=1;
            }
        }
        for (int i = 1; i < B.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (B[i]==A[j]){
                    dp[i][j]=Math.max(dp[i-1][j-1]+1,1);
                }else {
                    dp[i][j]=0;
                }
            }
        }
        int max=0;
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                max= Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
