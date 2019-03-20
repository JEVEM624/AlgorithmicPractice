package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/20
 * @Version 1.0
 */
public class FlippinganImage {
    public static void main(String[] args) {
        new FlippinganImage().flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
    }
    public int[][] flipAndInvertImage(int[][] A) {
        int[][]result=new int[A.length][A[0].length];
        int h=A.length;
        int l=A[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (A[i][l-j-1]==0){
                    result[i][j]=1;
                }else {
                    result[i][j]=0;
                }
            }
        }
        return result;
    }
}
