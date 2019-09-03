package leetcode;

import javax.imageio.ImageTranscoder;

/**
 * @Author JEVEM624
 * @Date 2019/8/16
 * @Version 1.0
 */
public class LongestIncreasingPathinaMatrix {
    public static void main(String[] args) {
        new LongestIncreasingPathinaMatrix().longestIncreasingPath(new int[][]{{6,8,15,17,3,2,16,16},{12,6,12,17,17,5,11,10},{2,18,1,19,0,7,3,1},{15,18,17,0,11,7,19,8},{18,9,13,0,12,2,14,5},{13,3,0,11,13,11,5,3},{10,3,9,0,7,16,4,13},{9,18,9,19,5,15,4,5},{10,16,5,9,17,14,2,17},{4,8,15,15,10,8,2,18},{16,1,13,3,16,5,13,4},{6,5,4,19,19,14,7,19},{3,1,7,13,0,12,0,18},{9,12,1,16,5,15,7,19},{0,15,1,13,9,1,9,19},{10,8,5,13,13,18,6,1}});
    }
    int[][]rec;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length==0||matrix[0].length==0){
            return 0;
        }
        rec=new int[matrix.length][matrix[0].length];
        int max = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int tmpMax=1;
                if (rec[i][j]!=0){
                    continue;
                }
                if (i - 1 >= 0) {
                    if (matrix[i - 1][j] > matrix[i][j]) {
                        tmpMax = Math.max(tmpMax, 1 + maxLIP( matrix, i - 1, j));
                    }
                }
                if (i + 1 < matrix.length) {
                    if (matrix[i + 1][j] > matrix[i][j]) {
                        tmpMax = Math.max(tmpMax, 1 + maxLIP( matrix, i + 1, j));
                    }
                }

                if (j - 1 >= 0) {
                    if (matrix[i][j - 1] > matrix[i][j]) {
                        tmpMax = Math.max(tmpMax, 1 + maxLIP( matrix, i, j - 1));
                    }
                }
                if (j + 1 < matrix[i].length) {
                    if (matrix[i][j + 1] > matrix[i][j]) {
                        tmpMax = Math.max(tmpMax, 1 + maxLIP(matrix, i, j + 1));
                    }
                }
                rec[i][j]=tmpMax;
                max=Math.max(tmpMax, max);

            }
        }
        return max;
    }

    int maxLIP(int[][] matrix, int i, int j) {
        int max = 1;

        if (rec[i][j]!=0){
            return rec[i][j];
        }

        if (i - 1 >= 0) {
            if (matrix[i - 1][j] > matrix[i][j] ) {
                max = Math.max(max, 1 + maxLIP(matrix, i - 1, j));
            }
        }
        if (i + 1 < matrix.length) {
            if (matrix[i + 1][j] > matrix[i][j]) {
                max = Math.max(max, 1 + maxLIP( matrix, i + 1, j));
            }
        }
        if (j - 1 >= 0) {
            if (matrix[i][j - 1] > matrix[i][j]) {
                max = Math.max(max, 1 + maxLIP(matrix, i, j - 1));
            }
        }
        if (j + 1 < matrix[i].length) {
            if (matrix[i][j + 1] > matrix[i][j]) {
                max = Math.max(max, 1 + maxLIP( matrix, i, j + 1));
            }
        }
        rec[i][j]=max;

        return max;
    }

}
