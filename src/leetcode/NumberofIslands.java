package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/29
 * @Version 1.0
 */
public class NumberofIslands {
    public static void main(String[] args) {
        new NumberofIslands().numIslands(new char[][]{{'1', '0'}, {'0', '1'}});
    }

    public int numIslands(char[][] grid) {
        if (grid.length < 1 || grid[0].length < 1) {
            return 0;
        }
        int sum = 0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visit[i][j]) {
                    visit[i][j] = true;
                    dfs(grid, visit, i + 1, j);
                    dfs(grid, visit, i, j + 1);
                    dfs(grid, visit, i - 1, j);
                    dfs(grid, visit, i, j - 1);
                    sum++;
                }
            }
        }
        return sum;
    }

    public void dfs(char[][] grid, boolean[][] visit, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visit[x][y]) {
            return;
        }
        if (grid[x][y] == '1') {
            visit[x][y] = true;
            dfs(grid, visit, x + 1, y);
            dfs(grid, visit, x, y + 1);
            dfs(grid, visit, x - 1, y);
            dfs(grid, visit, x, y - 1);
        }
    }
}
