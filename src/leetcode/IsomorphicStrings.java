package leetcode;

import java.util.Arrays;

/**
 * @Author JEVEM624
 * @Date 2019/3/26
 * @Version 1.0
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[]A=new int[256];
        int[]B=new int[256];
        for (int i = 0; i < s.length(); i++) {
            A[s.charAt(i)]++;
            B[t.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (A[s.charAt(i)]!=B[t.charAt(i)]){
                return false;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i)-s.charAt(i-1)==0&&t.charAt(i)-t.charAt(i-1)!=0)||(s.charAt(i)-s.charAt(i-1)!=0&t.charAt(i)-t.charAt(i-1)==0)){
                return false;
            }
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < 26; i++) {
            if (A[i]!=B[i]){
                return false;
            }
        }

        return true;
    }
}
