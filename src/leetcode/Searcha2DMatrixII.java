package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/23
 * @Version 1.0
 */
public class Searcha2DMatrixII {
    public static void main(String[] args) {
        System.out.println(new Searcha2DMatrixII().searchMatrix(
                new int[][]{ {1, 4, 7, 11, 15},
                             {2, 5, 8, 12, 19},
                             {3, 6, 9, 16, 22},
                             {10, 13, 14, 17, 24},
                             {18, 21, 23, 26, 30}},
                10));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int k=0;
        int j=matrix[0].length-1;
        while(k<matrix.length&&j>=0){
            if(matrix[k][j]==target){
                return true;
            }
            if(matrix[k][j]>target){
                j--;
            }else {
                k++;
            }
        }
        return false;
    }
}
