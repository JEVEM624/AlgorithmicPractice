package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/17
 * @Version 1.0
 */
public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));
    }

    public int shipWithinDays(int[] weights, int D) {
        int sum=0;
        for (int i = 0; i < weights.length; i++) {
            sum=sum+weights[i];
        }
        int begin=0;
        int end=sum;
        int mid=sum/2;
        int minWeight=500000;
        while (begin<=end){
            int temp=0;
            int day=0;
            for (int i = 0; i < weights.length; i++) {
                if (temp+weights[i]>mid){
                    if (weights[i]>mid){
                        day=500001;
                        break;
                    }
                    temp=weights[i];
                    day++;
                }else {
                    temp=temp+weights[i];
                }
            }
            day++;
            if (day<=D){
                minWeight=Math.min(minWeight, mid);
                end=mid-1;
                mid=(end+begin)/2;
            }else if (day>D){
                begin=mid+1;
                mid=(end+begin)/2;
            }
        }
        return minWeight;
    }
}
