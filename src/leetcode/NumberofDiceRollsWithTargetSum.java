package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/14
 * @Version 1.0
 */
public class NumberofDiceRollsWithTargetSum {
    public static void main(String[] args) {
        new NumberofDiceRollsWithTargetSum().numRollsToTarget(1, 1, 0);
    }

    public int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d + 1][target + 1];
        dp[0][0]=1;
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= f; j++) {
                for (int k = j; k <= target; k++) {
                    dp[i][k] = (dp[i][k] + dp[i - 1][k - j]) % 1000000007;
                }
            }
        }
        return dp[d][target];
    }
}
