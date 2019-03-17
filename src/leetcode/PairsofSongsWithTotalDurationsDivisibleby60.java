package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/17
 * @Version 1.0
 */
public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public int numPairsDivisibleBy60(int[] time) {
        int sum=0;
        for (int i = 0; i < time.length-1; i++) {
            for (int j = i+1; j < time.length; j++) {
                if ((time[i]+time[j])%60==0){
                    sum++;
                }
            }
        }
        return sum;
    }
}
