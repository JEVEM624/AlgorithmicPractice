package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/8/14
 * @Version 1.0
 */
public class StatisticsfromaLargeSample {
    public static void main(String[] args) {
        int[] count=new int[]{0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        new StatisticsfromaLargeSample().sampleStats(count);
    }
    public double[] sampleStats(int[] count) {
        int left=0;
        int right=255;
        while (count[left]==0){
            left++;
        }
        while (count[right]==0){
            right--;
        }
        int min=left;
        int max=right;
        long sum=0;
        long length=0;
        int time=count[left];
        int p=left;
        int beg=left;
        while (left<=right){
            length=length+count[left];
            sum=sum+left*count[left];
            if (count[left]>time){
                time=count[left];
                p=left;
            }
            left++;
        }
        double mid=0;
        if (length%2==0){
            long q=length/2-1;
            long w=q+1;
            long t=0;
            while (t<=q){
                t=t+count[beg];
                beg++;
            }
            int first=beg-1;
            while (t<=w){
                t=t+count[beg];
                beg++;
            }
            int sec=beg-1;
            mid=((double)first+(double)sec)/2;

        }else {
            long q=length/2-1;

            long t=0;
            while (t<=q){
                t=t+count[beg];
                beg++;
            }
            mid=beg-1;
        }
        return new double[]{min,max,((double)sum/(double)length),mid,p};
    }
}
