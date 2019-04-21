package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author JEVEM624
 * @Date 2019/4/21
 * @Version 1.0
 */
public class MatrixCellsinDistanceOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][]map=new int[R*C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i*C+j][0]=i;
                map[i*C+j][1]=j;
            }
        }
        Arrays.sort(map,new Comparator<Object>(){
                    @Override
                    public int compare(Object o1, Object o2) {
                        int[] one = (int[]) o1;
                        int[] two = (int[]) o2;
                        return Math.abs(one[0]-r0)+Math.abs(one[1]-c0)-Math.abs(two[0]-r0)-Math.abs(two[1]-c0);
                    }
                }
        );
        return map;
    }
}
