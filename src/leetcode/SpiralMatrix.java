package leetcode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/12
 * @Version 1.0
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        new SpiralMatrix().spiralOrder(new int[][]{
                {1}
        });
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int i = matrix.length - 1;
        if (i < 0) {
            return new ArrayList<>();
        }
        int j = matrix[0].length - 1;

        int h = 0;
        int l = 0;
        List<Integer> result = new ArrayList<>();
        int n = 0;
        int max = matrix.length * matrix[0].length;
        while (n < max) {
            for (int k = l; k <= j; k++) {
                result.add(matrix[h][k]);
                n++;
            }
            if (n >= max) {
                break;
            }
            for (int k = h + 1; k <= i; k++) {
                result.add(matrix[k][j]);
                n++;
            }
            if (n >= max) {
                break;
            }
            for (int k = j - 1; k >= l; k--) {
                result.add(matrix[i][k]);
                n++;
            }
            if (n >= max) {
                break;
            }
            for (int k = i - 1; k > h; k--) {
                result.add(matrix[k][l]);
                n++;
            }
            i--;
            j--;
            h++;
            l++;
        }
        return result;
    }
}
