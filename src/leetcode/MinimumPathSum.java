package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/4
 * @Version 1.0
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        new MinimumPathSum().minPathSum(new int[][]{
                {1,2,5},
                {3,2,1}});
    }

    public int minPathSum(int[][] grid) {
        if (grid.length==0){
            return 0;
        }
        int h = grid.length;
        int l = grid[0].length;
        int[][] result = new int[h][l];
        result[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[h-1][l-1];
    }
}
