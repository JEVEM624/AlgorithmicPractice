package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/5/9
 * @Version 1.0
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size()==0||triangle.get(0).size()==0){
            return 0;
        }
        int[][]dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        dp[0][0]=triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j==0){
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }else if (j==triangle.get(i).size()-1){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }else {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < dp[triangle.size()-1].length; i++) {
            min=Math.min(min, dp[triangle.size()-1][i]);
        }
        return min;
    }
}
