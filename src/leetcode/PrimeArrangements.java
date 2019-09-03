package leetcode;

import java.util.HashSet;

/**
 * @Author JEVEM624
 * @Date 2019/9/1
 * @Version 1.0
 */
public class PrimeArrangements {
    public int numPrimeArrangements(int n) {
        int[]prime=new int[]{0,0,1,2,2,3,3,4,4,4,4,5,5,6,6,6,6,7,7,8,8,8,8,9,9,9,9,9,9,10,10,11,11,11,11,11,11,12,12,12,12,13,13,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,17,17,18,18,18,18,18,18,19,19,19,19,20,20,21,21,21,21,21,21,22,22,22,22,23,23,23,23,23,23,24,24,24,24,24,24,24,24,25,25,25,25};
        long a=1;
        long b=1;
        for (int i = 1; i <= prime[n]; i++) {
            a=a*i%1000000007;
        }
        for (int i = 1; i <=n-prime[n] ; i++) {
            b=b*i%1000000007;
        }

        return (int)(a*b%1000000007);
    }

    public static void main(String[] args) {
        int i=new PrimeArrangements().numPrimeArrangements(100);
        System.out.println(i);
    }
}
