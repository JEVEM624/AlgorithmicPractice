package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/16
 * @Version 1.0
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        new ValidMountainArray().validMountainArray(new int[]{0, 1, 2, 1, 2});
    }

    public boolean validMountainArray(int[] A) {
        boolean flag = true;
        if (A.length < 2) {
            return false;
        }
        if (A[1] < A[0]) {
            return false;
        }
        for (int i = 1; i < A.length; i++) {
            if (!flag && A[i] > A[i - 1]) {
                return false;
            }
            if (A[i] == A[i - 1]) {
                return false;
            }
            if (A[i] > A[i - 1]) {
                continue;
            } else if (flag) {
                flag = false;
            }
        }
        return flag ? false : true;
    }
}
