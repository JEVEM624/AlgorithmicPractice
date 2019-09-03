package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/8/16
 * @Version 1.0
 */
public class MaxAreaofIsland {
    int[][]dir={{0,1},{0,-1},{-1,0},{1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visit=new boolean[grid.length][grid[0].length];
        int max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max=Math.max(dfs(visit, grid, i, j),max);
            }
        }
        return max;
    }
    int dfs(boolean[][]visit,int[][]grid,int i,int j){
        if (grid[i][j]==0||visit[i][j]){
            return 0;
        }
        int size=1;
        visit[i][j]=true;
        for (int[]ints:dir){
            int x=i+ints[0];
            int y=j+ints[1];
            if (x>=0&&x<grid.length&&y>=0&&y<grid[0].length){
                size=size+dfs(visit, grid, x, y);
            }
        }
        return size;
    }
}
