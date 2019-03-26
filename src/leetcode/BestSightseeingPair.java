package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/24
 * @Version 1.0
 */
public class BestSightseeingPair {
    public static void main(String[] args) {
        new BestSightseeingPair().maxScoreSightseeingPair(new int[]{8,1,5,2,6});
    }
    public int maxScoreSightseeingPair(int[] A) {
        int max=0;
        int[]m=new int[A.length];
        m[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            m[i]=Math.max(m[i-1],A[i]+i);
        }
        for (int i = 1; i < A.length; i++) {
            max=Math.max(max, m[i-1]-i+A[i]);
        }
        return max;
    }
}
