package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/26
 * @Version 1.0
 */
public class PowerofTwo {
    public static void main(String[] args) {
        new PowerofTwo().isPowerOfTwo(2);
    }

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
//        String i = Integer.toBinaryString(n);
//        for (int j = 1; j < i.length(); j++) {
//            if (i.charAt(j) == '1') {
//                return false;
//            }
//        }
        if ((n&(n-1))!=0){
            return false;
        }
        return true;
    }
}
