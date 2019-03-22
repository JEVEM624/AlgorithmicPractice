package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/21
 * @Version 1.0
 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        A=A+A;
        return A.contains(B);
    }
}
