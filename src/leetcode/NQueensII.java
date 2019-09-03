package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/20
 * @Version 1.0
 */
public class NQueensII {
    int sum=0;
    public int totalNQueens(int n) {
        if(n==1){
            return 1;
        }
        boolean[][] grid = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            grid[0][i]=true;
            dfs(1, grid);
            grid[0][i]=false;
        }
        return sum;
    }

    public void dfs(int layer, boolean[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            if (canPut(layer, i, grid)) {
                grid[layer][i] = true;
                if (layer == grid.length-1) {
                    sum++;
                } else {
                    dfs(layer + 1, grid);
                }
                grid[layer][i] = false;
            }
        }
    }

    public boolean canPut(int i, int j, boolean[][] grid) {
        for (int k = 0; k < i; k++) {
            if (grid[k][j]){
                return false;
            }
        }
        for (int k = i+1; k < grid.length; k++) {
            if (grid[k][j]){
                return false;
            }
        }
        for (int k = 0; k < j; k++) {
            if (grid[i][k]){
                return false;
            }
        }
        for (int k = j+1; k <grid[0].length; k++) {
            if (grid[i][k]){
                return false;
            }
        }
        int x=i,y=j;
        while (x>0&&y>0){
            x--;y--;
            if (grid[x][y]){
                return false;
            }
        }
        x=i;y=j;
        while (x>0&&y<grid[0].length-1){
            x--;y++;
            if (grid[x][y]){
                return false;
            }
        }

        x=i;y=j;
        while (x<grid.length-1&&y<grid[0].length-1){
            x++;y++;
            if (grid[x][y]){
                return false;
            }
        }

        x=i;y=j;
        while (x<grid.length-1&&y>0){
            x++;y--;
            if (grid[x][y]){
                return false;
            }
        }
        return true;
    }
}
