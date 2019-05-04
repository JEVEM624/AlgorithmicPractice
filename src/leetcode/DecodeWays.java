package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/4
 * @Version 1.0
 */
public class DecodeWays {
    public static void main(String[] args) {

        System.out.println(new DecodeWays().numDecodings("110"));
    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() < 2) {
            return s.length();
        }
        int[] res = new int[s.length()];

        res[0] = 1;

        for (int i = 1; i < res.length; i++) {
            if (s.charAt(i) == '0' && (s.charAt(i - 1) > '2' || s.charAt(i - 1) == '0')) {
                return 0;
            }
            if (s.charAt(i) == '0') {
                res[i] = i >= 2 ? res[i - 2] : 1;
                continue;
            }
            if ((s.charAt(i) - '0') + (s.charAt(i - 1) - '0') * 10 <= 26 && s.charAt(i - 1) - '0' != 0 && s.charAt(i) - '0' != 0) {
                res[i] = res[i - 1] + (i > 1 ? res[i - 2] : 1);
            } else {
                res[i] = res[i - 1];
            }
        }
        return res[s.length() - 1];
    }
}
