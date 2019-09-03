package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author JEVEM624
 * @Date 2019/8/21
 * @Version 1.0
 */
public class OnesandZeroes {
    public static void main(String[] args) {
        int i=new OnesandZeroes().findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        Map<String, Node> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            map.put(strs[i], new Node(strs[i]));
        }
        Arrays.sort(strs);
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
//        dp[0][0][0]=0;
        for (int i = 1; i <= strs.length; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    Node node = map.get(strs[i-1]);
                    dp[i][j][k]=dp[i - 1][j][k];
                    if (j >= node.m && k >= node.n) {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - node.m][k - node.n]+1);
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }

    class Node {
        int m;
        int n;

        public Node(String s) {
            int m = 0;
            int n = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    m++;
                } else {
                    n++;
                }
            }
            this.m = m;
            this.n = n;
        }
    }
}
