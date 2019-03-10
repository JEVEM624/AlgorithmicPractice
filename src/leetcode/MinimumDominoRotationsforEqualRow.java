package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/10
 * @Version 1.0
 */
public class MinimumDominoRotationsforEqualRow {
    public static void main(String[] args) {
        new MinimumDominoRotationsforEqualRow().minDominoRotations(new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2});
    }
    public int minDominoRotations(int[] A, int[] B) {
        int[]Anum=new int[7];
        int[]Bnum=new int[7];
        for (int i = 0; i < A.length; i++) {
            Anum[A[i]]++;
            Bnum[B[i]]++;
        }
        int num=0;
        for (int i = 0; i < 6; i++) {
            if (Anum[i]+Bnum[i]>=A.length){
                num=i;
            }
        }
        if (num==0){
            return  -1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]!=num&&B[i]!=num){
                return -1;
            }
        }
        return A.length-Math.max(Anum[num],Bnum[num]);
    }
}
