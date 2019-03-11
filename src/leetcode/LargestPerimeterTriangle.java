package leetcode;

import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/3/11
 * @Version 1.0
 */
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i >1; i--) {
            if (A[i-1]+A[i-2]>A[i]){
                return A[i-1]+A[i-2]+A[i];
            }
        }
        return 0;
    }
}
