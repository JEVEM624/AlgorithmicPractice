package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/7
 * @Version 1.0
 */
public class CoinChange {
    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int[] val = new int[amount + 1];
        for (int i = 0; i < val.length; i++) {
            val[i]=999;
        }
        val[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j<coins[i]){
                    continue;
                }
                val[j]=Math.min(val[j],val[j-coins[i]]+1);
            }
        }
        return val[amount]!=999?val[amount]:-1;
    }
}
