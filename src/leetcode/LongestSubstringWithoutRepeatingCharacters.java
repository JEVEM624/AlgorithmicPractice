package leetcode;

import java.util.HashMap;

/**
 * @Author JEVEM624
 * @Date 2019/2/28
 * @Version 1.0
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("aabaab!bb"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap();
        int index = 0;
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                max = Math.max(max, i - index + 1);
                map.put(s.charAt(i), i);
            } else {
                index = Math.max(map.get(s.charAt(i)) + 1, index);
                max = Math.max(max, i - index + 1);
                map.put(s.charAt(i), i);
            }
        }
        return max;
    }
}
