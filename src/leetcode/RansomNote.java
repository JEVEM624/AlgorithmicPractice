package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/9/2
 * @Version 1.0
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]a=new int[26];
        int[]b=new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            a[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            b[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i]>b[i]){
                return false;
            }
        }
        return true;
    }
}
