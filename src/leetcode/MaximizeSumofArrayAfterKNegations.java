package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/3/10
 * @Version 1.0
 */
public class MaximizeSumofArrayAfterKNegations {
    public static void main(String[] args) {
        System.out.println(new MaximizeSumofArrayAfterKNegations().largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));

    }

    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int j = 0;
        int num = 0;
        int sum=0;
        while (A[j] < 0) {
            j++;
        }
        if (j < K) {
            while (num < j) {
                A[num] = -A[num];
                num++;
                K--;
            }
        } else {
            while (num<K){
                A[num]=-A[num];
                num++;
            }
            for (int i = 0; i < A.length; i++) {
                sum=sum+A[i];
            }
            return sum;
        }
        Arrays.sort(A);
        K=K%2;
        for (int i = 0; i < K; i++) {
            A[i]=-A[i];
        }
        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
        }
        return sum;

    }
}
