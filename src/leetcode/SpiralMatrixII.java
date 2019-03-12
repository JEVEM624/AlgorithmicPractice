package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/12
 * @Version 1.0
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int i = n - 1;
        int j = n - 1;
        int h = 0;
        int l = 0;
        int sum = 1;
        int max = n * n;
        int[][] result = new int[n][n];
        while (n <= max) {
            for (int k = l; k <= j; k++) {
                result[h][k] = sum;
                sum++;
            }
            if (sum > max) {
                break;
            }
            for (int k = h + 1; k <= i; k++) {
                result[k][j] = sum;
                sum++;
            }
            if (sum > max) {
                break;
            }
            for (int k = j - 1; k >= l; k--) {
                result[i][k] = sum;
                sum++;
            }
            if (sum > max) {
                break;
            }
            for (int k = i - 1; k > h; k--) {
                result[k][l] = sum;
                sum++;
            }
            i--;
            j--;
            h++;
            l++;
        }
        return result;
    }
}
