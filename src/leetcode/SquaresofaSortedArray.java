package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/11
 * @Version 1.0
 */
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        int[]result=new int[A.length];
        int fir=0;
        int last=A.length-1;
        for (int i = A.length-1; i >-1; i--) {
            if (Math.abs(A[fir])>Math.abs(A[last])){
                result[i]=A[fir]*A[fir];
                fir++;
            }else {
                result[i]=A[last]*A[last];
                last--;
            }
        }
        return result;
    }
}
