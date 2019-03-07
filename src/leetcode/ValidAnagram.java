package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/7
 * @Version 1.0
 */
public class ValidAnagram {
    public static void main(String[] args) {
        new ValidAnagram().isAnagram("ab", "ba");
    }

    public boolean isAnagram(String s, String t) {
        if (s.length()==0&&t.length()==0){
            return true;
        }
        if (s.length()!=t.length()){
            return false;
        }
        int[]first=new int[26];
        int[]sec=new int[26];
        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i)-'a']++;
            sec[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i]!=sec[i]){
                return false;
            }
        }
        return true;
    }
}
