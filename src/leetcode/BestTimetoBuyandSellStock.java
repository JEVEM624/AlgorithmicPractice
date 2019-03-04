package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/4
 * @Version 1.0
 */
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{7,1,5,3,6,4}));

    }
    public int maxProfit(int[] prices) {
        if (prices.length<2){
            return 0;
        }
        int max=0;
        int min=99999;
        int val=0;
        for (int i = 1; i < prices.length; i++) {
            min=Math.min(min, prices[i-1]);
            val=Math.max(val, prices[i]-min);
        }
        return val;
    }
}
