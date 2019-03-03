package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/1
 * @Version 1.0
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome(""));
    }

    public boolean isPalindrome(String s) {
        if (s.length() < 1) {
            return true;
        }
        int last = s.length() - 1;
        int first = 0;
        s = s.toLowerCase();
        while (first < last) {
            if ((s.charAt(first) >= 32 && s.charAt(first) <= 47) ||
                    (s.charAt(first) >= 58 && s.charAt(first) <= 96) ||
                          s.charAt(first) >= 123) {
                first++;
                continue;
            }
            if ((s.charAt(last) >= 32 && s.charAt(last) <= 47) ||
                    (s.charAt(last) >= 58 && s.charAt(last) <= 96) ||
                         s.charAt(last) >= 123) {
                last--;
                continue;
            }
            if (s.charAt(first)==s.charAt(last)){
                first++;
                last--;
            }else{
                return false;
            }
        }
        return true;
    }
}
