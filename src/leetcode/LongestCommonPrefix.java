package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/1/27
 * @Version 1.0
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        int minLegnth = 0;
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        minLegnth = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (minLegnth > strs[i].length()) {
                minLegnth = strs[i].length();
            }
        }
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            for (int i = 0; i < minLegnth; i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].charAt(i) != c) {
                        throw new Exception();
                    }
                }
                stringBuffer.append(c);
            }
        } catch (Exception e) {

        }
        return stringBuffer.toString();
    }
}
