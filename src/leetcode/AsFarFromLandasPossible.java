package leetcode;

import sun.java2d.windows.GDIRenderer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/8/19
 * @Version 1.0
 */
public class AsFarFromLandasPossible {
    public static void main(String[] args) {
        new AsFarFromLandasPossible().maxDistance(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
    }
    int[][] p = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int maxDistance(int[][] grid) {
        List<block> list = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    list.add(new block(i, j));
                }
            }
        }
        if (list.size() == 0 || list.size() == grid.length * grid[0].length) {
            return -1;
        }
        int max = 0;
        while (list.size() > 0) {
            max++;
            List<block> tmpList = new LinkedList<>();
            for (block b : list) {
                for (int i = 0; i < p.length; i++) {
                    int x = p[i][0] + b.x;
                    int y = p[i][1] + b.y;
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
                        if (grid[x][y]==0){
                            tmpList.add(new block(x, y));
                            grid[x][y]=1;
                        }
                    }
                }
            }
            list=tmpList;
        }
        return max-1;
    }

    class block {
        int x;
        int y;

        public block(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
