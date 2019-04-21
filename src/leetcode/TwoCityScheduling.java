package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author JEVEM624
 * @Date 2019/4/21
 * @Version 1.0
 */
public class TwoCityScheduling {
    public static void main(String[] args) {
        new TwoCityScheduling().twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}});
    }
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new Comparator<Object>(){
                    @Override
                    public int compare(Object o1, Object o2) {
                        int[] one = (int[]) o1;
                        int[] two = (int[]) o2;
                        int sum1=Math.abs(one[0]-one[1]);
                        int sum2=Math.abs(two[0]-two[1]);
                        return sum2-sum1;
                    }
                }
        );
        int sum=0;
        int n1=0;
        int n2=0;
        int maxLength=costs.length/2;
        int i = 0;
        for (; i < costs.length; i++) {
            if (costs[i][0]>costs[i][1]){
                sum=sum+costs[i][1];
                n2++;
            }else {
                sum=sum+costs[i][0];
                n1++;
            }
            if (n1==maxLength||n2==maxLength){
                break;
            }
        }
        if (n1<maxLength){
            for (int j = i+1; n1 < maxLength; j++) {
                sum=sum+costs[j][0];
                n1++;
            }
        }else {
            for (int j = i+1; n2 < maxLength; j++) {
                sum=sum+costs[j][1];
                n2++;
            }
        }
        return sum;
    }
}
