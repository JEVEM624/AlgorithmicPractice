package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/27
 * @Version 1.0
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        if (obstacleGrid[0][0] == 1) {
            map[0][0] = 0;
        } else {
            map[0][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                map[i][0] = 0;
            } else {
                map[i][0] = map[i - 1][0];
            }

        }
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                map[0][i] = 0;
            } else {
                map[0][i] = map[0][i - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                }
            }
        }
        return map[m - 1][n - 1];
    }
}
