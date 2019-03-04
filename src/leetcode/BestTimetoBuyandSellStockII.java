package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/4
 * @Version 1.0
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int val=0;
        if (prices.length<1){
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]-prices[i-1]>0){
                val=val+prices[i]-prices[i-1];
            }
        }
        return val;
    }
}
