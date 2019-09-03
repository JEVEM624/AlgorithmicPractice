package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/21
 * @Version 1.0
 */
public class CoinChange2 {
    public static void main(String[] args) {
        new CoinChange2().change(5, new int[]{1,2,5});
    }
    public int change(int amount, int[] coins) {
        int[]dp=new int[amount+1];
        dp[0]=1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j]=dp[j]+dp[j-coins[i]];}
        }
        return dp[amount];
    }
}
