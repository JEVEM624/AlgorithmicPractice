package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/2
 * @Version 1.0
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean[][]visit=new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visit[i][j]||matrix[i][j]!=0){
                    continue;
                }
                int h=i-1;
                while (h>=0){
                    if (matrix[h][j]==0){
                        h--;
                        continue;
                    }
                    matrix[h][j]=0;
                    visit[h][j]=true;
                    h--;
                }
                h=i+1;
                while (h<matrix.length){
                    if (matrix[h][j]==0){
                        h++;
                        continue;
                    }
                    matrix[h][j]=0;
                    visit[h][j]=true;
                    h++;
                }
                int l=j-1;
                while (l>=0){
                    if (matrix[i][l]==0){
                        l--;
                        continue;
                    }
                    matrix[i][l]=0;
                    visit[i][l]=true;
                    l++;
                }
                l=j+1;
                while (l<matrix[0].length){
                    if (matrix[i][l]==0){
                        l++;
                        continue;
                    }
                    matrix[i][l]=0;
                    visit[i][l]=true;
                    l++;
                }
            }
        }
    }
}
