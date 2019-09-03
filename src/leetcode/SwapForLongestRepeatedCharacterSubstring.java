package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/3
 * @Version 1.0
 */
public class SwapForLongestRepeatedCharacterSubstring {
    public static void main(String[] args) {
        new SwapForLongestRepeatedCharacterSubstring().maxRepOpt1("aaabbaaa");
    }

    public int maxRepOpt1(String text) {
        if (text.length() < 2) {
            return text.length();
        }
        if (text.length() == 2) {
            return text.charAt(0) == text.charAt(1) ? 2 : 1;
        }
        int res = 0;
        int[] nc = new int[26];
        int[] sum1 = new int[text.length()];
        int[] sum2 = new int[text.length()];
        nc[text.charAt(0) - 'a']++;
        sum1[0] = 1;
        for (int i = 1; i < text.length(); i++) {
            nc[text.charAt(i) - 'a']++;
            if (text.charAt(i) == text.charAt(i - 1)) {
                sum1[i] = sum1[i - 1] + 1;
            } else {
                sum1[i] = 1;
            }
            res = Math.max(res, sum1[i]);

        }
        sum2[text.length() - 1] = 1;
        for (int i = text.length() - 2; i >= 0; i--) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                sum2[i] = sum2[i + 1] + 1;
            } else {
                sum2[i] = 1;
            }
        }
        for (int i = 2; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                if (nc[text.charAt(i) - 'a'] - sum1[i] > 0) {
                    res = Math.max(res, sum1[i] + 1);
                } else {
                    res = Math.max(res, sum1[i]);
                }
            } else {
                if (text.charAt(i) == text.charAt(i - 2)) {
                    if (nc[text.charAt(i) - 'a'] - sum2[i] - sum1[i - 2] > 0) {
                        res = Math.max(res, sum2[i] + sum1[i - 2] + 1);
                    } else {
                        res = Math.max(res, sum1[i - 2] + sum2[i]);
                    }
                }
            }
        }
        return res;
    }
}
