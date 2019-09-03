package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/31
 * @Version 1.0
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int res = 0;
        int[][] sta = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i < matrix.length + 1; i++) {
            for (int j = 1; j < matrix[0].length + 1; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    sta[i][j] = Math.min(Math.min(sta[i][j - 1], sta[i - 1][j]), sta[i - 1][j - 1]) + 1;
                    res = Math.max(res, sta[i][j]);
                }
            }
        }
        return res * res;
    }
}
