package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/1
 * @Version 1.0
 */
public class NumberofEnclaves {
    public static void main(String[] args) {
        new NumberofEnclaves().numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}});
    }

    public int numEnclaves(int[][] A) {
        int h=A.length;
        int l=A[0].length;
        boolean[][]visit=new boolean[h][l];
        for (int i = 0; i < l; i++) {
            if (A[0][i]==1&&!visit[0][i]){
                visit[0][i]=true;
                helper(A, visit, 0,i+1);
                helper(A, visit, 0,i-1);
                helper(A, visit, 1, i);
            }
            if (A[h-1][i]==1&&!visit[h-1][i]){
                visit[h-1][i]=true;
                helper(A, visit, h-2, i);
                helper(A, visit, h-1, i-1);
                helper(A, visit, h-1, i+1);
            }
        }
        for (int i = 0; i < h; i++) {
            if (A[i][0]==1&&!visit[i][0]){
                visit[i][0]=true;
                helper(A, visit, i, 1);
                helper(A, visit, i+1, 0);
                helper(A, visit, i-1, 0);
            }
            if (A[i][l-1]==1&&!visit[i][l-1]){
                visit[i][l-1]=true;
                helper(A, visit, i, l-2);
                helper(A, visit, i+1, l-1);
                helper(A, visit, i-1, l-1);
            }
        }
        int sum=0;
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A[0].length; j++) {
                if (A[i][j]==1&&!visit[i][j]){
                    sum++;
                }
            }
        }
        return sum;
    }
    public void helper(int[][]A,boolean[][]visit,int h,int l){
        if (h>=A.length||h<0||l>=A[0].length||l<0){
            return;
        }
        if (A[h][l]==1&&!visit[h][l]){
            visit[h][l]=true;
            helper(A, visit, h-1, l);
            helper(A, visit, h+1, l);
            helper(A, visit, h, l-1);
            helper(A, visit, h, l+1);
        }
    }
}
